

// Java program to largest and smallest digit of a number 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Gfg 
{ 
      
// Function to the largest and smallest digit of a number 
static void Digits(int n) 
{ 
    int largest = 0; 
    int smallest = 9; 
  
    while(n != 0)  
    { 
        int r = n % 10; 
  
        // Find the largest digit 
        largest = Math.max(r, largest); 
  
        // Find the smallest digit 
        smallest = Math.min(r, smallest); 
  
        n = n / 10; 
    } 
    System.out.println(largest + " " + smallest); 
} 
  
// Driver code 
public static void main (String[] args) throws java.lang.Exception 
{ 
    int n = 2346; 
  
    // Function call 
    Digits(n); 
  
} 
} 
  
// This code is contributed by nidhiva 

