

// Java program to count  
// number of digits in  
// n-th number made of  
// given four digits. 
import java.io.*; 
  
class GFG 
{ 
      
// Efficient function to  
// calculate number of digits  
// in the nth number constructed 
// by using 6, 1, 4 and 9 as  
// digits in the ascending order. 
static int number_of_digits(int n) 
{ 
    int i; 
    int res; 
    int sum = 0; 
  
    // Number of digits increase  
    // after every i-th number  
    // where i increases in powers of 4. 
    for (i = 4, res = 1;; i *= 4, res++)  
    { 
        sum += i; 
        if (sum >= n)  
            break;  
    } 
    return res; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int n = 21; 
    System.out.println(number_of_digits(n)); 
} 
} 
  
// This code is contributed  
// by akt_mit 

