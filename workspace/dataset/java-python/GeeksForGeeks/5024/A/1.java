

// Java program to find N-th term 
// in the series 
  
// Function to find N-th term 
// in the series 
class GFG 
{ 
static void findNthTerm(int n) 
{  
    // If n is even 
    if (n % 2 == 0)  
    { 
        n = n / 2; 
        n = 2 * (n - 1); 
        System.out.println(n / 2); 
    } 
      
    // If n is odd 
    else 
    { 
        n = (n / 2) + 1; 
        n = 2 * (n - 1); 
        System.out.println(n); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int X = 10; 
    findNthTerm(X); 
      
    X = 7; 
    findNthTerm(X); 
} 
} 
  
// This code is contributed by Subhadeep 

