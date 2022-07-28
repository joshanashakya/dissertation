

// Java program for finding number of binary strings 
// number of '0' in first half is double the 
// number of '0' in second half of string 
class GFG { 
      
    // pre define some constant 
    static final long mod = 1000000007; 
    static final long max = 1001; 
      
    // global values for pre computation 
    static long nCr[][] = new long[1003][1003]; 
      
    static void preComputeCoeff() 
    { 
        for (int i = 0; i < max; i++) { 
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) 
                    nCr[i][j] = 1; 
                else
                    nCr[i][j] = (nCr[i - 1][j - 1] +  
                                nCr[i - 1][j]) % mod; 
            } 
        } 
    } 
      
    // function to print number of required string 
    static long computeStringCount(int N) 
    { 
        int n = N / 2; 
        long ans = 0; 
      
        // calculate answer using proposed algorithm 
        for (int i = 2; i <= n; i += 2) 
            ans = (ans + ((nCr[n][i] * nCr[n][i / 2]) 
                        % mod)) % mod; 
        return ans; 
    } 
      
    // main function 
    public static void main(String[] args) 
    { 
        preComputeCoeff(); 
        int N = 3; 
        System.out.println( computeStringCount(N) ); 
          
    } 
} 
  
// This code is contributed by Arnab Kundu. 

