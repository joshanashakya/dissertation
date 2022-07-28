

// Java program to find the number of ways  
// Calculate total ways to place 'x' and 'y'  
// at n places such that no two 'x' are together 
public class GFG { 
      
    // Function to return number of ways  
    static int ways(int n) 
    { 
        // for n=1 
        int first = 2; 
  
        // for n=2 
        int second = 3; 
        int res = 0; 
  
        // iterate to find Fibonacci term 
        for (int i = 3; i <= n; i++) { 
            res = first + second; 
            first = second; 
            second = res; 
        } 
  
        return res; 
    } 
    public static void main(String[] args) 
    { 
  
        // total number of places 
        int n = 7; 
  
        System.out.print("Total ways are: " + ways(n)); 
    } 
} 

