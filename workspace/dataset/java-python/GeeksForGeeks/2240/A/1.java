

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the  
    // required number of ways  
    static int cntWays(int n)  
    {  
        if (n % 2 == 1)  
        {  
            return 0;  
        }  
        else
        {  
            return (n - 2) / 4;  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 18;  
      
        System.out.println(cntWays(n));  
  
    }  
} 
  
// This code is contributed by AnkitRai01 

