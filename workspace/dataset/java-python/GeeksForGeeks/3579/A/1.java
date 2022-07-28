

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the maximum operations 
// required to convert X to Y 
static int maxOperations(int X, int Y) 
{ 
  
    // X cannot be converted to Y 
    if (X > Y) 
        return -1; 
  
    int diff = Y - X; 
  
    // If the differecne is 1 
    if (diff == 1) 
        return -1; 
  
    // If the difference is even 
    if (diff % 2 == 0) 
        return (diff / 2); 
  
    // Add 3 to X and the new 
    // difference will be even 
    return (1 + ((diff - 3) / 2)); 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int X = 5, Y = 16; 
  
    System.out.println(maxOperations(X, Y)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

