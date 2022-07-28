

// Java program to find  
// the last k digits in  
// product of array 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Returns last k digits in product of a[] 
    static int lastKDigits(int a[], int n, int k) 
    { 
        int num = (int)(Math.pow(10, k)); 
      
        // Multiplying array elements  
        // under modulo 10^k. 
        int mul = a[0] % num; 
          
        for (int i = 1; i < n; i++) { 
            a[i] = a[i] % num; 
            mul = (a[i] * mul) % num; 
        } 
        return mul; 
    } 
      
// Driven program 
public static void main(String args[]) 
{ 
    int a[] = { 22, 31, 44, 27, 37, 43 }; 
    int k = 2; 
    int n = a.length; 
      
    System.out.println(lastKDigits(a, n, k)); 
} 
  
} 
  
  
/*This code is contributed by Nikita Tiwari.*/

