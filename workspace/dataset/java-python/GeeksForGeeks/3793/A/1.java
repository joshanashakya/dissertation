

// Java program to find the minimum steps  
// to reach end from start by performing  
// multiplications and mod operations with array elements  
  
import java.util.Arrays; 
import java.util.LinkedList; 
import java.util.Queue; 
  
class GFG { 
  
// Function that returns the minimum operations  
    static int minimumMulitplications(int start, int end, int a[], int n) { 
        // array which stores the minimum steps  
        // to reach i from start  
        int ans[] = new int[100001]; 
  
        // -1 indicated the state has not been visited  
        Arrays.fill(ans, -1); 
        int mod = 100000; 
  
        // queue to store all possible states  
        Queue<Integer> q = new LinkedList<>(); 
  
        // initially push the start  
        q.add(start % mod); 
  
        // to reach start we require 0 steps  
        ans[start] = 0; 
  
        // till all states are visited  
        while (!q.isEmpty()) { 
  
            // get the topmost element in the queue  
            int top = q.peek(); 
  
            // pop the topmost element  
            q.remove(); 
  
            // if the topmost element is end  
            if (top == end) { 
                return ans[end]; 
            } 
  
            // perform multiplication with all array elements  
            for (int i = 0; i < n; i++) { 
                int pushed = top * a[i]; 
                pushed = pushed % mod; 
  
                // if not visited, then push it to queue  
                if (ans[pushed] == -1) { 
                    ans[pushed] = ans[top] + 1; 
                    q.add(pushed); 
                } 
            } 
        } 
        return -1; 
    } 
  
// Driver Code  
    public static void main(String args[]) { 
        int start = 7, end = 66175; 
        int a[] = {3, 4, 65}; 
        int n = a.length; 
  
        // Calling function  
        System.out.println(minimumMulitplications(start, end, a, n)); 
  
    } 
} 
  
// This code is contributed by PrinciRaj19992 

