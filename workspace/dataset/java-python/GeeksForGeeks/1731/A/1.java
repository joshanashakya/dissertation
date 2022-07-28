

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to print the Nth digit  
    // in the fraction (p / q)  
    static int findNthDigit(int p,  
                            int q, int N)  
    {  
        // To store the resultant digit  
        int res = 0;  
      
        // While N > 0 compute the Nth digit  
        // by dividing p and q and store the  
        // result into variable res  
        // and go to next digit  
        while (N > 0)  
        {  
            N--;  
            p *= 10;  
            res = p / q;  
            p %= q;  
        }  
        return res;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int p = 1, q = 2, N = 1;  
      
        System.out.println(findNthDigit(p, q, N));  
    }  
} 
  
// This code is contributed by AnkitRai01 

