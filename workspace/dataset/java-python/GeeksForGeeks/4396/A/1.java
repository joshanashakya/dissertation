

// Java program to Binary real number to String. 
import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class Reperesentation of Binary real number 
// to String 
class BinaryToString 
{ 
    // Main function to convert Binary real 
    // number to String 
    static String printBinary(double num) 
    { 
        // Check Number is Between 0 to 1 or Not 
        if (num >= 1 || num <= 0) 
            return "ERROR"; 
  
        StringBuilder binary = new StringBuilder(); 
        double frac = 0.5; 
        binary.append("."); 
  
        while (num > 0) 
        { 
            /* Setting a limit on length: 32 characters, 
               If the number cannot be represented 
               accurately in binary with at most 32 
               characters  */
            if (binary.length() >= 32) 
                return "ERROR"; 
  
            // It compare the number to . 5. 
            if (num >= frac) 
            { 
                binary.append(1); 
                num -= frac; 
            } 
            else            
                binary.append(0); 
  
            // Now it become 0.25 
            frac /= 2; 
        } 
        return binary.toString(); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        double num1 = 0.625; // Input value in Decimal 
        String output = printBinary(num1); 
        System.out.println("(0" + output + ")  in base 2"); 
  
        double num2 = 0.72; 
        output = printBinary(num2); 
        System.out.println("(" + output + ") "); 
    } 
} 

