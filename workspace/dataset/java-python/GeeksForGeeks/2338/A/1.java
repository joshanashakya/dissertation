

// Java program to print a number such that the 
// frequency of each digit in the new number is  
// is equal to its frequency in the given number  
// multiplied by the digit itself. 
  
import java.io.*; 
  
class GFG { 
   
// Function to print such a number 
static void printNumber(int n) 
{ 
    // initializing a hash array 
    int count[] = new int[10]; 
  
    // counting frequency of the digits 
    while (n>0) { 
        count[n % 10]++; 
        n /= 10; 
    } 
  
    // printing the new number 
    for (int i = 1; i < 10; i++) { 
        for (int j = 0; j < count[i] * i; j++) 
            System.out.print(i); 
    } 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        int n = 3225; 
  
    printNumber(n); 
    } 
} 
// This code is contributed by inder_verma 

