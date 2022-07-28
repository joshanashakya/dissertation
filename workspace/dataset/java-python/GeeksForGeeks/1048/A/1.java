

// Java program to find Sum of alternating 
// sign Squares of first N natural numbers 
class GFG  
{ 
      
    // Fucntion to calculate 
    // the alternating sign sum 
    static int summation(int n) 
    { 
      
        // Variable to store the absolute sum 
        int abs_sum = n * (n + 1) / 2; 
      
        // Variable to store the sign 
        int sign = n + 1 % 2 == 0 ? 1 : -1; 
      
        // Variable to store the resultant sum 
        int result_sum = sign * abs_sum; 
      
        return result_sum; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int N = 2; 
        System.out.println(summation(N)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

