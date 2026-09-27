class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] m=new int[nums.length+1];
        for(int num:nums){
            m[num]++;
        }
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=1;i<m.length;i++){
            if(m[i]==0){
                s.add(i);
            }
        }
        return s;
    }
}