

// Java implmentation to find a 
// N-digit number such that the number 
// it is not divisible by its digits 
class GFG { 
  
    long ll; 
      
    // Function to find the number 
    // such that it is not divisible 
    // by its digits 
    static void solve(long n) 
    { 
        // Base Cases 
        if (n == 1) 
        { 
            System.out.println(-1); 
        } 
        else { 
              
            // First Digit of the 
            // number will be 2 
            int num = 2; 
              
            // Next digits of the numbers 
            for (long i = 0; i < n - 1; i++) { 
                num = (num * 10) + 3; 
            } 
            System.out.println(num); 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        long n = 4; 
          
            // Function Call 
            solve(n); 
    } 
} 
  
// This code is contributed by AnkitRai01 

