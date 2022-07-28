

// Java program to find sum of 
// diagonals of spiral matrix 
  
class GFG  
{ 
    // function returns sum of diagonals 
    static int spiralDiaSum(int n) 
    { 
        if (n == 1) 
            return 1; 
      
        // as order should be only odd 
        // we should pass only odd-integers 
        return (4 * n * n - 6 * n + 6 +  
                     spiralDiaSum(n - 2)); 
    } 
      
    // Driver program to test 
    public static void main (String[] args)  
    { 
        int n = 7; 
        System.out.print(spiralDiaSum(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

