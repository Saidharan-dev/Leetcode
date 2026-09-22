class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       int[] d=new int[nums.length];
       int c=0;
        for(int i=nums.length-k;i<nums.length;i++){
            d[c++]=nums[i];
        }
        int l=0;
        for(int m=c;m<nums.length;m++){
            d[m]=nums[l++];
        }
        for(int z=0;z<nums.length;z++){
            nums[z]=d[z];
        }
        
    }
}