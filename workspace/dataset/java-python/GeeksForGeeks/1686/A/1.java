

// Java program to count pairs 
// with odd OR 
class GFG 
{ 
// Function to count pairs with odd OR 
static int findOddPair(int A[], int N) 
{ 
    int oddPair = 0; 
    for (int i = 0; i < N; i++)  
    { 
        for (int j = i + 1; j < N; j++) 
        { 
  
            // find OR operation 
            // check odd or odd 
            if ((A[i] | A[j]) % 2 != 0) 
                oddPair++; 
        } 
    } 
  
    // return count of odd pair 
    return oddPair; 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int A[] = { 5, 6, 2, 8 }; 
  
    int N = A.length; 
  
    System.out.println(findOddPair(A, N)); 
} 
} 
  
// This code is contributed by ANKITRAI1 

