

// Java program to implement fascinating number 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
  
    // function to check if number is fascinating or not 
    public static boolean isFascinating(int num) 
    { 
        // frequency count array using 1 indexing 
        int[] freq = new int[10]; 
  
        // obtaining the resultant number 
        // using string concatenation 
        String val = "" + num + num * 2 + num * 3; 
  
        // Traversing the string character by character 
        for (int i = 0; i < val.length(); i++) { 
  
            // gives integer value of a character digit 
            int digit = val.charAt(i) - '0'; 
  
            // To check if any digit has 
            // appeared multiple times 
            if (freq[digit] > 0) 
                return false; 
            else
                freq[digit]++; 
        } 
  
        // Traversing through freq array to 
        // check if any digit was missing 
        for (int i = 1; i < freq.length; i++) { 
            if (freq[i] == 0) 
                return false; 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // Input number 
        int num = 192; 
  
        // Not a valid number 
        if (num < 100) 
            System.out.println("No"); 
  
        else { 
            // Calling the function to check 
            // if input number is fascinating or not 
            boolean ans = isFascinating(num); 
            if (ans) 
                System.out.println("Yes"); 
            else
                System.out.println("No"); 
        } 
    } 
} 

