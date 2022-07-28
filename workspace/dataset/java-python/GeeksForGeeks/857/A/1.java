

// Java program to check if all sub-numbers 
// have distinct Digit product 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
  
    // Function to calculate product of 
    // digits between given indexes 
    static int digitProduct(int[] digits, int start, int end) 
    { 
        int pro = 1; 
        for (int i = start; i <= end; i++) { 
            pro *= digits[i]; 
        } 
        return pro; 
    } 
  
    // Function to check if all sub-numbers 
    // have distinct Digit product 
    static boolean isDistinct(int N) 
    { 
        String s = "" + N; 
  
        // Length of number N 
        int len = s.length(); 
  
        // Digit array 
        int[] digits = new int[len]; 
  
        // List to maintain digit products 
        ArrayList<Integer> products = new ArrayList<>(); 
  
        for (int i = 0; i < len; i++) { 
            digits[i] = Integer.parseInt("" + s.charAt(i)); 
        } 
  
        // Finding all possible subarrays 
        for (int i = 0; i < len; i++) { 
            for (int j = i; j < len; j++) { 
  
                int val = digitProduct(digits, i, j); 
  
                if (products.contains(val)) 
                    return false; 
                else
                    products.add(val); 
            } 
        } 
  
        return true; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 324; 
  
        if (isDistinct(N)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

