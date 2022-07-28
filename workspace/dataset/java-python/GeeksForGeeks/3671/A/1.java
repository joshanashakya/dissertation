

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
// Function that counts the 
// minimum segments required 
static void CountSegments(int N, int a[]) 
{ 
    // all values are '0' initially 
    int frequency[] =  new int[10001]; 
  
    // count of segments 
    int c = 0; 
  
    // store frequency of every element 
    for (int i = 0; i < N; i++) { 
        frequency[a[i]]++; 
    } 
  
    // find maximum frequency 
    for (int i = 0; i <= 10000; i++) 
        c = Math.max(c, frequency[i]); 
  
    System.out.println( c); 
} 
  
       // Driver code 
    public static void main (String[] args) { 
        int N = 6; 
    int []a = { 1, 3, 4, 3, 2, 3 }; 
  
    CountSegments(N, a); 
    } 
} 
  
// This Code is contributed by inder_verma.. 

