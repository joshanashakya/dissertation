

// Java program to find if string 
// is a perfect square or not. 
import java.io.*; 
  
class GFG { 
      
    static boolean isPerfectSquareString(String str) 
    { 
        int sum = 0; 
          
        // calculating the length 
        // of the string 
        int len = str.length(); 
          
        // calculating the ASCII  
        // value of the string 
        for (int i = 0; i < len; i++) 
            sum += (int)str.charAt(i); 
          
        // Find floating point value 
        // of square root of x. 
        long squareRoot = (long)Math.sqrt(sum); 
          
        // If square root is an integer 
        return ((squareRoot -  
                Math.floor(squareRoot)) == 0); 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        String str = "d"; 
      
        if (isPerfectSquareString(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Ajit. 

