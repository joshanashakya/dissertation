

//Java program to count unary numbers 
// in a range 
  
import java.io.*; 
  
class GFG { 
      
// Function to check if a number is unary 
static boolean isUnary(int n) 
{ 
    /// Base case. Note that if we repeat 
    // above process for 7, we get 1. 
    if (n == 1 || n == 7) 
        return true; 
    else if (n / 10 == 0) 
        return false; 
  
    /// rec case 
    int x, sum = 0; 
    while (n != 0) { 
        x = n % 10; 
        sum = sum + x * x; 
        n = n / 10; 
    } 
  
return isUnary(sum); 
} 
  
// Function to count unary numbers 
// in a range 
static int countUnary(int a, int b) 
{ 
    int count = 0; 
  
    for (int i = a; i <= b; i++) { 
        if (isUnary(i) == true) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver Code 
      
    public static void main (String[] args) { 
      
      
    int a = 1000, b = 1099; 
    System.out.println (countUnary(a, b)); 
  
    } 
//This code is contributed by ajit     
} 

