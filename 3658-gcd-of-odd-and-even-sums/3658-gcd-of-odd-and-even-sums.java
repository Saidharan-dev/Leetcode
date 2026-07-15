class Solution {
    private int gcd(int odd,int even){
        if (even == 0)
        return odd;
    return gcd(even, odd % even);
    }
    public int gcdOfOddEvenSums(int n) {
        
        int odd=0;
        int even=0;
      for(int i=0;i<n*2;i++){
     if(i%2==0){
        even+=i;
     }else{
        odd+=i;
     }
     
      }
      System.out.println(odd);
      System.out.println(even);
      int ans=gcd(odd,even);
      return ans;

      
    }
}