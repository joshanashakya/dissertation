

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the extra  
    // element in B[]  
    static int extraElement(int A[], int B[], int n)  
    {  
      
        // To store the result  
        int ans = 0;  
      
        // Find the XOR of all the element  
        // of array A[] and array B[]  
        for (int i = 0; i < n; i++)  
            ans ^= A[i];  
        for (int i = 0; i < n + 1; i++)  
            ans ^= B[i];  
      
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int A[] = { 10, 15, 5 };  
        int B[] = { 10, 100, 15, 5 };  
        int n = A.length;  
      
        System.out.println(extraElement(A, B, n));  
    }  
} 
  
// This code is contributed by kanugargng 

