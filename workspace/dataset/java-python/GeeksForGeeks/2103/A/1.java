

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static final int MAX = 100005; 
static final int MOD = 1000000007; 
  
// To store the states of the dp 
static int [][][]dp = new int[MAX][101][2]; 
  
// Function to return the count of numbers 
// from the range [0, n] whose digit sum 
// is a multiple of k using bottom-up dp 
static int countNum(int idx, int sum, int tight, 
            Vector<Integer> num, int len, int k) 
{ 
    if (len == idx)  
    { 
        if (sum == 0) 
            return 1; 
        else
            return 0; 
    } 
    if (dp[idx][sum][tight] != -1) 
        return dp[idx][sum][tight]; 
    int res = 0, limit; 
  
    // The digit in this index can 
    // only be from [0, num[idx]] 
    if (tight == 0)  
    { 
        limit = num.get(idx); 
    } 
  
    // The digit in this index can 
    // be anything from [0, 9] 
    else
    { 
        limit = 9; 
    } 
    for (int i = 0; i <= limit; i++) 
    { 
  
        // new_tight is the flag value 
        // for the next position 
        int new_tight = tight; 
        if (tight == 0 && i < limit) 
            new_tight = 1; 
        res += countNum(idx + 1, 
                        (sum + i) % k, new_tight, 
                        num, len, k); 
        res %= MOD; 
    } 
  
    // res can't be negative 
    if (res < 0) 
        res += MOD; 
    return dp[idx][sum][tight] = res; 
} 
  
// Function to process the String to 
// a vector of digits from MSD to LSD 
static Vector<Integer> process(String s) 
{ 
    Vector<Integer> num = new Vector<Integer>(); 
    for (int i = 0; i < s.length(); i++) 
    { 
        num.add(s.charAt(i) - '0'); 
    } 
    return num; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    // For large input number n 
    String n = "98765432109876543210"; 
  
    // Total number of digits in n 
    int len = n.length(); 
  
    int k = 58; 
  
    // Clean dp table 
    for(int i = 0; i < MAX; i++) 
    { 
        for(int j = 0; j < 101; j++) 
        { 
            for(int l = 0; l < 2; l++) 
            dp[i][j][l] = -1; 
        } 
    } 
  
    // Process the String to a vector 
    // of digits from MSD to LSD 
    Vector<Integer> num = process(n); 
  
    System.out.print(countNum(0, 0, 0, num, len, k)); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

