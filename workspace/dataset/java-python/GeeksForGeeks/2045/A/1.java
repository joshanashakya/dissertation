

// Java program to find sum of all numbers  
// formed having 4 atmost X times, 5 atmost  
// Y times and 6 atmost Z times  
      
class GFG  
{ 
      
    static int N = 101;  
    static int mod = (int)1e9 + 7;  
      
    // exactsum[i][j][k] stores the sum of  
    // all the numbers having exact  
    // i 4's, j 5's and k 6's  
    static int exactsum[][][] = new int[N][N][N];  
      
    // exactnum[i][j][k] stores numbers  
    // of numbers having exact  
    // i 4's, j 5's and k 6's  
    static int exactnum[][][] = new int[N][N][N];  
      
    // Utility function to calculate the  
    // sum for x 4's, y 5's and z 6's  
    static int getSum(int x, int y, int z)  
    {  
        int ans = 0;  
        exactnum[0][0][0] = 1;  
        for (int i = 0; i <= x; ++i) 
        {  
            for (int j = 0; j <= y; ++j)  
            {  
                for (int k = 0; k <= z; ++k)  
                {  
      
                    // Computing exactsum[i][j][k]  
                    // as explained above  
                    if (i > 0) 
                    {  
                        exactsum[i][j][k]  
                        += (exactsum[i - 1][j][k] * 10 
                        + 4 * exactnum[i - 1][j][k]) % mod;  
                          
                        exactnum[i][j][k]  
                        += exactnum[i - 1][j][k] % mod;  
                    }  
                    if (j > 0) 
                    {  
                        exactsum[i][j][k]  
                        += (exactsum[i][j - 1][k] * 10 
                        + 5 * exactnum[i][j - 1][k]) % mod;  
                          
                        exactnum[i][j][k]  
                        += exactnum[i][j - 1][k] % mod;  
                    }  
                    if (k > 0) 
                    {  
                        exactsum[i][j][k]  
                        += (exactsum[i][j][k - 1] * 10 
                        + 6 * exactnum[i][j][k - 1]) % mod;  
                          
                        exactnum[i][j][k]  
                        += exactnum[i][j][k - 1] % mod;  
                    }  
      
                    ans += exactsum[i][j][k] % mod;  
                    ans %= mod;  
                }  
            }  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int x = 1, y = 1, z = 1;  
      
        System.out.println(getSum(x, y, z) % mod);  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

