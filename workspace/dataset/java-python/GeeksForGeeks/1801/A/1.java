

// Java implementation of the 
// above approach 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
// Print the sum and product of  
// digits that divides the number. 
static void countDigit(int n) 
{ 
    int temp = n, sum = 0, product = 1; 
    while (temp != 0) 
    { 
  
        // Fetching each digit of  
        // the number 
        int d = temp % 10; 
        temp /= 10; 
  
        // Checking if digit is greater 
        // than 0 and can divides n. 
        if (d > 0 && n % d == 0)  
        { 
            sum += d; 
            product *= d; 
        } 
    } 
  
    System.out.print("Sum = " + sum); 
    System.out.print("\nProduct = " + product); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 1012; 
  
    countDigit(n); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai(Abby_akku) 

