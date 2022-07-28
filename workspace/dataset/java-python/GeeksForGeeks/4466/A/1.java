

// Java implementation of the approach 
class GFG  
{ 
  
// Function to find the count 
// of set bits in all the 
// integers from 0 to n 
static void findSetBits(int n) 
{ 
    for (int i = 0; i <= n; i++) 
        System.out.print(Integer.bitCount(i) + " "); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
  
    findSetBits(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

