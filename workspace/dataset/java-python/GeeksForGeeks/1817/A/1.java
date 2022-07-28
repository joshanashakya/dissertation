

// Java implementation  
// of above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to print the 
// substrings of a number 
static void printSubstrings(int n) 
{ 
    // Calculate the total 
    // number of digits 
    int s = (int)Math.log10(n); 
  
    // 0.5 has been added because  
    // of it will return double 
    // value like 99.556 
    int d = (int)(Math.pow(10, s) + 0.5); 
    int k = d; 
  
    while (n > 0) 
    { 
  
        // Print all the numbers  
        // from starting position 
        while (d > 0)  
        { 
            System.out.println(n / d); 
            d = d / 10; 
        } 
  
        // Update the no. 
        n = n % k; 
  
        // Update the no.of digits 
        k = k / 10; 
        d = k; 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 123; 
    printSubstrings(n); 
} 
} 
  
// This code is contributed  
// by Subhadeep 

