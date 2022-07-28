

// Java program to count pairs 
// with XOR giving a odd number 
  
class GFG 
{ 
      
// Function to count  
// number of odd pairs 
static int findOddPair(int A[], 
                       int N) 
{ 
    int i, j; 
  
    // variable for counting  
    // odd pairs 
    int oddPair = 0; 
  
    // find all pairs 
    for (i = 0; i < N; i++) 
    { 
        for (j = i + 1; j < N; j++) 
        { 
  
            // find XOR operation 
            // check odd or even 
            if ((A[i] ^ A[j]) % 2 != 0) 
                oddPair++; 
        } 
      
    } 
  
    // return number  
    // of odd pair 
    return oddPair; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int A[] = { 5, 4, 7, 2, 1 }; 
    int N = A.length; 
  
    // calling function findOddPair 
    // and print number of odd pair 
    System.out.println(findOddPair(A, N));  
} 
} 
  
// This code is contributed  
// by Kirti_Mangal 

