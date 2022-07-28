

// Efficient Java program to count numbers  
// with last digit as k in given range. 
import java.util.*; 
import java.lang.*; 
  
public class GfG 
{ 
    // Returns count of numbers with  
    // k as last digit. 
    public static int counLastDigitK(int low,  
                                 int high, int k) 
    { 
        int count = (high - low)/10; 
        if (high % 10 >= k) 
            count++; 
        if (low % 10 > k) 
            count--; 
        return count; 
    } 
      
    // driver function 
    public static void main(String argc[]) 
    { 
        int low = 3, high = 35, k = 3; 
        System.out.println(counLastDigitK(low, high, k)); 
    } 
} 
  
// This code is contributed by Sagar Shukla 

