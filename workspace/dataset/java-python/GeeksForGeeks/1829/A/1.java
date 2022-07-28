

// Java code to find the Nth term of given series. 
import java.util.*; 
  
class solution 
{ 
  
// Function to calculate sum 
static long getNthTerm(long N) 
{ 
      
   // Return Nth term 
    return ((int)Math.pow(N, 2) + N + 1); 
} 
  
//Driver program 
public static void main(String arr[]) 
{ 
      
   // declaration of number of terms 
    long N = 11; 
  
    // Get the Nth term 
    System.out.println(getNthTerm(N)); 
  
} 
} 
//THis code is contibuted by 
//Surendra_Gangwar 

