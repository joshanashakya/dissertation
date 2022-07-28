

// Java program to check whether 
// number is divisible by all its digits. 
import java.io.*; 
  
class GFG { 
  
    // Function to check the divisibility 
    // of the number by its digit. 
    static boolean checkDivisibility(int n, int digit) 
    { 
        // If the digit divides the number 
        // then return  true else return false. 
        return (digit != 0 && n % digit == 0); 
    } 
  
    // Function to check if all 
    // digits of n divide it or not, 
    static boolean allDigitsDivide(int n) 
    { 
        int temp = n; 
        while (temp > 0) { 
  
            // Taking the digit of the 
            // number into var 'digit'. 
            int digit = n % 10; 
  
            if ((checkDivisibility(n, digit)) == false) 
                return false; 
  
            temp /= 10; 
        } 
        return true; 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
        int n = 128; 
  
        // funtion call to check 
        // digits divisibility 
        if (allDigitsDivide(n)) 
            System.out.println("Yes"); 
  
        else
            System.out.println("No"); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

