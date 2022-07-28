

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
// compute number of different bits 
static void solve(int A, int B) 
{ 
    int count = 0; 
  
    // since, the numbers are less than 2^31 
    // run the loop from '0' to '31' only 
    for (int i = 0; i < 32; i++) { 
  
        // right shift both the numbers by 'i' and 
        // check if the bit at the 0th position is different 
        if (((A >> i) & 1) != ((B >> i) & 1)) { 
            count++; 
        } 
    } 
  
    System.out.println("Number of different bits : " + count); 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        int A = 12, B = 15; 
  
    // find number of different bits 
    solve(A, B); 
  
    } 
} 
// this code is contributed by anuj_67.. 

