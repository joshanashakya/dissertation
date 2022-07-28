

// Java implementation of the approach  
class GFG 
{ 
      
    // Function that returns true  
    // if n is prime  
    static boolean Prime(int n)  
    {  
        // There is no prime  
        // less than 2  
        if (n < 2)  
            return false;  
      
        // Run a loop from 2 to sqrt(n)  
        for (int i = 2; i <= (int)Math.sqrt(n); i++)  
      
            // If there is any factor  
            if (n % i == 0)  
                return false;  
        return true;  
    }  
      
    // Function that returns true if n  
    // has a prime count of divisors  
    static boolean primeCountDivisors(int n)  
    {  
        if (n < 2)  
            return false;  
      
        // Find the prime factors  
        for (int i = 2; i <= (int)Math.sqrt(n); i++)  
            if (n % i == 0)  
            {  
      
                // Find the maximum value of i for every  
                // prime divisor p such that n % (p^i) == 0  
                long a = n, c = 0;  
                while (a % i == 0) 
                {  
                    a /= i;  
                    c++;  
                }  
      
                // If c+1 is a prime number and a = 1  
                if (a == 1 && Prime((int)c + 1) == true)  
                    return true;  
      
                // The number cannot have two factors  
                // to have count of divisors prime  
                else
                    return false;  
            }  
      
        // Else the number is prime so  
        // it has only two divisors  
        return true;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 13;  
      
        if (primeCountDivisors(n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

