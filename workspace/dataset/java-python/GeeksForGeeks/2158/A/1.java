

// Java program to find sum of greatest 
// odd divisor of numbers in given range 
  
// Function to return sum of 
// first n odd numbers 
class gfg  
{ 
static int square(int n) 
{ 
    return n * n; 
} 
  
// Recursive function to return sum of greatest 
// odd divisor of numbers in range [1, n] 
static int sum(int n) 
{ 
    if (n == 0) 
        return 0; 
    if (n % 2 == 1) 
    { 
        // Odd n 
        return square((n + 1) / 2) + sum(n / 2);      
    } 
    else
    {  
        // Even n 
        return square(n / 2) + sum(n / 2); 
    } 
} 
  
// Function to return sum of greatest 
// odd divisor of numbers in range [a, b] 
static int oddDivSum(int a, int b) 
{ 
    return sum(b) - sum(a - 1); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 3, b = 9; 
    System.out.println(oddDivSum(a, b)); 
} 
} 
// This code is contributed by mits 

