

// Java  program to find the sum of all the integers 
// below N which are multiples of either A or B 
  
import java.io.*; 
  
class GFG { 
      
// Function to find sum of AP series 
static long sumAP(long n, long d) 
{ 
    // Number of terms 
    n = (int)n/d; 
  
    return (n) * (1 + n) * d / 2; 
} 
  
// Function to find the sum of all 
// multiples of a and b below n 
static long sumMultiples( long n, long a,  long b) 
{ 
    // Since, we need the sum of 
    // multiples less than N 
    n--; 
  
    return sumAP(n, a) + sumAP(n, b) - sumAP(n, a * b); 
} 
  
// Driver code 
    public static void main (String[] args) { 
  
          
    long n = 10, a = 3, b = 5; 
  
        System.out.println (sumMultiples(n, a, b)); 
    } 
//This code is contributed by akt_mit     
} 

