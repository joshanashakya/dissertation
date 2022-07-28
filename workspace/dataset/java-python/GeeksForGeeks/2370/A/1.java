

// Java Program to find the Discount Percentage 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
   
// Function to find the Discount Percentage 
static float discountPercentage(float S, float M) 
{ 
    // Calculating discount 
    float discount = M - S; 
   
    // Calculating discount percentage 
    float disPercent = (discount / M) * 100; 
   
    return disPercent; 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    int M, S; 
    M = 120; 
    S = 100; 
  
    System.out.printf("%.2f",discountPercentage(S,M)); 
    System.out.println("%"); 
      
   
    M = 1000; 
    S = 500; 
  
   System.out.printf("%.2f",discountPercentage(S,M)); 
    System.out.println("%"); 
} 
} 

