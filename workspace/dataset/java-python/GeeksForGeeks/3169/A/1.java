

// Java program to find smallest number Y for  
// a given value of X such that X AND Y is zero 
import java.lang.*; 
  
public class Main { 
      
    // Method to find smallest number Y for  
    // a given value of X such that X AND Y is zero 
    static long findSmallestNonZeroY(long A_num) 
    { 
        // Convert the number into its binary form 
        String A_binary = Long.toBinaryString(A_num); 
        long B = 1; 
        int len = A_binary.length(); 
        int no_ones = Long.bitCount(A_num); 
  
        // Case 1 : If all bits are ones,  
        // then return the next number 
        if (len == no_ones) { 
            return A_num + 1; 
        } 
  
        // Case 2 : find the first 0-bit  
        // index and return the Y 
        for (int i = 0; i < len; i++) { 
            char ch = A_binary.charAt(len - i - 1); 
            if (ch == '0') { 
                B = (long)Math.pow(2.0, (double)i); 
                break; 
            } 
        } 
        return B; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        long X = findSmallestNonZeroY(10); 
        System.out.println(X); 
    } 
} 

