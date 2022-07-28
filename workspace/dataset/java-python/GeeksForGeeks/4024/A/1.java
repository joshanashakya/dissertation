

// Java program to find sum of digits of 
// n in different bases from 2 to n-1. 
class GFG 
{ 
// function to calculate sum of  
// digit for a given base 
static int solve(int n, int base) 
{ 
    // Sum of digits 
    int result = 0 ; 
      
    // Calculating the number (n) by 
    // taking mod with the base and adding  
    // remainder to the result and  
    // parallelly reducing the num value . 
    while (n > 0) 
    { 
        int remainder = n % base ; 
        result = result + remainder ;  
        n = n / base; 
    } 
      
    // returning the result  
    return result ; 
} 
  
static void printSumsOfDigits(int n) 
{ 
    // function calling for multiple bases 
    for (int base = 2 ; base < n ; ++base)  
        System.out.print(solve(n, base)+" ");  
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 8; 
    printSumsOfDigits(n); 
} 
} 
// This code is contributed by Smitha 

