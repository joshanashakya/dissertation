

// Java program to demonstrate above method 
// to check divisibility by 29. 
  
import java.io.*; 
  
class GFG { 
      
    // Returns true if n is divisible by 29 
    // else returns false. 
    static boolean isDivisible(long n) 
    { 
          
        // add the lastdigit*3 to renaming 
        // number until number comes only 
        // 2 digit 
        while (n / 100 > 0) { 
              
            int last_digit = (int)n % 10; 
            n /= 10; 
            n += last_digit * 3; 
        } 
  
        // return true if number is 
        // divisible by 29 another 
        return (n % 29 == 0); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        long n = 348; 
          
        if (isDivisible(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by vt_m. 

