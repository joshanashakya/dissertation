

// Java program to count pairs 
// with XOR giving a odd number 
class GFG 
{ 
// Function to count 
// number of odd pairs 
static int findOddPair(int A[],  
                       int N) 
{ 
    int i, count = 0; 
  
    // find all pairs 
    for (i = 0; i < N; i++)  
    { 
        if (A[i] % 2 == 0) 
            count++; 
    } 
  
    // return number of odd pair 
    return count * (N - count); 
} 
  
// Driver Code 
public static void main(String[] arg) 
{ 
    int a[] = { 5, 4, 7, 2, 1 }; 
    int n = a.length ; 
  
    // calling function findOddPair 
    // and print number of odd pair 
    System.out.println(findOddPair(a, n)); 
} 
} 
  
// This code is contributed 
// by Smitha 

