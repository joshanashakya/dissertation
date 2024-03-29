

// Recursive Java program to find maximum 
import java.util.*; 
  
class GFG { 
      
    // function to return maximum element using recursion 
    public static int findMaxRec(int A[], int n) 
    { 
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return A[0]; 
          
        return Math.max(A[n-1], findMaxRec(A, n-1)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int A[] = {1, 4, 45, 6, -50, 10, 2}; 
        int n = A.length; 
          
        // Function calling 
        System.out.println(findMaxRec(A, n)); 
    } 
} 
  
//This code is contributed by Niraj_Pandey 

