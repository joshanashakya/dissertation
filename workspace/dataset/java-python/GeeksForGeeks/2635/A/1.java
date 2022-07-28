

// Java program to find the nth 
// term of the series 1 2 2 3 3 3 ... 
import java.io.*; 
  
class Series { 
      
    // function to solve the quadratic 
    // equation 
    static int term(int n) 
    { 
        // calculating the Nth term 
        int x = (((1) + (int)Math.sqrt(1 +  
                           (8 * n))) / 2); 
        return x; 
    } 
      
    // driver code to check the above function 
    public static void main (String[] args) { 
        int n = 5; 
        System.out.println(term(n)); 
    } 
} 
  
// This code is contributed by Chinmoy Lenka 

