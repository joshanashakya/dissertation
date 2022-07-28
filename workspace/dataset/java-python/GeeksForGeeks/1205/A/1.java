

// Java implementation of the above approach  
import java.util.*; 
  
class GFG 
{ 
  
static int M = 18;  
static int a, b, dp[][][][] = new int[M][90][90][2];  
  
// Prime numbers upto 100  
static int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23,  
                29, 31, 37, 43, 47, 53, 59, 61,  
                67, 71, 73, 79, 83, 89, 97 };  
  
// Function to return the count of  
// required numbers from 0 to num  
static int count(int pos, int even, int odd, int tight,  
        Vector<Integer> num)  
{  
    // Base Case  
    if (pos == num.size())  
    {  
        if ((num.size() & 1) != 0) 
        {  
            int t = odd; 
            odd = even; 
            even = t; 
              
        } 
        int d = even - odd;  
  
        // check if the difference is equal  
        // to any prime number  
        for (int i = 0; i < 24; i++)  
            if (d == prime[i])  
                return 1;  
                  
        return 0;  
    }  
  
    // If this result is already computed  
    // simply return it  
    if (dp[pos][even][odd][tight] != -1)  
        return dp[pos][even][odd][tight];  
  
    int ans = 0;  
  
    // Maximum limit upto which we can place  
    // digit. If tight is 1, means number has  
    // already become smaller so we can place  
    // any digit, otherwise num[pos]  
    int limit = (tight != 0 ? 9 : num.get(pos));  
  
    for (int d = 0; d <= limit; d++)  
    {  
        int currF = tight, currEven = even;  
        int currOdd = odd;  
          
        if (d < num.get(pos))  
            currF = 1;  
  
        // If the current position is odd  
        // add it to currOdd, otherwise to  
        // currEven  
        if ((pos & 1) != 0)  
            currOdd += d;  
        else
            currEven += d;  
              
        ans += count(pos + 1, currEven, currOdd,  
                    currF, num);  
    }  
      
    return dp[pos][even][odd][tight] = ans;  
}  
  
// Function to convert x into its digit vector  
// and uses count() function to return the  
// required count  
static int solve(int x)  
{  
    Vector<Integer> num = new Vector<Integer>();  
      
    while (x != 0)  
    {  
        num.add(x % 10);  
        x /= 10;  
    }  
      
    Collections.reverse(num);  
  
    // Initialize dp  
    for(int i = 0; i < dp.length; i++) 
        for(int j = 0; j < dp[i].length; j++) 
            for(int k = 0; k < dp[i][j].length; k++) 
                for(int k1 = 0; k1 < dp[i][j][k].length; k1++) 
                    dp[i][j][k][k1] = -1; 
      
    return count(0, 0, 0, 0, num);  
}  
  
// Driver Code  
public static void main(String args[])  
{  
    int L = 1, R = 50;  
    System.out.println( solve(R) - solve(L - 1));  
  
    L = 50; R = 100;  
    System.out.println( solve(R) - solve(L - 1));  
}  
} 
  
// This code is contributed by Arnab Kundu 

