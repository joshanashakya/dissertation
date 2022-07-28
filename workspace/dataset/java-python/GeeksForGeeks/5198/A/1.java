

// Java program to compute sum of all  
// element after doing Xor with itself  
// ( element_time) 
import java.io.*; 
  
class GFG { 
      
    // function return sum of all XOR  
    // element of array 
    static int XorSum(int arr[], int n) 
    { 
        // store result 
        int result = 0; 
      
        // Traverse array element and apply  
        // XOR operation on it 
        for (int i = 0; i < n; i++) { 
              
            // XOR of current element with  
            // itself according to value. 
            int k = 0; 
            for (int j = 1; j <= arr[i]; j++) 
                k ^= arr[i]; 
      
            result += k; 
        } 
          
        return result; 
    } 
      
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 6, 3, 4, 5 }; 
        int n = arr.length; 
        System.out.println(XorSum(arr, n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

