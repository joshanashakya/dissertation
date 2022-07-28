

// Java program to check if the 
// concatenation of two numbers 
// is a perfect square or not 
import java.lang.*; 
class GFG { 
  
    // Function to check if the concatenation is 
    // a perfect square 
    static void checkSquare(String s1, String s2) 
    { 
  
        // Function to convert concatenation 
        // of strings to a number 
        int c = Integer.valueOf(s1 + s2); 
  
        // square root of number 
        int d = (int)Math.sqrt(c); 
  
        // check if it is a perfect square 
        if (d * d == c) { 
            System.out.println("Yes"); 
        } 
        else { 
            System.out.println("No"); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s1 = "12"; 
        String s2 = "1"; 
  
        checkSquare(s1, s2); 
    } 
} 

