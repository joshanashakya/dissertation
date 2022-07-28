

// Java program to find product of all  
// Subsequences of size K except the  
// minimum and maximum Elements 
import java.util.Arrays; 
  
class GFG  
{ 
      
static int MOD= 1000000007; 
static int max =101; 
  
// 2D array to store value of  
// combinations nCr 
static long C[][] = new long[max ][max]; 
  
static long power(long x, long y) 
{ 
    long res = 1; 
    x = x % MOD; 
    while (y > 0) 
    { 
        if (y % 2== 1) 
        { 
            res = (res * x) % MOD; 
        } 
  
        y = y >> 1; 
        x = (x * x) % MOD; 
    } 
    return res % MOD; 
} 
  
// Function to pre-calculate value of all  
// combinations nCr 
static void combi(int n, int k) 
{ 
    int i, j; 
  
    for (i = 0; i <= n; i++) 
    { 
        for (j = 0; j <= Math.min(i, k); j++)  
        { 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
            else
                C[i][j] = (C[i - 1][j - 1] % MOD  
                            + C[i - 1][j] % MOD) % MOD; 
        } 
    } 
} 
  
// Function to calculate product of all subsequences  
// except the minimum and maximum elements 
static long product(long a[], int n, int k) 
{ 
    long ans = 1; 
  
    // Sorting array so that it becomes easy  
    // to calculate the number of times an  
    // element will come in first or last place 
    Arrays.sort(a); 
      
    // An element will occur 'powa' times in total 
    // of which 'powla' times it will be last element 
    // and 'powfa' times it will be first element 
    long powa = C[n - 1][k - 1]; 
  
    for (int i = 0; i < n; i++)  
    { 
        long powla = C[i][k - 1]; 
        long powfa = C[n - i - 1][k - 1]; 
          
        // In total it will come  
        // powe = powa-powla-powfa times 
        long powe = ((powa % MOD) - (powla + powfa) % MOD + MOD) % MOD; 
          
        // Multiplying a[i] powe times using  
        // Fermat Little Theorem under MODulo  
        // MOD for fast exponentiation 
        long mul = power(a[i], powe) % MOD; 
        ans = ((ans % MOD) * (mul % MOD)) % MOD; 
    } 
      
    return ans % MOD; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // pre-calculation of all combinations 
    combi(100, 100); 
  
    long arr[] = { 1, 2, 3, 4 }; 
    int n = arr.length; 
    int k = 3; 
  
    long ans = product(arr, n, k); 
      
    System.out.println(ans); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

