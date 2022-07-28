

// A O(Log n) program to find n-th Leonardo 
// number. 
  
class GFG { 
  
    /* Helper function that multiplies 2 matrices  
    F and M of size 2*2, and puts the  
    multiplication result back to F[][] */
    static void multiply(int F[][], int M[][]) 
    { 
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0]; 
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1]; 
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0]; 
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1]; 
        F[0][0] = x; 
        F[0][1] = y; 
        F[1][0] = z; 
        F[1][1] = w; 
    } 
  
    static void power(int F[][], int n) 
    { 
        int i; 
        int M[][] = { { 1, 1 }, { 1, 0 } }; 
  
        // n - 1 times multiply the matrix 
        // to {{1, 0}, {0, 1}} 
        for (i = 2; i <= n; i++) 
            multiply(F, M); 
    } 
  
    static int fib(int n) 
    { 
        int F[][] = { { 1, 1 }, { 1, 0 } }; 
        if (n == 0) 
            return 0; 
        power(F, n - 1); 
        return F[0][0]; 
    } 
  
    static int leonardo(int n) 
    { 
        if (n == 0 || n == 1) 
            return 1; 
        return 2 * fib(n + 1) - 1; 
    } 
  
    public static void main(String args[]) 
    { 
        System.out.println(leonardo(3)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

