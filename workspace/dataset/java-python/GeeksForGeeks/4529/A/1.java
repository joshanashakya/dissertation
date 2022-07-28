

// Java program to calculate 
// sum of series of power of 2 
  
class GFG { 
  
    // function to calculate sum of series 
    static int claculate sum(int n) 
    { 
  
        // calculate 2^(n+1) 
        int sum = (1 << (n + 1)); 
        return sum - 1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 10; 
        System.out.println("Sum of the series of power 2 is : "
                           + calculateSum(n)); 
    } 
}; 

