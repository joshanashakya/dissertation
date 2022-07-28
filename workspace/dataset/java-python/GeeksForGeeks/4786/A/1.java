

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
static int minItems(int k, int r) 
{ 
      
// See if we can buy less than 10 items 
// Using 10 Rs coins and one r Rs coin 
for (int i = 1; i < 10; i++)  
        if ((i * k - r) % 10 == 0 || 
            (i * k) % 10 == 0)  
            return i; 
  
    // We can always buy 10 items 
    return 10; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int k = 15; 
    int r = 2; 
    System.out.println(minItems(k, r)); 
} 
} 
  
// This code is contributed  
// by SURENDRA_GANGWAR 

