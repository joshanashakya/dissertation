

// Java program to find the count of  
// numbers in a range where the number  
// does not contain more than K non  
// zero digits 
import java.util.Collections; 
import java.util.Vector; 
  
class GFG  
{ 
    static int M = 20; 
  
    // states - position, first digit, 
    // last digit, tight 
    static int[][][][] dp = new int[M][M][M][2]; 
  
    // This function returns the count of 
    // required numbers from 0 to num 
    static int count(int pos, int firstD,  
                     int lastD, int tight,  
                     Vector<Integer> num)  
    { 
  
        // Last position 
        if (pos == num.size()) 
        { 
  
            // If first digit is equal to 
            // last digit 
            if (firstD == lastD) 
                return 1; 
            return 0; 
        } 
  
        // If this result is already computed 
        // simply return it 
        if (dp[pos][firstD][lastD][tight] != -1) 
            return dp[pos][firstD][lastD][tight]; 
        int ans = 0; 
  
        // Maximum limit upto which we can place 
        // digit. If tight is 1, means number has 
        // already become smaller so we can place 
        // any digit, otherwise num[pos] 
        int limit = (tight == 1 ? 9 : num.elementAt(pos)); 
  
        for (int dig = 0; dig <= limit; dig++) 
        { 
            int currFirst = firstD; 
  
            // If the position is 0, current 
            // digit can be first digit 
            if (pos == 0) 
                currFirst = dig; 
  
            // In current call, if the first 
            // digit is zero and current digit 
            // is nonzero, update currFirst 
            if (currFirst == 0 && dig != 0) 
                currFirst = dig; 
  
            int currTight = tight; 
  
            // At this position, number becomes 
            // smaller 
            if (dig < num.elementAt(pos)) 
                currTight = 1; 
  
            // Next recursive call, set last 
            // digit as dig 
            ans += count(pos + 1, currFirst,  
                         dig, currTight, num); 
        } 
        return dp[pos][firstD][lastD][tight] = ans; 
    } 
  
    // This function converts a number into its 
    // digit vector and uses above function to  
    // compute the answer 
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
        for (int i = 0; i < M; i++) 
            for (int j = 0; j < M; j++) 
                for (int k = 0; k < M; k++) 
                    for (int l = 0; l < 2; l++) 
                        dp[i][j][k][l] = -1; 
  
        return count(0, 0, 0, 0, num); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int L = 2, R = 60; 
        System.out.println(solve(R) - solve(L - 1)); 
  
        L = 1; 
        R = 1000; 
        System.out.println(solve(R) - solve(L - 1)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

