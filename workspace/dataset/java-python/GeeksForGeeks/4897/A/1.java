

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return  
//minimum number of nodes 
static int AVLtree(int H, int a, int b) 
{ 
    // Base Conditions 
    if (H == 0) 
        return 1; 
    if (H == 1) 
        return b; 
  
    // Tail Recursive Call 
    return AVLtree(H - 1, b, a + b + 1); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int H = 5; 
    int answer = AVLtree(H, 1, 2); 
  
    // Output the result 
    System.out.println("n(" + H + ") = " + answer); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

