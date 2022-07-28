

// Java implementation to unset 
// bits the last m bits 
class GFG  
{ 
      
static int sizeofInt = 8; 
  
// function to toggle the last m bits 
static int toggleLastMBits(int n, 
                            int m) 
{ 
    // calculating a number 'num' having 'm' bits 
    // and all are set 
    int num = (1 << m) - 1; 
  
    // toggle the last m bits and return the number 
    return (n ^ num); 
} 
  
// function to unset bits the last m bits 
static int unsetLastMBits(int n, 
                            int m) 
{ 
    // 'num' is the highest positive integer number 
    // all the bits of 'num' are set 
    int num = (1 << (sizeofInt * 8 - 1)) - 1; 
  
    // toggle the last 'm' bits in 'num' 
    num = toggleLastMBits(num, m); 
  
    // unset the last 'm' bits in 'n' 
    // and return the number 
    return (n & num); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 150, m = 4; 
    System.out.println(unsetLastMBits(n, m)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

