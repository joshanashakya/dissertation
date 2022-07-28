

// Java implementation implementation 
// of the above approach 
import java.util.*; 
class GFG  
{ 
  
// Function to return the required array 
static Vector<Long> getArray(int n) 
{ 
    Vector<Long> ans = new Vector<Long>(); 
  
    // Store the power of 2 
    long p2 = 1; 
  
    // while n is greater than 0 
    while (n > 0) 
    { 
          
        // if there is 1 in binary 
        // representation 
        if (n % 2 == 1) 
            ans.add(p2); 
  
        // Divide n by 2 
        // Multiply p2 by 2 
        n >>= 1; 
        p2 *= 2; 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 15; 
  
    // Get the answer 
    Vector<Long> ans = getArray(n); 
  
    // Printing the array 
    for(Long i : ans) 
        System.out.print(i + " "); 
} 
} 
  
// This code is contributed by 29AjayKumar 

