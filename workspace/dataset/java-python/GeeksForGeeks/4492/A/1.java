

// Java implementation to check  
// whether all the bits are  
// unset in the given range or not 
class GFG 
{ 
      
// function to check whether  
// all the bits are unset in 
// the given range or not 
static boolean allBitsSetInTheGivenRange(int n,  
                                         int l,  
                                         int r) 
{ 
    // calculating a number 'num'  
    // having 'r' number of bits  
    // and bits in the range l 
    // to r are the only set bits 
    int num = ((1 << r) - 1) ^  
              ((1 << (l - 1)) - 1); 
  
    // new number which could only  
    // have one or more set bits in 
    // the range l to r and nowhere else 
    int new_num = n & num; 
  
    // if true, then all bits are  
    // unset in the given range 
    if (new_num == 0) 
        return true; 
  
    // else all bits are not  
    // unset in the given range 
    return false; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 17; 
    int l = 2, r = 4; 
    if (allBitsSetInTheGivenRange(n, l, r)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed 
// by Smitha 

