

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
      
// Function to return the maximum elements  
// in which absolute difference of any pair  
// does not exceed K  
static int maxCount(int A[], int N, int K)  
{  
    int maximum = 0;  
    int i = 0, j = 0;  
    int start = 0;  
    int end = 0;  
  
    // Sort the Given array  
    Arrays.sort(A);  
  
    // Find max elements  
    for (i = 0; i < N; i++) 
    {  
  
        // Count all elements which are in range  
        // A[i] to A[i] + K  
        while (j < N && A[j] <= A[i] + K)  
            j++;  
        if (maximum < (j - i))  
        {  
            maximum = (j - i);  
            start = i;  
            end = j;  
        }  
    }  
  
    // Return the max count  
    return maximum;  
}  
  
// Driver code  
public static void main(String[] args) 
{ 
    int A[] = { 1, 26, 17, 12, 15, 2 };  
    int N = A.length;  
    int K = 5;  
    System.out.println(maxCount(A, N, K)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

