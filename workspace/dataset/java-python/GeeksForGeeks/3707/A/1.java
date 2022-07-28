

// Java program to find the number of  
// ways to form the group of peopls  
class GFG 
{ 
      
static int C[][] = new int [1000][1000];  
  
// Function to pre-compute the  
// Combination using DP  
static void binomialCoeff(int n)  
{  
    int i, j;  
  
    // Calculate value of Binomial Coefficient  
    // in bottom up manner  
    for (i = 0; i <= n; i++)  
    {  
        for (j = 0; j <= i; j++)  
        {  
  
            // Base Cases  
            if (j == 0 || j == i)  
                C[i][j] = 1;  
  
            // Calculate value using previously  
            // stored values  
            else
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];  
        }  
    }  
  
    // return C[n][k];  
}  
  
// Function to find the number of ways  
static int numberOfWays(int x, int y, int z)  
{  
    // Function to pre-compute  
    binomialCoeff(Math.max(x, Math.max(y, z)));  
  
    // Sum the Zci  
    int sum = 0;  
    for (int i = 1; i <= z; i++)  
    {  
        sum = (sum + C[z][i]);  
    }  
  
    // Iterate for second position  
    int sum1 = 0;  
    for (int i = 1; i <= y; i++) 
    {  
  
        // Iterate for first position  
        for (int j = i + 1; j <= x; j++) 
        {  
            sum1 = (sum1 + (C[y][i] * C[x][j]));  
        }  
    }  
  
    // Multiply the common Combination value  
    sum1 = (sum * sum1);  
  
    return sum1;  
}  
  
// Driver Code  
public static void main(String args[])  
{  
    int x = 3;  
    int y = 2;  
    int z = 1;  
  
    System.out.println(numberOfWays(x, y, z));  
}  
} 
  
// This code is contributed by Arnab Kundu 

