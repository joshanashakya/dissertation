

// Java implementation to Find the 
// largest non-negative number that 
// is less than or equal to integer Z 
// and leaves a remainder X when divided by Y 
class GFG{ 
   
// Function to get the number 
static int get(int x, int y, int z) 
{ 
   
    // remainder can't be larger 
    // than the largest number, 
    // if so then answer doesn't exist. 
    if (x > z) 
        return -1; 
   
    // reduce number by x 
    int val = z - x; 
   
    // finding the possible 
    // number that is divisible by y 
    int div = (z - x) / y; 
   
    // this number is always <= x 
    // as we calculated over z - x 
    int ans = div * y + x; 
   
    return ans; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    // initialise the three integers 
    int x = 1, y = 5, z = 8; 
   
    System.out.print(get(x, y, z)+ "\n"); 
} 
} 
  
// This code is contributed by sapnasingh4991 

