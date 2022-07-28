

// Java program to count all  
// rotations divisible by 8 
import java.io.*; 
  
class GFG  
{ 
    // function to count of all  
    // rotations divisible by 8 
    static int countRotationsDivBy8(String n) 
    { 
        int len = n.length(); 
        int count = 0; 
      
        // For single digit number 
        if (len == 1) { 
            int oneDigit = n.charAt(0) - '0'; 
            if (oneDigit % 8 == 0) 
                return 1; 
            return 0; 
        } 
      
        // For two-digit numbers  
        // (considering all pairs) 
        if (len == 2) { 
      
            // first pair 
            int first = (n.charAt(0) - '0') *  
                        10 + (n.charAt(1) - '0'); 
      
            // second pair 
            int second = (n.charAt(1) - '0') *  
                         10 + (n.charAt(0) - '0'); 
      
            if (first % 8 == 0) 
                count++; 
            if (second % 8 == 0) 
                count++; 
            return count; 
        } 
      
        // considering all three-digit sequences 
        int threeDigit; 
        for (int i = 0; i < (len - 2); i++)  
        { 
            threeDigit = (n.charAt(i) - '0') * 100 +  
                        (n.charAt(i + 1) - '0') * 10 +  
                        (n.charAt(i + 2) - '0'); 
            if (threeDigit % 8 == 0) 
                count++; 
        } 
      
        // Considering the number formed by the  
        // last digit and the first two digits 
        threeDigit = (n.charAt(len - 1) - '0') * 100 +  
                    (n.charAt(0) - '0') * 10 +  
                    (n.charAt(1) - '0'); 
      
        if (threeDigit % 8 == 0) 
            count++; 
      
        // Considering the number formed by the last  
        // two digits and the first digit 
        threeDigit = (n.charAt(len - 2) - '0') * 100 + 
                    (n.charAt(len - 1) - '0') * 10 +  
                    (n.charAt(0) - '0'); 
        if (threeDigit % 8 == 0) 
            count++; 
      
        // required count of rotations 
        return count; 
    } 
      
    // Driver program  
    public static void main (String[] args) 
    { 
        String n = "43262488612"; 
        System.out.println( "Rotations: "
                       +countRotationsDivBy8(n)); 
          
    } 
} 
  
// This code is contributed by vt_m. 

