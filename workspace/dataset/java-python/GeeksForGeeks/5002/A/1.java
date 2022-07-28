

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the count of  
    // valid values of x 
    static int countX(int n) 
    { 
        int count = 0; 
  
        for (int i = 0; i <= n; i++) { 
  
            // If n - x = n XOR x 
            if (n - i == (n ^ i)) 
                count++; 
        } 
  
        // Return the required count; 
        return count; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        int answer = countX(n); 
        System.out.println(answer); 
    } 
} 

