

// Java program to find the middle term 
// in binomial expansion series. 
import java.math.*; 
  
class GFG { 
  
    // function to calculate factorial 
    // of a number 
    static int factorial(int n) 
    { 
        int fact = 1, i; 
        if (n == 0) 
            return 1; 
        for (i = 1; i <= n; i++) 
            fact *= i; 
              
        return fact; 
    } 
      
    // Function to find middle term in  
    // binomial expansion series. 
    static void findmiddle(int A, int X, int n) 
    { 
        int i, j, aPow, xPow; 
        float middleTerm1, middleTerm2; 
  
        if (n % 2 == 0) 
        { 
            // If n is even 
              
            // calculating the middle term 
            i = n / 2; 
  
            // calculating the value of A to  
            // the power k and X to the power k 
            aPow = (int)Math.pow(A, n - i); 
            xPow = (int)Math.pow(X, i); 
      
            middleTerm1 = ((float)factorial(n) /  
              (factorial(n - i) * factorial(i))) 
                                  * aPow * xPow; 
            System.out.println("MiddleTerm = "
                                 + middleTerm1); 
        } 
        else { 
              
            // If n is odd 
  
            // calculating the middle term 
            i = (n - 1) / 2; 
            j = (n + 1) / 2; 
  
            // calculating the value of A to the  
            // power k and X to the power k 
            aPow = (int)Math.pow(A, n - i); 
            xPow = (int)Math.pow(X, i); 
      
            middleTerm1 = ((float)factorial(n) /  
               (factorial(n - i) * factorial(i))) 
                                   * aPow * xPow; 
      
            // calculating the value of A to the 
            // power k and X to the power k 
            aPow = (int)Math.pow(A, n - j); 
            xPow = (int)Math.pow(X, j); 
      
            middleTerm2 = ((float)factorial(n) /  
               (factorial(n - j) * factorial(j))) 
                                   * aPow * xPow; 
  
            System.out.println("MiddleTerm1 = "
                                  + middleTerm1); 
                    
            System.out.println("MiddleTerm2 = "
                                  + middleTerm2); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 6, A = 2, X = 4; 
  
        // calling the function 
        findmiddle(A, X, n); 
    } 
} 

