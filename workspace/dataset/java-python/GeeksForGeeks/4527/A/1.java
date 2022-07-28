

// Java program to 
// check the set bit 
// at kth position 
import java.io.*; 
  
class GFG { 
      
// function to check whether 
// the bit at given position 
// is set or unset 
static int bitAtGivenPosSetOrUnset 
                   ( int n, int k) 
{ 
  
    // to shift the kth bit 
    // at 1st position 
    int new_num = n >> (k - 1); 
   
    // Since, last bit is now  
    // kth bit, so doing AND with 1 
    // will give result. 
    return (new_num & 1); 
} 
    public static void main (String[] args) 
    { 
         // K and n must be greater than 0 
         int n = 10, k = 2; 
           
    if (bitAtGivenPosSetOrUnset(n, k)==1) 
        System.out.println("Set"); 
    else
        System.out.println("Unset"); 
    } 
} 
  
//This code is contributed by Gitanjali 

