

// Java Program to find the sum of square of  
// binomial coefficient. 
class GFG{ 
      
    // function to return product of number  
    // from start to end. 
    static int factorial(int start, int end) 
    { 
        int res = 1; 
        for (int i = start; i <= end; i++) 
            res *= i; 
              
        return res; 
    } 
      
    // Return the sum of square of binomial 
    // coefficient 
    static int sumofsquare(int n) 
    { 
        return factorial(n+1, 2*n)/factorial(1, n); 
    } 
      
    // Driven Program 
    public static void main(String[] args) 
    { 
        int n = 4;  
        System.out.println(sumofsquare(n)); 
    }  
}  
  
// This code is contributed by 
// Smitha DInesh Semwal 

