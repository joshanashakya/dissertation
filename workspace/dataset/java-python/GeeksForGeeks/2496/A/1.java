

// Java program to find all factorial numbers 
// smaller than or equal to n. 
  
class GFG 
{ 
    static void printFactorialNums(int n) 
    { 
        int fact = 1; 
        int x = 2; 
        while (fact <= n) 
        { 
            System.out.print(fact + " "); 
      
            // Compute next factorial  
            // using previous 
            fact = fact * x; 
      
            x++; 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 100; 
        printFactorialNums(n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

