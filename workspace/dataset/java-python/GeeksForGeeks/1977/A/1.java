

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of pairs 
// which satisfy the given condition 
static int solve(int A[], int B[], int n) 
{ 
    int cnt = 0; 
  
    for (int i = 0; i < n; i++) 
        for (int j = i; j < n; j++) 
  
            // Check if the count of set bits 
            // in the OR value is B[j] 
            if (Integer.bitCount(A[i] | A[j]) == B[j]) 
            { 
                cnt++; 
            } 
  
    return cnt; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int A[] = { 5, 3, 2, 4, 6, 1 }; 
    int B[] = { 2, 2, 1, 4, 2, 3 }; 
    int size = A.length; 
  
    System.out.println(solve(A, B, size)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

