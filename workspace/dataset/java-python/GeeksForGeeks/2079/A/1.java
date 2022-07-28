

// Java program to check whether a number 
// is Deserium number or not 
import java.util.Scanner; 
class Deserium { 
  
    // Returns count of digits in n. 
    static int countDigits(int n) 
    { 
        int c = 0; 
        do { 
            c++; 
            n = n / 10; 
        } while (n != 0); 
        return c; 
    } 
  
    // Returns true if x is Diserium 
    static boolean isDeserium(int x) 
    { 
        int temp = x; 
        int p = countDigits(x); 
  
        // Compute powers of digits  
        // from right to left. 
        int sum = 0; 
        while (x != 0) { 
            int digit = x % 10; 
            sum += Math.pow(digit, p); 
            p--; 
            x = x / 10; 
        } 
  
        // If sum of powers is same as 
        // given number. 
        return (sum == temp); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int x = 135; 
        if (isDeserium(x)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

