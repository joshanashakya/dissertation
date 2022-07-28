

// Java implementation of the approach 
  
class GFG{ 
      
  
// Function to find 
// minimum number of nodes 
static int AVLnodes(int height) 
{ 
    // Base Conditions 
    if (height == 0) 
        return 1; 
    else if (height == 1) 
        return 2; 
   
    // Recursive function call 
    // for the recurrence relation 
    return (1 + AVLnodes(height - 1) + AVLnodes(height - 2)); 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int H = 3; 
    System.out.println(AVLnodes(H)); 
} 
} 

