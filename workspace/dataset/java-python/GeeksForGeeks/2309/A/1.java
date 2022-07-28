

// Java program to find the difference 
// between the sum of the cubes of the 
// first N natural numbers and 
// the sum of the first N natural number 
  
class GFG 
{ 
  
static int difference(int n) 
{ 
  
    int S, res; 
  
    // Sum of first n natural numbers 
    S = (n * (n + 1)) / 2; 
  
    // Find the required difference 
    res = S * (S - 1); 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 5; 
    System.out.print(difference(n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

