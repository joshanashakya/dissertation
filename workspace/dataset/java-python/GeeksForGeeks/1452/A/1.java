

// Java implmentation of the above approach. 
import java.util.*; 
  
class GFG{ 
  
// Function to find the maximum XOR value 
static int findMaxXOR(Vector<Integer> arr, int n){ 
      
    Vector<Integer> stack = new Vector<Integer>(); 
    int res = 0, l = 0, i; 
  
    // Traversing given array 
    for (i = 0; i < n; i++) { 
  
        // If there are elements in stack 
        // and top of stack is less than 
        // current element then pop the elements 
        while (!stack.isEmpty() && 
                stack.get(stack.size()-1) < arr.get(i)) { 
            stack.remove(stack.size()-1); 
            l--; 
        } 
  
        // Push current element 
        stack.add(arr.get(i)); 
          
        // Increasing length of stack 
        l++; 
        if (l > 1) { 
              
            // Updating the maximum result 
            res = Math.max(res,  
            stack.get(l - 1) ^ stack.get(l - 2)); 
        } 
    } 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // Initializing array 
    Integer []temp = { 9, 8, 3, 5, 7 }; 
    Vector<Integer> arr = new Vector<>(Arrays.asList(temp)); 
    int result1 = findMaxXOR(arr, 5); 
      
    // Reversing the array(vector) 
    Collections.reverse(arr); 
      
    int result2 = findMaxXOR(arr, 5); 
      
    System.out.print(Math.max(result1, result2)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

