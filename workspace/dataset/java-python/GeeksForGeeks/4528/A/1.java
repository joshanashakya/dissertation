

// Java program to find sum 
class GFG { 
    // function to calculate sum of series 
    static int claculate sum(int n) 
    { 
        // initialize sum as 0 
        int sum = 0; 
  
        // loop to calculate sum of series 
        for (int i = 0; i < n; i++) { 
  
            // calculate 2^i 
            // and add it to sum 
  
            sum = sum + (1 << i); 
        } 
        return sum; 
    } 
    // Main function 
    public static void main(String[] args) 
    { 
  
        int n = 10; 
        System.out.println("Sum of the series : " + calculateSum(n)); 
    } 
}; 

