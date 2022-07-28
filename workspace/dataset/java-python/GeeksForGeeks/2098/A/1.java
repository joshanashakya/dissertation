

// Java Program to find the count of 
// numbers in a range where digit d 
// occurs exactly K times 
import java.util.*; 
class Solution 
{ 
static final int M = 20; 
   
// states - position, count, tight, nonz 
static int dp[][][][]= new int[M][M][2][2]; 
   
// d is required digit and K is occurrence 
static int d, K; 
   
// This function returns the count of 
// required numbers from 0 to num 
static int count(int pos, int cnt, int tight, 
          int nonz, Vector<Integer> num) 
{ 
    // Last position 
    if (pos == num.size()) { 
        if (cnt == K) 
            return 1; 
        return 0; 
    } 
   
    // If this result is already computed 
    // simply return it 
    if (dp[pos][cnt][tight][nonz] != -1) 
        return dp[pos][cnt][tight][nonz]; 
   
    int ans = 0; 
   
    // Maximum limit upto which we can place 
    // digit. If tight is 1, means number has 
    // already become smaller so we can place 
    // any digit, otherwise num[pos] 
    int limit = ((tight !=0)? 9 : num.get(pos)); 
   
    for (int dig = 0; dig <= limit; dig++) { 
        int currCnt = cnt; 
   
        // Nonz is true if we placed a non 
        // zero digit at the starting of 
        // the number 
        if (dig == d) { 
            if (d != 0 || (d==0 && nonz!=0)) 
                currCnt++; 
        } 
   
        int currTight = tight; 
   
        // At this position, number becomes 
        // smaller 
        if (dig < num.get(pos)) 
            currTight = 1; 
   
        // Next recursive call, also set nonz 
        // to 1 if current digit is non zero 
        ans += count(pos + 1, currCnt, 
                     currTight, (dig != 0?1:0), num); 
    } 
    return dp[pos][cnt][tight][nonz] = ans; 
} 
   
// Function to convert x into its digit vector and uses 
// count() function to return the required count 
static int solve(int x) 
{ 
    Vector<Integer> num= new Vector<Integer>(); 
    while (x!=0) { 
        num.add(x % 10); 
        x /= 10; 
    } 
    Collections.reverse(num); 
   
    // Initialize dp 
    for(int i=0;i<M;i++) 
        for(int j=0;j<M;j++) 
            for(int k=0;k<2;k++) 
                for(int l=0;l<2;l++) 
                dp[i][j][k][l]=-1; 
      
    return count(0, 0, 0, 0, num); 
} 
   
// Driver Code to test above functions 
public static void main(String args[]) 
{ 
    int L = 11, R = 100; 
    d = 2; K = 1; 
    System.out.print( solve(R) - solve(L - 1) ); 
} 
  
} 
//contributed by Arnab Kundu 

