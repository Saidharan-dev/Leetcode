class Solution {
    public int maxNumberOfBalloons(String text) {
    int b=0,o=0,l=0,a=0,n=0;
    for(char c:text.toCharArray()){
        switch(c){
            case 'b' : 
                b++;
                break;
            case 'a' : 
                a++;
                break;
            case 'l' : 
                l++;
                break;
            case 'o' : 
                o++;
                break;
            case 'n' : 
                n++;
                break;
        }
    }
     l=l/2;
     o=o/2;
     return Math.min(n,Math.min(o,Math.min(Math.min(b,a),l)));
    }
}