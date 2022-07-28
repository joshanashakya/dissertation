

// Java implementation of the approach 
class GFG 
{  
      
    // Function to return the factorial of n 
    static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
        return n * factorial(n - 1); 
    } 
      
    // Function to return the count 
    // of n-digit numbers with 
    // all distinct digits 
    static int countNum(int n) 
    { 
        if (n > 10) 
            return 0; 
        return (9 * factorial(9) /  
                    factorial(10 - n)); 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int n = 3; 
        System.out.println(countNum(n));  
    } 
} 
  
// This code is contributed by Srathore 

