

// Java code to check if arrays 
// are permutations of eah other 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to check if arrays 
// are permutaitons of each other. 
static boolean arePermutations(int a[], int b[], int n, int m) 
{ 
  
    int sum1 = 0, sum2 = 0, mul1 = 1, mul2 = 1; 
  
    // Calculating sum and multiply of first array 
    for (int i = 0; i < n; i++) { 
        sum1 += a[i]; 
        mul1 *= a[i]; 
    } 
  
    // Calculating sum and multiply of second array 
    for (int i = 0; i < m; i++) { 
        sum2 += b[i]; 
        mul2 *= b[i]; 
    } 
  
    // If sum and mul of both arrays are equal, 
    // return true, else return false. 
    return ((sum1 == sum2) && (mul1 == mul2)); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int a[] = { 1, 3, 2 }; 
    int b[] = { 3, 1, 2 }; 
  
    int n = a.length; 
    int m = b.length; 
  
    if (arePermutations(a, b, n, m)==true)  
        System.out.println( "Yes"); 
      
    else
        System.out.println( "No"); 
    } 
} 
// This code is contributed by  inder_verma.. 

