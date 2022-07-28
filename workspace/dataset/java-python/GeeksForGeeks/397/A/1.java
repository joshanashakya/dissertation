

// Java implementation to find XOR of  
// pairwise sum of every unordered 
// pairs in an array 
class GFG{ 
   
// Function to find XOR of pairwise  
// sum of every unordered pairs 
static int xorOfSum(int a[], int n) 
{ 
    int answer = 0; 
       
    // Loop to choose every possible 
    // pairs in the array 
    for (int i = 0; i < n; i++) { 
        for (int j = i + 1; j < n; j++) 
            answer ^= (a[i] + a[j]); 
    } 
   
    return answer; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 3; 
    int A[] = { 1, 2, 3 }; 
   
    System.out.print(xorOfSum(A, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

