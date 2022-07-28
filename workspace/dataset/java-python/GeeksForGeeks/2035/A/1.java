

// Java program to calculate 
// minimum numberof powers of  
// x to make sum equal to n. 
  
class GFG 
{ 
    // Return minimum power  
    // terms of x required 
    static int minPower(int n, int x) 
    { 
        // if x is 1, return n since  
        // any power of 1 is 1 only. 
        if (x==1) 
            return n; 
      
        // Consider n = a * x + b where  
        // a = n/x and b = n % x. 
        int ans = 0; 
        while (n > 0) 
        { 
            // Update count of powers  
            // for 1's added 
            ans += (n % x); 
      
            // Repeat the process for reduced n 
            n /= x; 
        } 
      
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 5, x = 3; 
        System.out.println(minPower(n, x)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

