

// Java Program to find the count of  
// numbers in a range divisible by m  
// having digit d at even positions 
  
import java.util.*; 
  
class GFG  
{ 
  
    static int M = 20; 
  
    // states - position, rem, tight 
    static Integer[][][] dp = new Integer[M][M][2]; 
  
    // d is required digit and number should 
    // be divisible by m 
    static int d, m; 
  
    // This function returns the count of 
    // required numbers from 0 to num 
    static int count(int pos, int rem, int tight, 
                            Vector<Integer> num) 
    { 
  
        // Last position 
        if (pos == num.size())  
        { 
            if (rem == 0) 
                return 1; 
            return 0; 
        } 
  
        // If this result is already computed 
        // simply return it 
        if (dp[pos][rem][tight] != -1) 
            return dp[pos][rem][tight]; 
  
        // If the current position is even, place 
        // digit d, but since we have considered 
        // 0-indexing, check for odd positions 
        if (pos % 2 == 1) 
        { 
            if (tight == 0 && d > num.elementAt(pos)) 
                return 0; 
  
            int currTight = tight; 
  
            // At this position, number becomes 
            // smaller 
            if (d < num.elementAt(pos)) 
                currTight = 1; 
  
            int res = count(pos + 1, (10 * rem + d) % m, 
                                        currTight, num); 
            return dp[pos][rem][tight] = res; 
        } 
  
        int ans = 0; 
  
        // Maximum limit upto which we can place 
        // digit. If tight is 1, means number has 
        // already become smaller so we can place 
        // any digit, otherwise num[pos] 
        int limit = (tight != 0) ? 9 : num.elementAt(pos); 
        for (int dig = 0; dig <= limit; dig++)  
        { 
  
            if (dig == d) 
                continue; 
  
            int currTight = tight; 
  
            // At this position, number becomes 
            // smaller 
            if (dig < num.elementAt(pos)) 
                currTight = 1; 
  
            // Next recursive call, also set nonz 
            // to 1 if current digit is non zero 
            ans += count(pos + 1, (10 * rem + dig) % m, 
                                        currTight, num); 
        } 
        return dp[pos][rem][tight] = ans; 
    } 
  
    // Function to convert x into its digit vector 
    // and uses count() function to return the 
    // required count 
    static int solve(int x) 
    { 
        Vector<Integer> num = new Vector<>(); 
        while (x > 0) 
        { 
            num.add(x % 10); 
            x /= 10; 
        } 
        Collections.reverse(num); 
  
        // Initialize dp 
        for (int i = 0; i < dp.length; i++) 
            for (int j = 0; j < dp[i].length; j++) 
                for (int k = 0; k < dp[i][j].length; k++) 
                    dp[i][j][k] = -1; 
  
        return count(0, 0, 0, num); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int L = 10, R = 99; 
        d = 8; 
        m = 2; 
        System.out.println(solve(R) - solve(L)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

