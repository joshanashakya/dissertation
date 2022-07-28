

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the maximum possible xor 
static int maximumXor(int arr[], int n) 
{ 
    Stack<Integer> sForward = new Stack<Integer>(), 
            sBackward = new Stack<Integer>(); 
  
    // To store the final answer 
    int ans = -1; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // Borward traversal 
        while (!sForward.isEmpty() 
            && arr[i] < arr[sForward.peek()])  
        { 
            ans = Math.max(ans, arr[i] ^ arr[sForward.peek()]); 
            sForward.pop(); 
        } 
        sForward.add(i); 
  
        // Backward traversal 
        while (!sBackward.isEmpty() 
            && arr[n - i - 1] < arr[sBackward.peek()])  
        { 
            ans = Math.max(ans, arr[n - i - 1] ^ arr[sBackward.peek()]); 
            sBackward.pop(); 
        } 
  
        sBackward.add(n - i - 1); 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 8, 1, 2 }; 
    int n = arr.length; 
  
    System.out.print(maximumXor(arr, n)); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

