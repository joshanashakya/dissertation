

// Java implementation of the approach 
class GFG 
{ 
      
    // Function to return the count  
    // of all possible values for x  
    // such that (A % x) = B  
    static int countX(int a, int b)  
    {  
        // Case 1  
        if (b > a)  
            return 0;  
      
        // Case 2  
        else if (a == b)  
            return -1;  
      
        // Case 3  
        else
        {  
            int x = a - b, ans = 0;  
      
            // Find the number of divisors of x  
            // which are greater than b  
            for (int i = 1; i * i <= x; i++) 
            {  
                if (x % i == 0) 
                {  
                    int d1 = i, d2 = b - 1;  
                    if (i * i != x)  
                        d2 = x / i;  
                    if (d1 > b)  
                        ans++;  
                    if (d2 > b)  
                        ans++;  
                }  
            }  
            return ans;  
        }  
    }  
  
    // Driver code  
    static public void main (String args[])  
    {  
        int a = 21, b = 5;  
      
        System.out.println(countX(a, b));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

