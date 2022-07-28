

// Java implementation of the approach 
  
public class GFG { 
  
    // Function to compute the series sum 
    static double sum(int x, int n) 
    { 
  
        double total = 1.0; 
  
        // To store the value of S[i-1] 
        double previous = 1.0; 
  
        // Iterate over n to store sum in total 
        for (int i = 1; i <= n; i++) { 
  
            // Update previous with S[i] 
            previous = (previous * x) / (i + 1); 
            total = total + previous; 
        } 
  
        return total; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get x and n 
        int x = 5, n = 4; 
  
        // Find and print the sum 
        System.out.print("Sum is: " + sum(x, n)); 
    } 
} 

