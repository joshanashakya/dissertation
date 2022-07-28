

// Java program to print multiples of  
// Unit Digit of Given Number 
import java.io.*; 
  
class GFG 
{ 
  
// Function to print the multiples 
// of unit digit 
static void printMultiples(int n) 
{ 
    // Find the unit digit of 
    // the given number 
    int unit_digit = n % 10; 
  
    // if the unit digit is 0 then 
    // change it to 10 
    if (unit_digit == 0) 
        unit_digit = 10; 
  
    // print the multiples of unit digit 
    // until the multiple is less than 
    // or equal to n 
    for (int i = unit_digit; i <= n; i += unit_digit) 
        System.out.print( i + " "); 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        int n = 39; 
        printMultiples(n); 
    } 
} 
  
// This code is contributed by inder_mca 

