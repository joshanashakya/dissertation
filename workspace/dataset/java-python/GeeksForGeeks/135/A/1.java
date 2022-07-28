

// Java implementation of the approach  
class GFG  
{ 
    static int maxSize = 50;  
  
    // To store the states of dp  
    static double dp[] = new double[maxSize];  
      
    // To determine whether a state  
    // has been solved before  
    static int v[] = new int[maxSize];  
      
    // Function to return the count  
    static double expectedSteps(int x)  
    {  
      
        // Base cases  
        if (x == 0)  
            return 0;  
              
        if (x <= 5)  
            return 6;  
      
        // If a state has been solved before  
        // it won't be evaluated again  
        if (v[x] == 1)  
            return dp[x];  
      
        v[x] = 1;  
      
        // Recurrence relation  
        dp[x] = 1 + (expectedSteps(x - 1) +  
                     expectedSteps(x - 2) +  
                     expectedSteps(x - 3) +  
                     expectedSteps(x - 4) +  
                     expectedSteps(x - 5) +  
                     expectedSteps(x - 6)) / 6;  
          
        return dp[x];  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 10;  
      
        System.out.println(expectedSteps(n - 1));  
    } 
} 
  
// This code is contributed by AnkitRai01 

