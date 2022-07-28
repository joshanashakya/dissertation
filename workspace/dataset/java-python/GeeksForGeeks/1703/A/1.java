

// Java code to check if 
// a number is multiple of 
// 5 without using / and % 
class GFG 
{ 
static boolean isMultipleof5(int n) 
{ 
    // If n is a multiple of 5  
    // then we make sure that 
    // last digit of n is 0  
    if ((n & 1) == 1) 
        n <<= 1; 
      
    float x = n; 
    x = ((int)(x * 0.1)) * 10; 
      
    // If last digit of n is  
    // 0 then n will be equal 
    // to (int)x  
    if ((int)x == n) 
        return true; 
  
    return false; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int i = 19; 
    if (isMultipleof5(i) == true) 
        System.out.println(i + "is multiple of 5"); 
    else
        System.out.println(i + " is not a " +  
                            "multiple of 5"); 
} 
} 
  
// This code is contributed  
// by mits 

