

// Java Program to find the sum of 
// fourth powers of first n odd  
// natural numbers 
class GFG { 
      
    // calculate the sum of fourth  
    // power of first n odd natural 
    // numbers 
    static long oddNumSum(int n) 
    { 
        return (n * (2 * n + 1) *  
         (24 * n * n * n - 12 * n  
          * n - 14 * n + 7)) / 15; 
    } 
  
    // Driven Program 
    public static void main(String[] args) 
    { 
        int n = 4; 
          
        System.out.println(oddNumSum(n)); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal. 

