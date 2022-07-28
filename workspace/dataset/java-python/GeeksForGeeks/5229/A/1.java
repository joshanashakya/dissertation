

// Java program to implement 
// the above approach 
class GFG 
{ 
      
// Function to find the smallest index 
// such that there are no 0 or 1 to its right 
static int smallestIndex(int []a, int n) 
{ 
    // Initially 
    int right1 = 0, right0 = 0; 
  
    // Traverse in the array 
    for (int i = 0; i < n; i++)  
    { 
  
        // Check if array element is 1 
        if (a[i] == 1) 
            right1 = i; 
  
        // a[i] = 0 
        else
            right0 = i; 
    } 
  
    // Return minimum of both 
    return Math.min(right1, right0); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int []a = { 1, 1, 1, 0, 0, 1, 0, 1, 1 }; 
    int n = a.length; 
    System.out.println(smallestIndex(a, n)); 
} 
} 
  
// This code is contributed  
// by Code_Mech. 

