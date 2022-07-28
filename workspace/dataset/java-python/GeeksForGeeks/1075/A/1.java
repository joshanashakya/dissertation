

// Java program for above implementation 
import java.util.*; 
  
class GfG  
{ 
  
    // Function to check validity of stack sequence  
    static boolean validateStackSequence(int pushed[], 
                                        int popped[], int len)  
    { 
  
        // maintain count of popped elements  
        int j = 0; 
  
        // an empty stack  
        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < len; i++)  
        { 
            st.push(pushed[i]); 
  
            // check if appended value  
            // is next to be popped out  
            while (!st.empty() && j < len &&  
                    st.peek() == popped[j])  
            { 
                st.pop(); 
                j++; 
            } 
        } 
  
        return j == len; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int pushed[] = {1, 2, 3, 4, 5}; 
        int popped[] = {4, 5, 3, 2, 1}; 
        int len = pushed.length; 
  
        System.out.println((validateStackSequence(pushed, popped, len) ? "True" : "False")); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

