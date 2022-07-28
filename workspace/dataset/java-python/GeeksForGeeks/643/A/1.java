

// Java implementation of the above approach  
class GFG 
{ 
          
    // Function to return the  
    // nth XOR Fibonacci number  
    static int nthXorFib(int n, int a, int b)  
    {  
        if (n == 0)  
            return a;  
        if (n == 1)  
            return b;  
        if (n == 2)  
            return (a ^ b);  
      
        return nthXorFib(n % 3, a, b);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int a = 1, b = 2, n = 10;  
      
        System.out.println(nthXorFib(n, a, b));  
    }  
} 
  
// This code is contributed by AnkitRai01 

