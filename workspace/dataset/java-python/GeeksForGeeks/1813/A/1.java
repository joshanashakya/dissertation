

// Java Implementation to Compute Sum of 
// Digits of Number N in Base B 
class GFG 
{ 
  
// Function to compute sum of 
// Digits of Number N in base B 
static int sumOfDigit(int n, int b) 
{ 
      
    // Initilize sum with 0 
    int unitDigit, sum = 0; 
    while (n > 0)  
    { 
          
        // Compute unit digit of the number 
        unitDigit = n % b; 
  
        // Add unit digit in sum 
        sum += unitDigit; 
  
        // Update value of Number 
        n = n / b; 
    } 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 50; 
    int b = 2; 
    System.out.print(sumOfDigit(n, b)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

