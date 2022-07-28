

// Java program to check if a large n 
// number is divisible by 20. 
import java.io.*; 
  
class GFG { 
      
    static Boolean divisibleBy20(String num) 
    { 
        // Get number with last two digits 
        int lastTwoDigits = Integer.parseInt(num.substring(num.length() - 2, 
                                                           num.length() )); 
          
        // Check if the number formed by last two 
        // digits is divisible by 5 and 4. 
        return ((lastTwoDigits % 5 == 0) && 
                (lastTwoDigits % 4 == 0)); 
    } 
      
    // Driver Program 
    public static void main (String[] args) 
    { 
        String num = "63284689320"; 
        if (divisibleBy20(num) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
          
    } 
} 
  
// This code is contributed by Gitanjali. 

