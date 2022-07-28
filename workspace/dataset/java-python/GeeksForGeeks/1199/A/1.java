

// Java program to find last digit 
// of nth Fibonacci number 
class GFG 
{ 
    // Function that returns  
    // nth Fibonacci number  
    static long fib(long n) 
    { 
        long F[][] = new long[][] {{1, 1}, {1, 0}}; 
        if (n == 0) 
            return 0; 
        power(F, n - 1); 
  
        return F[0][0]; 
    } 
  
    // Utility function to multiply two 
    // matrices and store result in first. 
    static void multiply(long F[][], long M[][]) 
    { 
        long x = F[0][0] * M[0][0] +  
                 F[0][1] * M[1][0]; 
        long y = F[0][0] * M[0][1] +  
                 F[0][1] * M[1][1]; 
        long z = F[1][0] * M[0][0] +  
                 F[1][1] * M[1][0]; 
        long w = F[1][0] * M[0][1] +  
                 F[1][1] * M[1][1]; 
  
        F[0][0] = x; 
        F[0][1] = y; 
        F[1][0] = z; 
        F[1][1] = w; 
    } 
  
    // Optimized version of power() in method 4  
    static void power(long F[][], long n) 
    { 
        if( n == 0 || n == 1) 
            return; 
        long M[][] = new long[][] {{1, 1}, {1, 0}}; 
  
        power(F, n / 2); 
        multiply(F, F); 
  
        if (n % 2 != 0) 
            multiply(F, M); 
    } 
  
    // Returns last digit of  
    // n'th Fibonacci Number 
    long findLastDigit(long n) 
    { 
        return (fib(n) % 10); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n; 
        GFG ob = new GFG(); 
        n = 1; 
        System.out.println(ob.findLastDigit(n)); 
        n = 61; 
        System.out.println(ob.findLastDigit(n)); 
        n = 7; 
        System.out.println(ob.findLastDigit(n)); 
        n = 67; 
        System.out.println(ob.findLastDigit(n)); 
    } 
} 

