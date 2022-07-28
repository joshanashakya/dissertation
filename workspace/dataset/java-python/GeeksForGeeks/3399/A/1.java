

// Java implementation of above approach 
  
class GFG{ 
// Function to find minimum operations 
// required to make array beautiful 
static int minOperations(int[] A, int n) 
{ 
    if ((n & 1)>0) 
        return -1; 
  
    int zeros = 0, consZeros = 0, ones = 0; 
  
    for (int i = 0; i < n; ++i) { 
        if(A[i] == 0) zeros++; else  ones++; 
  
        // counting consecutive zeros. 
        if (i + 1 < n) { 
            if (A[i] == 0 && A[i + 1] == 0) 
                consZeros++; 
        } 
    } 
  
    // check that start and end are same 
    if (A[0] == A[n - 1] && A[0] == 0) 
        consZeros++; 
  
    // check is zero and one are equal 
    if (zeros == ones) 
        return consZeros; 
    else
        return -1; 
} 
  
// Driver program 
public static void main(String[] args) 
{ 
    int[] A =new int[] { 1, 1, 0, 0 }; 
    int n = A.length; 
  
    System.out.println(minOperations(A, n)); 
  
} 
} 
// This code is contributed by mits 

