

// Java implementation of the approach 
public class GFG  
{ 
  
    // Function to return the count of pairs 
    // which satisfy the given condition 
    static int solve(int A[], int B[], int n)  
    { 
        int cnt = 0; 
  
        for (int i = 0; i < n; i++)  
        { 
            for (int j = i; j < n; j++) // Check if the count of set bits 
            // in the AND value is B[j] 
            { 
                if (Integer.bitCount(A[i] & A[j]) == B[j])  
                { 
                    cnt++; 
                } 
            } 
        } 
  
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int A[] = {2, 3, 1, 4, 5}; 
        int B[] = {2, 2, 1, 4, 2}; 
        int size = A.length; 
  
        System.out.println(solve(A, B, size)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

