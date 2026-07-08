class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int q = queries.length;

        long MOD = 1_000_000_007L;

        long[] prefixSum = new long[n + 1];
        long[] prefixNum = new long[n + 1];
        int[] nonZeroCount = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i];
            prefixNum[i + 1] = prefixNum[i];
            nonZeroCount[i + 1] = nonZeroCount[i];

            if (digit != 0) {
                prefixSum[i + 1] += digit;

                prefixNum[i + 1] =
                    (prefixNum[i] * 10 + digit) % MOD;

                nonZeroCount[i + 1]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            long sum =
                prefixSum[right + 1] - prefixSum[left];

            int digits =
                nonZeroCount[right + 1] - nonZeroCount[left];

            long num =
                (prefixNum[right + 1]
                - prefixNum[left] * pow10[digits]) % MOD;

            if (num < 0) {
                num += MOD;
            }

            ans[i] = (int) ((sum * num) % MOD);
        }

        return ans;
    }
}