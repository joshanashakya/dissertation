

// Java implementation of the above approach 
  
class GFG 
{ 
  
    // function to calculate nth  
    // term of the series  
    static long nthTerm(long n)  
    {  
        // variable nth will store the 
        // nth term of series  
        long nth;  
      
        // if n is even  
        if (n % 2 == 0)  
            nth = 2 * ((n * n) - n);  
      
        // if n is odd  
        else
            nth = (2 * n * n) - n;  
      
        // return nth term  
        return nth;  
    }  
      
    // Driver code  
    public static void main(String []args)  
    {  
        long n;  
        n = 5;  
        System.out.println(nthTerm(n));  
      
        n = 25;  
        System.out.println(nthTerm(n));  
      
        n = 25000000;  
        System.out.println(nthTerm(n));  
      
        n = 250000007;  
        System.out.println(nthTerm(n));  
    }  
} 
  
// This code is contributed by Ryuga 

