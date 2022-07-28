

// Java program to find  
// remainder when all 
// array elements are 
// multiplied. 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Find remainder of arr[0] * arr[1] * 
    // .. * arr[n-1] 
    public static int findremainder(int arr[],  
                                   int len, int n) 
    { 
        int mul = 1; 
  
        // find the individual remainder 
        // and multiple with mul. 
        for (int i = 0; i < len; i++)  
            mul = (mul * (arr[i] % n)) % n; 
      
        return mul % n; 
    } 
      
    // Driver function 
    public static void main(String argc[]) 
    { 
        int[] arr = new int []{ 100, 10, 5, 
                                25, 35, 14 }; 
        int len = 6; 
        int n = 11; 
  
        // print the remainder of after 
        // multiple all the numbers 
        System.out.println(findremainder(arr, len, n)); 
    } 
} 
  
/* This code is contributed by Sagar Shukla */

