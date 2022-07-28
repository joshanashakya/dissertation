

// Java program to find the sum of the 
// series 1 + 1/3 + 1/5 + ... 
class GFG { 
      
    // Function to find the sum of the 
    // given series 
    static void printSumSeries(int N) 
    { 
        // Intialise the sum to 0 
        float sum = 0; 
      
        for (int i = 1; i <= N; i++) { 
      
            // Generate the ith term and 
            // add it to the sum 
            sum += 1.0 / (2 * i - 1); 
        } 
      
        // Print the final sum 
        System.out.println(sum); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int N = 6; 
      
        printSumSeries(N); 
  
    } 
      
} 
  
// This code is contributed by AnkitRai01 

