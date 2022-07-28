

// Dynamic and Logarithm approach find probability of 
// at least k heads 
import java.math.*; 
class GFG { 
      
static int MAX = 100001; 
  
// dp[i] is going to store Log ( i !) in base 2 
static double dp[] = new double[MAX]; 
  
static double probability(int k, int n) 
{ 
    double ans = 0.0; // Initialize result 
  
    // Iterate from k heads to n heads 
    for (int i=k; i <= n; ++i) 
    { 
        double res = dp[n] - dp[i] - dp[n-i] - n; 
        ans += Math.pow(2.0, res); 
    } 
  
    return ans; 
} 
  
static void precompute() 
{ 
    // Preprocess all the logarithm value on base 2 
    for (int i=2; i < MAX; ++i) 
        dp[i] = (Math.log(i)/Math.log(2)) + dp[i-1]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    precompute(); 
  
    // Probability of getting 2 head out of 3 coins 
    System.out.println(probability(2, 3)); 
  
    // Probability of getting 3 head out of 6 coins 
    System.out.println(probability(3, 6)); 
  
    // Probability of getting 500 head out of 10000 coins 
    System.out.println(probability(500, 1000)); 
} 
  
} 

