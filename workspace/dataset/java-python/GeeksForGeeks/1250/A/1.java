

// Java program to check if  
// a number has same number  
// of set and unset bits 
import java.io.*; 
  
class GFG  
{ 
      
// Function to check if a  
// number has same setbits  
// and unset bits 
static boolean checkSame(int n) 
{ 
    int set = 0; 
    int unset = 0; 
  
    // iterate for all 
    // bits of a number 
    while (n > 0)  
    { 
  
        // if set 
        if ((n & 1) ==  1) 
            set++; 
              
        // if unset 
        else
            unset++; 
  
        // right shift  
        // number by 1 
        n = n >> 1; 
    } 
  
    // is number of set bits  
    // are equal to unset bits 
    if (set == unset) 
        return true; 
    else
        return false; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
int n = 12; 
  
// function to check 
if (checkSame(n)) 
    System.out.println ("YES"); 
else
    System.out.println("NO"); 
      
} 
} 
  
// This code is contributed 
// by akt_mit 

