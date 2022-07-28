

// An optimised java program to find the 
// number of digits in a factorial 
import java.io.*; 
import java.util.*; 
  
class GFG { 
    public static double M_E = 2.71828182845904523536; 
    public static double M_PI = 3.141592654; 
  
     // Function returns the number of 
     // digits present in n! since the 
     // result can be large, long long  
     // is used as return type 
    static long findDigits(int n) 
    { 
        // factorial of -ve number doesn't exists 
        if (n < 0) 
            return 0; 
  
        // base case 
        if (n <= 1) 
            return 1; 
  
        // Use Kamenetsky formula to calculate 
        // the number of digits 
        double x = (n * Math.log10(n / M_E) + 
                    Math.log10(2 * M_PI * n) /  
                    2.0); 
  
        return (long)Math.floor(x) + 1; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        System.out.println(findDigits(1)); 
        System.out.println(findDigits(50000000)); 
        System.out.println(findDigits(1000000000)); 
        System.out.println(findDigits(120)); 
    } 
} 
  
// This code is contributed by Pramod Kumar. 

