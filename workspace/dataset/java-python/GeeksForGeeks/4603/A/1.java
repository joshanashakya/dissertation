

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return the Nth number of 
    // the modified Fibonacci series where 
    // A and B are the first two terms 
    static int findNthNumber(int A, int B, int N)  
    { 
  
        // To store the current element which 
        // is the sum of previous two 
        // elements of the series 
        int sum = 0; 
  
        // This loop will terminate when 
        // the Nth element is found 
        for (int i = 2; i < N; i++) 
        { 
            sum = A + B; 
  
            A = B; 
  
            B = sum; 
        } 
  
        // Return the Nth element 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int A = 5, B = 7, N = 10; 
  
        System.out.println(findNthNumber(A, B, N)); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

