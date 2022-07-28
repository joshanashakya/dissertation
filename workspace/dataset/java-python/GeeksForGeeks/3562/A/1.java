

// Java implementation of the  
// above approach 
class GFG 
{ 
      
// Function to find the element 
static int findThirdDigit(int n) 
{ 
    // if n < 3 
    if (n < 3) 
        return 0; 
  
    // If n is even return 6 
    // If n is odd return 1 
    return (n & 1) > 0 ? 1 : 6; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 7; 
  
    System.out.println(findThirdDigit(n)); 
}  
} 
  
// This code is contributed  
// by Akanksha Rai 

