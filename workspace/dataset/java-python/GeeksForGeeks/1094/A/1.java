

// Java implementation of the approach 
class GFG 
{ 
  
// Function to print all the perfect 
// squares from the given range 
static void perfectSquares(float l, float r) 
{ 
  
    // Getting the very first number 
    int number = (int) Math.ceil(Math.sqrt(l)); 
  
    // First number's square 
    int n2 = number * number; 
  
    // Next number is at the difference of 
    number = (number * 2) + 1; 
  
    // While the perfect squares 
    // are from the range 
    while ((n2 >= l && n2 <= r)) 
    { 
  
        // Print the perfect square 
        System.out.print(n2 + " "); 
  
        // Get the next perfect square 
        n2 = n2 + number; 
  
        // Next odd number to be added 
        number += 2; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 2, r = 24; 
  
    perfectSquares(l, r); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

