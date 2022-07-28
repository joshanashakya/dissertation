

// Java program to find if it is possible to 
// write a number n as product of exactly k 
// positive numbers greater than 1. 
import java.util.*; 
  
class GFG 
{ 
      
// Prints k factors of n if n can be written 
// as multiple of k numbers. Else prints -1. 
static void kFactors(int n, int k) 
{ 
    // A vector to store all prime factors of n 
    ArrayList<Integer> P = new ArrayList<Integer>(); 
  
    // Insert all 2's in list 
    while (n % 2 == 0) 
    { 
        P.add(2); 
        n /= 2; 
    } 
  
    // n must be odd at this point 
    // So we skip one element (i = i + 2) 
    for (int i = 3; i * i <= n; i = i + 2) 
    { 
        while (n % i == 0) 
        { 
            n = n / i; 
            P.add(i); 
        } 
    } 
  
    // This is to handle when n > 2 and 
    // n is prime 
    if (n > 2) 
        P.add(n); 
  
    // If size(P) < k, k factors are 
    // not possible 
    if (P.size() < k) 
    { 
        System.out.println("-1"); 
        return; 
    } 
  
    // printing first k-1 factors 
    for (int i = 0; i < k - 1; i++) 
        System.out.print(P.get(i) + ", "); 
  
    // calculating and printing product  
    // of rest of numbers 
    int product = 1; 
    for (int i = k - 1; i < P.size(); i++) 
        product = product * P.get(i); 
    System.out.println(product); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 54, k = 3; 
    kFactors(n, k); 
} 
} 
  
// This code is contributed 
// by chandan_jnu 

