

// Java program to calculate 
// sum of Perrin Numbers 
import java.lang.*; 
  
class GFG { 
  
    // function for sum of first n Perrin number. 
    static int calSum(int n) 
    { 
  
        int a = 3, b = 0, c = 2; 
        if (n == 0) // n=0 
            return 3; 
        if (n == 1) // n=1 
            return 3; 
        if (n == 2) // n=2 
            return 5; 
  
        // calculate k=5 sum of three previous step. 
        int sum = 5; 
  
        // Sum remaining numbers 
        while (n > 2) { 
  
            // calculate next term 
            int d = a + b; 
            sum += d; 
            a = b; 
            b = c; 
            c = d; 
            n--; 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 9; 
        System.out.print(calSum(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

