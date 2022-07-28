

// Java implemenattion of the above approach 
import java.util.Arrays;  
import java.io.*; 
  
class GFG { 
      
// Function to find the maximum product and sum 
static void maxProductSum(String str, int m) 
{ 
    int n = str.length(); 
    int product = 1, sum = 0; 
  
    // find the sum and product of first K digits 
    for (int i = 0; i < m; i++)  
    { 
        sum += (str.charAt(i) - '0'); 
        product *= (str.charAt(i) - '0'); 
    } 
  
    // Update maxProd and maxSum 
    int maxProd = product; 
    int maxSum = sum; 
  
    // Start traversing the next element 
    for (int i = m; i < n; i++)  
    { 
  
        // Multiply with the current digit and divide by 
        // the first digit of previous window 
        product = product * (str.charAt(i) - '0') / ((str.charAt(i-m)) - '0'); 
  
        // Add the current digit and subtract 
        // the first digit of previous window 
        sum = sum + (str.charAt(i) - '0') - ((str.charAt(i-m)) - '0'); 
  
        // Update maxProd and maxSum 
        maxProd = Math.max(maxProd, product); 
        maxSum = Math.max(maxSum, sum); 
    } 
  
    System.out.println("Maximum Product = " + maxProd); 
    System.out.println("\nMaximum Sum = " + maxSum); 
} 
  
// Driver code 
    public static void main (String[] args) { 
        String str = "3675356291"; 
        int m = 5; 
        maxProductSum(str, m); 
    } 
} 
  
// This code is contributed  
// by ajit 

