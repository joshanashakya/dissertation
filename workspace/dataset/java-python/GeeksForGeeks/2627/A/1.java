

//java program to find n-th term of 
// the series 2, 12, 36, 80, 150, .. 
import java.util.*; 
  
class GFG 
{ 
    // Returns n-th term of the series 
    // 2, 12, 36, 80, 150 
    public static int nthTerm(int n) 
    { 
        return (n * n) + (n * n * n); 
    } 
      
    // Driver code  
    public static void main(String[] args) 
    { 
        int n = 4; 
        System.out.print(nthTerm(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

