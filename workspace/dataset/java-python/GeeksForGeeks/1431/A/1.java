

// Java program to print the sum 
// of all numbers in range L and R 
  
class GFG{ 
// Function to return the sum of 
// all natural numbers 
static int sumNatural(int n) 
{ 
    int sum = (n * (n + 1)) / 2; 
    return sum; 
} 
  
// Function to return the sum 
// of all numbers in range L and R 
static int suminRange(int l, int r) 
{ 
    return sumNatural(r) - sumNatural(l - 1); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int l = 2, r = 5; 
    System.out.println("Sum of Natural numbers from L to R is "+suminRange(l, r)); 
  
} 
} 
// This code is contributed by mits 

