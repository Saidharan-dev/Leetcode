class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int count=0;
        for(char i:s.toCharArray()){
            if(i=='R'){
                r++;
            }else if(i=='L'){
                l++;
            }
            if(l==r){
                count++;
                l=0;
                r=0;
            }

        }
        return count;
    }
}