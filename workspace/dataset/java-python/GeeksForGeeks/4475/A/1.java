

// Java program for Nth odd fibonaci number  
class GFG  
{ 
      
    // Function to find nth odd fibonaci number  
    static int oddFib(int n)  
    {  
        n = (3 * n + 1) / 2;  
          
        int a = -1, b = 1, c = 0, i;  
          
        for (i = 1; i <= n; i++)  
        {  
            c = a + b;  
            a = b;  
            b = c;  
        }  
        return c;  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 4;  
          
        System.out.println(oddFib(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

