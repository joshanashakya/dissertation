

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the next 
    // fibonacci number 
    static long nextFibonacci(int n) 
    { 
        double a = n * (1 + Math.sqrt(5)) / 2.0; 
        return Math.round(a); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 5; 
        System.out.println(nextFibonacci(n)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

