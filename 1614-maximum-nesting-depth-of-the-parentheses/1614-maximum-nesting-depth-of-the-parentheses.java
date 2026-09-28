import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int maxDepth(String s) {
        
        int left=0;
        int right=0;
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                left++;
            }
            else if(i==')'){
                right++;
            }
            max=Math.max(max,left-right);
        }
        return max;
    }
}

// Recommended modern approach
// Deque<String> stack = new ArrayDeque<>();
// stack.push("First");
// stack.push("Second");
// System.out.println(stack.pop()); // Outputs: Second   