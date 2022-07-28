

// Java implementation of the approach 
class GFG { 
  
    // Function to print n numbers such that 
    // their sum is a perfect square 
    static void findNumbers(int n) 
    { 
        int i = 1; 
        while (i <= n) { 
  
            // Print ith odd number 
            System.out.print(((2 * i) - 1) + " "); 
            i++; 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 3; 
        findNumbers(n); 
    } 
} 

