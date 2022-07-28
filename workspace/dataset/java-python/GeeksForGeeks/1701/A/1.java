

// Java code to check if a number 
// is multiple of 5 without using  
// '/' and '%' operators 
class GFG  
{ 
      
// assumes that n is a positive integer  
static boolean isMultipleof5 (int n) 
{ 
    while (n > 0) 
        n = n - 5; 
  
    if (n == 0) 
        return true; 
  
    return false; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 19; 
    if (isMultipleof5(n) == true) 
        System.out.printf("%d is multiple of 5\n", n); 
    else
        System.out.printf("%d is not a multiple of 5\n", n); 
} 
} 
  
// This code is contributed by Smitha DInesh Semwal 

