

// Java program to find sum of n-th terms 
// of a Fibonacci like series formed using 
// first two terms of two arrays. 
  
public class GFG { 
  
    static int sumNth(int A[], int B[], int m, int n) 
    { 
  
        int res = 0; 
  
        // if sum of first term is required 
        if (n == 1) { 
            for (int i = 0; i < m; i++) 
                res = res + A[i]; 
        } 
  
        // if sum of second term is required 
        else if (n == 2) { 
            for (int i = 0; i < m; i++) 
                res = res + B[i] * m; 
        } 
  
        else { 
            // fibonacci series used to find the 
            // nth term of every series 
            int f[] = new int[n]; 
            f[0] = 0; 
            f[1] = 1; 
            for (int i = 2; i < n; i++) 
                f[i] = f[i - 1] + f[i - 2]; 
  
            for (int i = 0; i < m; i++) { 
  
                // as every b[i] term appears m times and 
                // every a[i] term also appears m times 
                res = res + (m * (B[i] * f[n - 1])) +  
                            (m * (A[i] * f[n - 2])); 
            } 
        } 
  
        return res; 
    } 
  
  
    public static void main(String args[]) 
    { 
         // m is the size of the array 
        int A[] = { 1, 2, 3 }; 
        int B[] = { 4, 5, 6 }; 
        int n = 3; 
        int m = A.length; 
        System.out.println(sumNth(A, B, m, n)); 
  
    } 
    // This code is contributed by ANKITRAI1 
} 

