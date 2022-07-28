

// Java Program to compute sum of 
// 1 + x/2! + x^2/3! +...+x^n/(n+1)! 
  
public class SumOfSeries { 
  
    // Method to find factorial of a number 
    static int fact(int n) 
    { 
        if (n == 1) 
            return 1; 
  
        return n * fact(n - 1); 
    } 
  
    // Method to compute the sum 
    static double sum(int x, int n) 
    { 
        double total = 1.0; 
  
        // Iterate the loop till n 
        // and compute the formula 
        for (int i = 1; i <= n; i++) { 
            total = total + (Math.pow(x, i) / fact(i + 1)); 
        } 
  
        return total; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        // Get x and n 
        int x = 5, n = 4; 
  
        // Find and print the sum 
        System.out.print("Sum is: " + sum(x, n)); 
    } 
} 

