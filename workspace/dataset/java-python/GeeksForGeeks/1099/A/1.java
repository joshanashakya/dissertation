

// Java program to find log(n) 
// using Recursion 
class Gfg1 { 
  
    static int Log2n(int n) 
    { 
        return (n > 1) ? 1 + Log2n(n / 2) : 0; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 32; 
        System.out.println(Log2n(n)); 
    } 
} 

