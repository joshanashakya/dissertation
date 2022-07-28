

// Java program to find if 
// a number is power of d 
// where d is power of 2. 
  
class GFG 
{ 
static int Log2n(int n) 
{ 
    return (n > 1)? 1 +  
    Log2n(n / 2): 0; 
} 
  
static boolean isPowerOfd(int n,  
                        int d) 
{ 
int count = 0; 
  
/* Check if there is  
only one bit set in n*/
if (n > 0 && (n &  
(n - 1)) == 0) 
{  
    /* count 0 bits  
    before set bit */
    while (n > 1) 
    { 
        n >>= 1; 
        count += 1; 
    }  
  
    /* If count is a multiple  
    of log2(d) then return  
    true else false*/
    return (count %  
        (Log2n(d)) == 0); 
} 
  
/* If there are more  
than 1 bit set then  
n is not a power of 4*/
return false; 
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 64, d = 8; 
    if (isPowerOfd(n, d)) 
        System.out.println(n +  
                    " is a power of " + d); 
    else
        System.out.println(n +  
                    " is not a power of " + d); 
} 
} 
  
// This code is contributed by mits 

