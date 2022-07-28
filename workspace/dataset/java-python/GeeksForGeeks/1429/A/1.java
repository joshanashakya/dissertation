

// Java program to print the sum  
// of all even numbers in range L and R  
  
import java.io.*; 
  
class GFG { 
      
// Function to return the sum of  
// all natural numbers  
static int sumNatural(int n)  
{  
    int sum = (n * (n + 1));  
    return sum;  
}  
  
// Function to return sum  
// of even numbers in range L and R  
static int sumEven(int l, int r)  
{  
    return sumNatural(r/2) - sumNatural((l-1) / 2);  
}  
  
// Driver Code  
      
    public static void main (String[] args) { 
  
        int l = 2, r = 5;  
        System.out.println ("Sum of Natural numbers from L to R is "+ 
         sumEven(l, r));  
    } 
} 

