

// Java implementation to find the 
// sum of the given series 
class GFG{ 
  
    // function to find the sum 
    // of the given series 
    static int sumOfTheSeries(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) { 
      
            // first term of each i-th term 
            int k = 2; 
            for (int j = 1; j <= i; j++) { 
                sum += k; 
      
                // next term 
                k += 2; 
            } 
        } 
      
        // required sum 
        return sum; 
    } 
      
    // Driver program to test above 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        System.out.printf("Sum = %d", 
                     sumOfTheSeries(n)); 
    } 
} 
  
// This code is contriubted by 
// Smitha Dinesh Semwal 

