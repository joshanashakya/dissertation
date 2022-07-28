

// Java Program to find the value 
// 1^K + 2^K + 3^K + .. + N^K 
class GFG { 
      
    // Function to find value of 
    // 1^K + 2^K + 3^K + .. + N^K 
    static int findSum(int N, int k) 
    { 
        // Initialise sum to 0 
        int sum = 0; 
        for (int i = 1; i <= N; i++) { 
      
            // Find the value of 
            // pow(i, 4) and then 
            // add it to the sum 
            sum += (int)Math.pow(i, k); 
        } 
      
        // Return the sum 
        return sum; 
    } 
      
    // Drivers Code 
    public static void main (String[] args)  
    { 
        int N = 8, k = 4; 
      
        // Function call to 
        // find the sum 
        System.out.println(findSum(N, k)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

