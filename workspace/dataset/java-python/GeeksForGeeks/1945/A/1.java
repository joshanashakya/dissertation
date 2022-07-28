

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
    // Function to return the maximum sum of the  
    // square of the sum of two subsets of an array  
    static int maxSquareSubsetSum(int []A, int N)  
    {  
        // Initialize variables to store  
        // the sum of subsets  
        int sub1 = 0, sub2 = 0;  
      
        // Sorting the array  
        Arrays.sort(A);  
      
        // Loop through the array  
        for (int i = 0; i < N; i++)  
        {  
      
            // Sum of the first subset  
            if (i < (N / 2) - 1)  
                sub1 += A[i];  
      
            // Sum of the second subset  
            else
                sub2 += A[i];  
        }  
      
        // Return the maximum sum of  
        // the square of the sum of subsets  
        return sub1 * sub1 + sub2 * sub2;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 7, 2, 13, 4, 25, 8 };  
        int N = arr.length;  
      
        System.out.println(maxSquareSubsetSum(arr, N)); 
    }  
} 
  
// This code is contributed by AnkitRai01 

