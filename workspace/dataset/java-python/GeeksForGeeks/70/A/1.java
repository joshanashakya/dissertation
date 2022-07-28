

// Java implementation to check whether 
// a number can be expressed as a  
// product of single digit numbers 
import java.util.*; 
  
class GFG 
{ 
  
// Number of single digit prime numbers 
static int SIZE = 4; 
  
// function to check whether a number can 
// be expressed as a product of single  
// digit numbers 
static boolean productOfSingelDgt(int n) 
{ 
    // if 'n' is a single digit number,  
    // then it can be expressed 
    if (n >= 0 && n <= 9) 
        return true; 
  
    // define single digit prime numbers 
    // array 
    int[] prime = { 2, 3, 5, 7 }; 
  
    // repeatedly divide 'n' by the given 
    // prime numbers until all the numbers 
    // are used or 'n' > 1 
    for (int i = 0; i < SIZE && n > 1; i++) 
        while (n % prime[i] == 0) 
            n = n / prime[i]; 
  
    // if true, then 'n' can 
    // be expressed 
    return (n == 1); 
} 
  
// Driver program to test above 
public static void main (String[] args)  
{ 
    int n = 24; 
    if(productOfSingelDgt(n)) 
    System.out.println("Yes"); 
    else
    System.out.println("No");  
} 
      
} 
/* This code is contributed by Mr. Somesh Awasthi */

