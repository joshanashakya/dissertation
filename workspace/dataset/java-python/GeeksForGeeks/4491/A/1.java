

// Java implementation to  
// check whether all the 
// bits are unset in the  
// given range or not 
import java.io.*; 
  
class GFG  
{ 
      
// function to check whether  
// all the bits are unset in 
// the given range or not 
static String allBitsSetInTheGivenRange(int n, 
                                        int l,  
                                        int r) 
{ 
    // calculating a number 'num'  
    // having 'r' number of bits  
    // and bits in the range l to 
    // r are the only set bits 
    int num = ((1 << r) - 1) ^  
              ((1 << (l - 1)) - 1); 
      
    // new number which will  
    // only have one or more 
    // set bits in the range 
    // l to r and nowhere else 
    int new_num = n & num; 
      
    // if new num is 0, then  
    // all bits are unset in 
    // the given range 
    if(new_num == 0) 
        return "Yes"; 
          
    // else all bits 
    // are not unset  
    return "No";  
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int n = 17; 
    int l = 2; 
    int r = 4; 
    System.out.println( 
           allBitsSetInTheGivenRange(n, l, r)); 
} 
} 
  
// This code is contributed by akt_mit 

