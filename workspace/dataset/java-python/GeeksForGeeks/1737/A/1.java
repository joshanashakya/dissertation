

// Java program to check if a 
// number is a triangular number 
// using simple approach 
class GFG 
{ 
      
    // Returns true if 'num' is  
    // triangular, else false 
    static boolean isTriangular(int num) 
    { 
        // Base case 
        if (num < 0) 
            return false; 
      
        // A Triangular number must be 
        // sum of first n natural numbers 
        int sum = 0; 
          
        for (int n = 1; sum <= num; n++) 
        { 
            sum = sum + n; 
            if (sum == num) 
                return true; 
        } 
      
        return false; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 55; 
        if (isTriangular(n)) 
            System.out.print("The number "
                + "is a triangular number"); 
        else
            System.out.print("The number"
             + " is NOT a triangular number"); 
    } 
} 
  
// This code is contributed  
// by Anant Agarwal. 

