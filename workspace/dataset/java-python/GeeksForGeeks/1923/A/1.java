

// Java program to find remainder without 
// using modulo operator 
import java.io.*; 
  
class GFG { 
  
    // This function returns remainder 
    // of num/divisor without using % 
    // (modulo) operator 
    static int getRemainder(int num, int divisor) 
    { 
  
        // Handle divisor equals to 0 case 
        if (divisor == 0) { 
            System.out.println("Error: divisor "
                               + "can't be zero \n"); 
            return -1; 
        } 
  
        // Handle negative values 
        if (divisor < 0) 
            divisor = -divisor; 
        if (num < 0) 
            num = -num; 
  
        // Find the largest product of 'divisor' 
        // that is smaller than or equal to 'num' 
        int i = 1; 
        int product = 0; 
        while (product <= num) { 
            product = divisor * i; 
            i++; 
        } 
  
        // return remainder 
        return num - (product - divisor); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
  
        // print 100 % 0; 
        System.out.println(getRemainder(100, 7)); 
    } 
} 
  
// This code is contributed by Sam007. 

