

// A Simple Java program to check if square  
// root of a number under modulo p exists or not 
class GFG  
{ 
      
    // Returns true if square root of n under  
    // modulo p exists 
    static boolean squareRootExists(int n, int p) 
    { 
        n = n % p; 
      
        // One by one check all numbers from 2  
        // to p-1 
        for (int x = 2; x < p; x++) 
            if ((x * x) % p == n) 
                return true; 
                  
        return false; 
    } 
      
    // Driver program to test 
    public static void main (String[] args)  
    { 
          
        int p = 7; 
        int n = 2; 
          
        if(squareRootExists(n, p)) 
            System.out.print("Yes"); 
        else
            System.out.print("No");   
    } 
} 
  
// This code is contributed by Anant Agarwal. 

