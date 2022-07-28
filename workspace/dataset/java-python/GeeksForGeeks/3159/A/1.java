

// Java program to print the  
// number of 1s in smallest  
// repunit multiple of the number. 
import java.io.*; 
  
class GFG  
{ 
// Function to find number  
// of 1s in smallest repunit 
// multiple of the number 
static int countOnes(int n) 
{ 
    // to store number of 1s  
    // in smallest repunit 
    // multiple of the number. 
    int count = 1; 
  
    // initialize rem with 1 
    int rem = 1; 
  
    // run loop until  
    // rem becomes zero 
    while (rem != 0)  
    { 
  
        // rem*10 + 1 here  
        // represents the  
        // repunit modulo n 
        rem = (rem * 10 + 1) % n; 
        count++; 
    } 
  
    // when remainder becomes 
    // 0 return count 
    return count; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
int n = 13; 
  
// Calling function 
System.out.println(countOnes(n)); 
} 
} 
  
// This code is contributed by akt_mit 

