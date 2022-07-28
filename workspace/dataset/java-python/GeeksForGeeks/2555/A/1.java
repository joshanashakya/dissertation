

// java program to determine whether the 
// number is Peterson number or not 
import java.io.*; 
  
public class GFG { 
  
    // To quickly find factorial of digits 
    static int []fact = new int[]{1, 1, 2, 
                    6, 24, 120, 720, 5040, 
                            40320, 362880}; 
      
    // Function to check if a number is 
    // Peterson or not 
    static boolean peterson(int n) 
    { 
        int num = n; 
        int sum = 0; 
      
        // stores the sum of factorials of  
        // each digit of the number. 
        while (n > 0) 
        { 
            int digit = n % 10; 
            sum += fact[digit]; 
            n = n / 10;  
        } 
      
        // Condition check for a number to  
        // be a Peterson Number 
        return (sum == num); 
    } 
      
    // Driver Program 
    static public void main (String[] args) 
    { 
        int n = 145; 
          
        if (peterson(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by vt_m. 

