

// Java code to count number in the range 
// having the sum of even digits greater 
// than the sum of odd digits 
import java.util.*; 
  
class GFG 
{ 
  
    static Vector<Integer> v = new Vector<>(); 
  
    static int[][][][] dp = new int[18][180][180][2]; 
  
    static int memo(int index, int evenSum, 
    int oddSum, int tight) 
    { 
        // Base Case 
  
        if (index == v.size())  
        { 
            // check if condition satisfied or not 
            if (evenSum > oddSum)  
            { 
                return 1; 
            }  
            else
            { 
                return 0; 
            } 
        } 
  
        // If this result is already computed 
        // simply return it 
        if (dp[index][evenSum][oddSum][tight] != -1)  
        { 
            return dp[index][evenSum][oddSum][tight]; 
        } 
  
        // Maximum limit upto which we can place 
        // digit. If tight is 0, means number has 
        // already become smaller so we can place 
        // any digit, otherwise num[pos] 
        int limit = (tight > 0) ? v.get(index) : 9; 
  
        int ans = 0; 
  
        for (int d = 0; d <= limit; d++)  
        { 
            int currTight = 0; 
  
            if (d == v.get(index))  
            { 
                currTight = tight; 
            } 
  
            // if current digit is odd 
            if (d % 2 != 0)  
            { 
                ans += memo(index + 1, evenSum, 
                        oddSum + d, currTight); 
            } // if current digit is even 
            else
            { 
                ans += memo(index + 1, evenSum + d, 
                        oddSum, currTight); 
            } 
        } 
  
        dp[index][evenSum][oddSum][tight] = ans; 
        return ans; 
    } 
    // Function to convert n into its 
    // digit vector and uses memo() function 
    // to return the required count 
  
    static int CountNum(int n)  
    { 
        v.clear(); 
        while (n > 0)  
        { 
            v.add(n % 10); 
            n = n / 10; 
        } 
  
        Collections.reverse(v); 
  
        // Initialize DP 
        for (int i = 0; i < 18; i++) 
        { 
            for (int j = 0; j < 180; j++)  
            { 
                for (int k = 0; k < 180; k++)  
                { 
                    for (int l = 0; l < 2; l++) 
                    { 
                        dp[i][j][k][l] = -1; 
                    } 
                } 
            } 
        } 
  
        return memo(0, 0, 0, 1); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int L, R; 
        L = 2; 
        R = 10; 
        System.out.println(CountNum(R) - CountNum(L - 1)); 
  
    } 
} 
  
// This code is contributed by Princi Singh 

