

// Java program for count total 
// zero in product of array 
import java.util.*; 
import java.lang.*; 
  
public class GfG 
{ 
    // Returns count of zeros in product of array 
    public static int countZeroso(int[] a, int n) 
    { 
        int count2 = 0, count5 = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // count number of 2s  
            // in each element 
            while (a[i] % 2 == 0)  
            { 
                a[i] = a[i] / 2; 
                count2++; 
            } 
  
            // count number of 5s  
            // in each element 
            while (a[i] % 5 == 0)  
            { 
                a[i] = a[i] / 5; 
                count5++; 
            } 
        } 
        // return the minimum 
        return (count2 < count5) ? count2 : count5; 
    } 
      
    // Driver function  
    public static void main(String argc[]) 
    { 
        int[] a = new int[]{ 10, 100, 20, 30,  
                            50, 91, 12, 80 }; 
        int n = 8; 
        System.out.println(countZeroso(a, n)); 
    } 
      
} 
  
// This code is contributed  
// by Sagar Shukla  

