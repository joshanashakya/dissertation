

// Java program to find the maximum sum 
// after rearranging the array for K queries 
import java.util.*; 
  
class GFG 
{ 
       
    // Function to find maximum sum after 
    // rearranging array elements 
    static int maxSumArrangement(int A[], int R[][], 
                          int N, int M) 
    { 
       
        // Auxilary array to find the 
        // count of each selected elements 
        int count[] = new int[N]; 
        int i; 
       
        // Finding count of every element 
        // to be selected 
        for ( i = 0; i < M; ++i) { 
       
            int l = R[i][0], r = R[i][1] + 1; 
       
            // Making it to 0-indexing 
            l--; 
            r--; 
       
            // Prefix sum array concept is used 
            // to obtain the count array 
            count[l]++; 
       
            if (r < N) 
                count[r]--; 
        } 
       
        // Iterating over the count array 
        // to get the final array 
        for (i = 1; i < N; ++i) { 
            count[i] += count[i - 1]; 
        } 
       
        // Variable to store the maximum sum 
        int ans = 0; 
       
        // Sorting both the arrays 
        Arrays.sort( count); 
        Arrays.sort(A); 
       
        // Loop to find the maximum sum 
        for (i = N - 1; i >= 0; --i) { 
            ans += A[i] * count[i]; 
        } 
       
        return ans; 
    } 
       
    // Driver code 
    public static void main(String []args) 
    { 
        int A[] = { 2, 6, 10, 1, 5, 6 }; 
        int R[][] 
            = { { 1, 3 }, { 4, 6 }, { 3, 4 } }; 
       
        int N = A.length; 
        int M = R.length; 
       
        System.out.print(maxSumArrangement(A, R, N, M)); 
       
    } 
} 
  
// This code is contributed by chitranayal 

