

// Java implementation of the approach 
class GFG 
{ 
      
// Function to find k such that 
// |a - k| = |b - k| 
static int find_k(int a, int b) 
{ 
    // If (a + b) is even 
    if ((a + b) % 2 == 0) 
        return ((a + b) / 2); 
  
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 2, b = 16; 
  
    System.out.println(find_k(a, b)); 
} 
} 
  
// This code is contributed by Code_Mech 

