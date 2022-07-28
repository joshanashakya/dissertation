

// Java code to  
// find nth fibonacci 
  
class GFG 
{ 
      
// get second MSB 
static int getMSB(int n) 
{ 
    // consectutively set 
    // all the bits 
    n |= n >> 1; 
    n |= n >> 2; 
    n |= n >> 4; 
    n |= n >> 8; 
    n |= n >> 16; 
  
    // returns the 
    // second MSB 
    return ((n + 1) >> 2); 
} 
  
// Multiply function 
static void multiply(int F[][],  
                     int M[][]) 
{ 
    int x = F[0][0] * M[0][0] + 
            F[0][1] * M[1][0]; 
    int y = F[0][0] * M[0][1] + 
            F[0][1] * M[1][1]; 
    int z = F[1][0] * M[0][0] +  
            F[1][1] * M[1][0]; 
    int w = F[1][0] * M[0][1] +  
            F[1][1] * M[1][1]; 
  
    F[0][0] = x; 
    F[0][1] = y; 
    F[1][0] = z; 
    F[1][1] = w; 
} 
  
// Function to calculate F[][] 
// raise to the power n 
static void power(int F[][],  
                  int n) 
{ 
    // Base case 
    if (n == 0 || n == 1) 
        return; 
  
    // take 2D array to 
    // store number's 
    int[][] M ={{1, 1},  
                {1, 0}}; 
  
    // run loop till MSB > 0 
    for (int m = getMSB(n); 
             m > 0; m = m >> 1)  
    { 
        multiply(F, F); 
  
        if ((n & m) > 0)  
        { 
            multiply(F, M); 
        } 
    } 
} 
  
// To return  
// fibonacci numebr 
static int fib(int n) 
{ 
    int[][] F = {{1, 1},     
                 {1, 0}}; 
    if (n == 0) 
        return 0; 
    power(F, n - 1); 
    return F[0][0]; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // Given n 
    int n = 6; 
  
    System.out.println(fib(n)); 
} 
} 
  
// This code is contributed  
// by mits 

