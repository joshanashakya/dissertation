

// Program to find the 
// parity of a given number 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the parity 
static boolean findParity(int x) 
{ 
    int y = x ^ (x >> 1); 
        y = y ^ (y >> 2); 
        y = y ^ (y >> 4); 
        y = y ^ (y >> 8); 
        y = y ^ (y >> 16); 
  
    // Rightmost bit of y holds 
    // the parity value 
    // if (y&1) is 1 then parity  
    // is odd else even 
    if ((y & 1) > 0) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    if((findParity(9) == false)) 
        System.out.println("Even Parity"); 
    else
        System.out.println("Odd Parity"); 
      
    if(findParity(13) == false) 
        System.out.println("Even Parity"); 
    else
        System.out.println("Odd Parity"); 
} 
} 
  
// This Code is Contributed by chandan_jnu. 

