

// Java program to count numbers  
// with N digits which consists  
// of odd number of 0's  
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
      
// Function to count Numbers with  
// N digits which consists of odd  
// number of 0's  
static double countNumbers(int N)  
{  
    return (Math.pow(10, N) - 1) -  
           (Math.pow(10, N) -  
            Math.pow(8, N)) / 2;  
}  
  
// Driver code  
static public void main (String args[]) 
{ 
    int n = 2;  
    System.out.println(countNumbers(n));  
} 
} 
  
// This code si contributed  
// by Akanksha Rai 

