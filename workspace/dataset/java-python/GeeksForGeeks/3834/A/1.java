

// Java implementation of the approach 
class Solution 
{ 
    // Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0  
        if (a == 0)  
        return b;  
        if (b == 0)  
        return a;  
          
        // base case  
        if (a == b)  
            return a;  
          
        // a is greater  
        if (a > b)  
            return __gcd(a - b, b);  
        return __gcd(a, b - a);  
    } 
      
    // Function to return the LCM of a and b 
    static int lcm(int a, int b) 
    { 
        return (a / __gcd(a, b) * b); 
    } 
  
    // Function to return the minimized value 
    static int getMinValue(int c) 
    {  
        int ans = Integer.MAX_VALUE; 
  
        // To find the factors 
        for (int i = 1; i <= Math.sqrt(c); i++)  
        { 
  
            // To check if i is a factor of c and 
            // the minimum possible number 
            // satisfying the given conditions 
            if (c % i == 0 && lcm(i, c / i) == c) 
            { 
  
                // Update the answer 
                ans = Math.min(ans, Math.max(i, c / i)); 
            } 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int c = 6; 
  
        System.out.println(getMinValue(c)); 
    } 
} 
  
// This code is contributed by Arnab Kundu 

