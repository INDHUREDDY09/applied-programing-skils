import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int ast : asteroids) {
            boolean exploded = false;

           
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int top = stack.peek();

                if (Math.abs(top) < Math.abs(ast)) {
                    
                    stack.pop();
                } else if (Math.abs(top) == Math.abs(ast)) {
                   
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                   
                    exploded = true;
                    break;
                }
            }

           
            if (!exploded) {
                stack.push(ast);
            }
        }

        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}