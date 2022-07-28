

// Java Program to find probability to  
// reach N with P probability to take 
// 2 steps (1-P) to take 3 steps 
import java.io.*; 
  
class GFG { 
      
    // Returns probability to reach N 
    static float find_prob(int N, float P) 
    { 
        double dp[] = new double[N + 1]; 
        dp[0] = 1; 
        dp[1] = 0; 
        dp[2] = P; 
        dp[3] = 1 - P; 
      
        for (int i = 4; i <= N; ++i) 
          dp[i] = (P) * dp[i - 2] + 
                        (1 - P) * dp[i - 3]; 
      
        return ((float)(dp[N])); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        float p = 0.2f; 
        System.out.printf("%.2f",find_prob(n, p)); 
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

