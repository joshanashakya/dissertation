

// Java program to count 
// pairs with even OR 
import java.io.*; 
  
class GFG  
{ 
static int findEvenPair(int A[], int N) 
{  
    // Count total even numbers in 
    // array. 
    int count = 0; 
    for (int i = 0; i < N; i++)  
    if ((!((A[i] & 1) > 0))) 
            count++; 
              
    // return count of even pair 
    return count * (count - 1) / 2; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int A[] = { 5, 6, 2, 8 }; 
    int N = A.length; 
    System.out.println(findEvenPair(A, N)); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

