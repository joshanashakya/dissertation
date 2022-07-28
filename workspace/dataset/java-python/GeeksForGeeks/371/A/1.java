

// Java implementation of above approach 
  
import java.util.*; 
  
class solution 
{ 
  
// Function to calculate the Selling Price 
static float SellingPrice(float CP, float PP) 
{ 
  
    // Decimal Equivalent of Profit Percentage 
    float P_decimal = 1 + (PP / 100); 
  
    // Find the Selling Price 
    float res = P_decimal * CP; 
  
    // return the calculated Selling Price 
    return res; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    // Get the CP and Profit% 
    float C = 720, P = 13; 
  
    // Printing the returned value 
    System.out.println(SellingPrice(C, P)); 
  
} 
  
} 

