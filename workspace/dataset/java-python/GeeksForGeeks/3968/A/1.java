

// Java program count total  
// number of paths to reach 
// B from B 
import java.io.*; 
  
class GFG  
{ 
      
// Function to count the 
// number of steps in a 
// tetrahedron 
static int countPaths(int n) 
{ 
    // initially coming  
    // to B is B->B 
    int zB = 1; 
  
    // cannot reach A, D or C 
    int zADC = 0; 
  
    // iterate for all steps 
    for (int i = 1; i <= n; i++)  
    { 
  
        // recurrence relation 
        int nzB = zADC * 3; 
  
        int nzADC = (zADC * 2 + zB); 
  
        // memoize previous values 
        zB = nzB; 
        zADC = nzADC; 
    } 
  
    // returns steps 
    return zB; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 3; 
    System.out.println(countPaths(n)); 
} 
} 
  
// This code is contributed by ajit 

