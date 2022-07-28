

// Java implementation of the approach 
class GFG  
{ 
      
    // Function to print the roots of the  
    // quadratic equation when a + b + c = 0 
    static void printRoots(long a, long b, long c)  
    { 
        System.out.println(1 + ", " + c / (a * 1.0)); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        long a = 2;  
        long b = 3;  
        long c = -5;  
        printRoots(a, b, c); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

