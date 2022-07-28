

// Java implementation to check  
// whether all the bits in the  
// given range of two numbers  
// are complement of each other 
class GFG 
{ 
// function to check whether  
// all the bits are set in  
// the given range or not 
static boolean allBitsSetInTheGivenRange(int n, 
                                         int l, int r) 
{ 
    // calculating a number 'num' 
    // having 'r' number of bits  
    // and bits in the range l 
    // to r are the only set bits 
    int num = ((1 << r) - 1) ^  
              ((1 << (l - 1)) - 1); 
  
    // new number which will only  
    // have one or more set bits  
    // in the range l to r and  
    // nowhere else 
    int new_num = n & num; 
  
    // if both are equal,  
    // then all bits are set 
    // in the given range 
    if (num == new_num) 
        return true; 
  
    // else all bits are not set 
    return false; 
} 
  
// function to check whether all  
// the bits in the given range 
// of two numbers are complement  
// of each other 
static boolean bitsAreComplement(int a, int b, 
                                 int l, int r) 
{ 
    int xor_value = a ^ b; 
    return allBitsSetInTheGivenRange(xor_value, l, r); 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int a = 10, b = 5; 
    int l = 1, r = 3; 
  
    if (bitsAreComplement(a, b, l, r)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Smitha 

