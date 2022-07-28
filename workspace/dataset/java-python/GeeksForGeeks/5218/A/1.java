

// Java program to print a, b  
// and c such that a+b+c=N 
class GFG 
{ 
// Function to print a, b and c 
static void printCombination(int n) 
{ 
    System.out.print(1 + " "); 
  
    // check if n-2 is divisible 
    // by 3 or not 
    if ((n - 2) % 3 == 0) 
        System.out.print(2 + " " + (n - 3)); 
    else
        System.out.print(1 + " " + (n - 2)); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 233; 
  
    printCombination(n); 
} 
} 
  
// This code is contributed by mits 

