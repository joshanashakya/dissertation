

// Java implementation of the above approach 
class GFG  
{ 
    static int MAX = 10;  
      
    // Function that returns true  
    // if n is a Factorion  
    static boolean isFactorion(int n)  
    {  
        // fact[i] will store i!  
        int fact[] = new int[MAX];  
          
        fact[0] = 1;  
        for (int i = 1; i < MAX; i++)  
            fact[i] = i * fact[i - 1];  
      
        // A copy of the given integer  
        int org = n;  
      
        // To store the sum of factorials  
        // of the digits of n  
        int sum = 0;  
        while (n > 0)  
        {  
      
            // Get the last digit  
            int d = n % 10;  
      
            // Add the factorial of the current  
            // digit to the sum  
            sum += fact[d];  
      
            // Remove the last digit  
            n /= 10;  
        }  
      
        if (sum == org)  
            return true;  
      
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 40585;  
        if (isFactorion(n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

