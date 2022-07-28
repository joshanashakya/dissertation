

// Java program to count 
// all rotation divisible 
// by 4. 
import java.io.*; 
  
class GFG { 
      
    // Returns count of all 
    // rotations divisible 
    // by 4 
    static int countRotations(String n) 
    { 
        int len = n.length(); 
       
        // For single digit number 
        if (len == 1) 
        { 
          int oneDigit = n.charAt(0)-'0'; 
  
          if (oneDigit % 4 == 0) 
              return 1; 
  
          return 0; 
        } 
       
        // At-least 2 digit 
        // number (considering all 
        // pairs) 
        int twoDigit, count = 0; 
        for (int i = 0; i < (len-1); i++) 
        { 
          twoDigit = (n.charAt(i)-'0') * 10 + 
                     (n.charAt(i+1)-'0'); 
  
          if (twoDigit%4 == 0) 
              count++; 
        } 
       
        // Considering the number 
        // formed by the pair of 
        // last digit and 1st digit 
        twoDigit = (n.charAt(len-1)-'0') * 10 + 
                   (n.charAt(0)-'0'); 
  
        if (twoDigit%4 == 0) 
            count++; 
       
        return count; 
    } 
       
    //Driver program 
    public static void main(String args[]) 
    { 
        String n = "4834"; 
        System.out.println("Rotations: " + 
                          countRotations(n)); 
    } 
} 
  
// This code is contributed by Nikita tiwari. 

