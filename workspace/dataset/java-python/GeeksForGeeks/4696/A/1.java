

// Java implementation of above approach 
import java.io.*; 
  
class GFG { 
     
// Function to check if it possible to form 
// rectangles with heights as non-ascending 
 static int rotateRec(int n, int L[], int B[]) 
{ 
  
    // set maximum 
    int m = Integer.MAX_VALUE; 
  
    for (int i = 0; i < n; i++) { 
        // replace the maximum with previous maximum 
        if (Math.max(L[i], B[i]) <= m) 
            m = Math.max(L[i], B[i]); 
  
        // replace the minimum with previous minimum 
        else if (Math.min(L[i], B[i]) <= m) 
            m = Math.min(L[i], B[i]); 
  
        // print NO if the above  
        // two conditions fail at least once 
        else { 
            return 0; 
        } 
    } 
    return 1; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    // initialize the number of rectangles 
    int n = 3; 
  
    // initialize n rectangles with length and breadth 
    int L[] = { 5, 5, 6 }; 
    int B[] = { 6, 7, 8 }; 
    if(rotateRec(n, L, B) == 1) 
     System.out.println( "YES"); 
     else
     System.out.println( "NO"); 
    } 
} 
 // This Code is contributed by inder_verma.. 

