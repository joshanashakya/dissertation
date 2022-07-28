

// Java implementation of the above approach 
class GFG { 
  
    // Function to check if a number is 
    // a perfect Cube or not 
    static boolean isPerfectCube(int x) 
    { 
        int cr = (int)Math.cbrt(x); 
        return (cr * cr * cr == x); 
    } 
  
    static void canBePerfectCube(int N, int K) 
    { 
        if (isPerfectCube(N + K) 
            || isPerfectCube(N - K) == true) 
            System.out.println("Yes"); 
        else
             System.out.println("No"); 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int N = 7; 
        int K = 1; 
        canBePerfectCube(N, K); 
      
        N = 5;  
        K = 4; 
        canBePerfectCube(N, K); 
      
        N = 7; K = 2; 
        canBePerfectCube(N, K); 
      
    } 
} 
  
// This code is contributed by Yash_R 

