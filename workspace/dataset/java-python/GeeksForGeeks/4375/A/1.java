

// Java Program to find the solutions of specified equations 
public class GFG { 
  
    // Method to check for solutions of equations 
    static void checkSolution(int a, int b, int c) 
    { 
  
        // If the expression is greater than 0,  
        // then 2 solutions 
        if (((b * b) - (4 * a * c)) > 0) 
            System.out.println("2 solutions"); 
  
        // If the expression is equal 0, then 2 solutions 
        else if (((b * b) - (4 * a * c)) == 0) 
            System.out.println("1 solution"); 
  
        // Else no solutions 
        else
            System.out.println("No solutions"); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int a = 2, b = 5, c = 2; 
        checkSolution(a, b, c); 
    } 
} 

