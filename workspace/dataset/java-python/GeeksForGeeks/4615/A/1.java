

// Java implementation of the above approach  
class GFG  
{ 
      
    // Function to find the quadratic  
    // equation whose roots are a and b  
    static void findEquation(int a, int b)  
    {  
        int sum = (a + b);  
        int product = (a * b);  
        System.out.println("x^2 - (" + sum +  
                           "x) + (" + product + ") = 0");  
    }  
      
    // Driver code  
    public static void main(String args[]) 
    {  
        int a = 2, b = 3;  
      
        findEquation(a, b);  
    }  
} 
  
// This code is contributed by AnkitRai01 

