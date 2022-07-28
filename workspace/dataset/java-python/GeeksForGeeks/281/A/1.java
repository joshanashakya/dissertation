

// Java  program to find the number of array elements 
// which can be derived by perming (+A, -A, +B, -B) 
// operations on D 
  
import java.io.*; 
  
class GFG { 
      
  
  
// Function to return 
// gcd of a and b 
 static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
/* Function to Return the number of elements 
of arr[] which can be derived from D by  
performing (+A, -A, +B, -B) */
static int findPossibleDerivables(int arr[], int n, int D,  
                                    int A, int B) 
{ 
    // find the gcd of A and B 
    int gcdAB = gcd(A, B); 
  
    // counter stores the number of  
    // array elements which 
    // can be derived from D 
    int counter = 0; 
  
    for (int i = 0; i < n; i++) { 
        // arr[i] can be derived from D only if 
        // |arr[i] - D| is divisible by gcd of A and B 
        if ((Math.abs(arr[i] - D) % gcdAB) == 0) { 
            counter++; 
        } 
    } 
  
    return counter; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
            int arr[] = { 1, 2, 3, 4, 7, 13 }; 
    int n = arr.length; 
    int D = 5, A = 4, B = 2; 
    System.out.println( findPossibleDerivables(arr, n, D, A, B)); 
  
    int a[] = { 1, 2, 3 }; 
    n = a.length; 
    D = 6; 
    A = 3; 
    B = 2; 
    System.out.println( findPossibleDerivables(a, n, D, A, B)); 
    } 
} 
// This code is contributed by anuj_67.. 

