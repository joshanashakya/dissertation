

// Java implementation to find the 
// sum of the given series 
class GFG{ 
      
    // functionn to find the sum 
    // of the given series 
    static int sumOfTheSeries(int n) 
    { 
          
        // sum of 1st n natural numbers 
        int sum_n = (n * (n + 1) / 2); 
          
        // sum of squares of 1st n natural 
        // numbers 
        int sum_sq_n = (n * (n + 1) / 2) * 
                        (2 * n + 1) / 3; 
                      
        // required sum 
        return (sum_n + sum_sq_n); 
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
//Smitha Dinesh Semwal 

