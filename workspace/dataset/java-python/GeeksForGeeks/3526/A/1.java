

// Java implementation of  
// the above approach  
class GFG 
{ 
      
    // Returns value of Binomial  
    // Coefficient C(n, k)  
    static int binomialCoeff(int n, int k)  
    {  
        int res = 1;  
      
        // Since C(n, k) = C(n, n-k)  
        if (k > n - k)  
            k = n - k;  
      
        // Calculate value of  
        for (int i = 0; i < k; ++i)  
        {  
            res *= (n - i);  
            res /= (i + 1);  
        }  
      
        return res;  
    }  
      
    // Iterative Function to  
    // calculate (x^y) in O(log y)  
    static int power(int x, int y)  
    {  
        // Initialize result  
        int res = 1;  
      
        while (y > 0)  
        {  
      
            // If y is odd, multiply  
            // x with result  
            if ((y & 1) == 1)  
                res = res * x;  
      
            // y must be even now  
            // y = y/2  
            y = y >> 1;  
      
            // Change x to x^2  
            x = x * x;  
        }  
        return res;  
    }  
      
    // Recursive function to return gcd of a and b  
    static int gcd(int a, int b)  
    {  
        if (b == 0)  
            return a;  
        return gcd(b, a % b);  
          
    }  
      
    // Function to find probability  
    static void FindProbability(int n)  
    {  
      
        // Calculate total possible  
        // ways and favourable ways.  
        int up = binomialCoeff(2 * n, n);  
        int down = power(2, 2 * n);  
      
        // Divide by gcd such that  
        // they become relatively coprime  
        int g = gcd(up, down);  
      
        up /= g; 
        down /= g;  
      
        System.out.println(up + "/" + down);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int N = 8;  
      
        FindProbability(N);  
    }  
} 
  
// This code is contributed by AnkitRai01 

