

// Simple Java program to count numbers with  
// last digit as k in given range. 
import java.util.*; 
import java.lang.*; 
  
public class GfG 
{ 
    // Returns count of numbers with 
    // k as last digit. 
    public static int counLastDigitK(int low,  
                                int high, int k) 
    { 
        int count = 0; 
        for (int i = low; i <= high; i++)  
            if (i % 10 == k) 
                count++;  
        return count; 
    } 
      
    // driver function 
    public static void main(String args[]) 
    { 
        int low = 3, high = 35, k = 3; 
        System.out.println(counLastDigitK(low, high, k)); 
    } 
} 
  
// This code is contributed by Sagar Shukla 

