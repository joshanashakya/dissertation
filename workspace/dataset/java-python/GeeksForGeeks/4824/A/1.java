

// Java Program to find the sum of  
// sum of squares of first n natural 
// number 
  
class GFG { 
      
    // Function to find sum of sum of 
    // square of first n natural number 
    static int findSum(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; i++)  
            sum += ((i * (i + 1)  
               * (2 * i + 1)) / 6); 
        return sum; 
    } 
      
    // Driver Program 
    public static void main(String[] args) 
    { 
        int n = 3; 
      
        System.out.println( findSum(n)); 
    } 
} 
  
  
// This code is contributed by  
// Arnab Kundu 

