

// Java implementation of the approach  
  
class GFG  
{ 
      
    // Function that returns true  
    // if x is a perfect square  
    static boolean isPerfectSquare(double x)  
    {  
      
        // Find floating point value of  
        // square root of x  
        double sr = Math.sqrt(x);  
      
        // If square root is an integer  
        return ((sr - Math.floor(sr)) == 0);  
    }  
      
    // Function that returns true  
    // if n is a sunny number  
    static boolean isSunnyNum(int n)  
    {  
      
        // If (n + 1) is a perfect square  
        if (isPerfectSquare(n + 1))  
            return true;  
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 3;  
      
        if (isSunnyNum(n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
      
    }  
} 
  
// This code is contributed by Ryuga 

