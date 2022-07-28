

// Java code to find the maximum 
// possible effort 
  
class GFG { 
      
// Function to get no. of  
// set bits in binary 
// representation of  
// positive integer n 
static int countSetBits(int n) 
{ 
    int count = 0; 
    while (n != 0) 
    { 
        count += n & 1; 
        n >>= 1; 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int i = 3; 
    System.out.print(countSetBits(i)); 
} 
} 
  
// This code is contributed by Smitha. 

