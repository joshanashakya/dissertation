

// Java program to find Sum of alternating 
// sign Squares of first N natural numbers 
class GFG 
{ 
          
    // Fucntion to calculate 
    // the alternating sign sum 
    static int summation(int n) 
    { 
      
        // Variable to store the sum 
        int sum = 0; 
      
        // Loop to iterate each number 
        // from 1 to N 
        for (int i = 1; i <= n; i++) { 
      
            // The alternating sign is put 
            // by checking if the number 
            // is even or odd 
            if (i % 2 == 1) 
  
                // Add the square with the sign 
                sum += (i * i); 
      
            else
  
                // Add the square with the sign 
                sum -= (i * i); 
        } 
        return sum; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int N = 2; 
        System.out.println(summation(N)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

