

// Java implementation of the approach 
  
import java.io.*; 
import java.util.*; 
class GFG { 
  
  
static int PointInKSquares(int n, int a[], int k) 
{ 
    Arrays.sort(a); 
    return a[n - k]; 
} 
  
// Driver Program to test above function 
  
    public static void main (String[] args) { 
            int k = 2; 
    int []a = { 1, 2, 3, 4 }; 
    int n = a.length; 
  
    int x = PointInKSquares(n, a, k); 
    System.out.println( "(" + x + ", " + x +")"); 
  
      
    } 
} 
// This code is contributed by anuj_67.. 

