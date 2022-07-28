

// Java implemenattion of the above approach 
  
import java.io.*; 
  
class GFG { 
   
  
// Function to find the maximum product 
 static void maxProductSum(String str, int m) 
{ 
    int n = str.length(); 
    int maxProd = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE; 
    for (int i = 0; i < n - m; i++) { 
        int product = 1, sum = 0; 
  
        for (int j = i; j < m + i; j++) { 
            product = product * (str.charAt(j) - '0'); 
            sum = sum + (str.charAt(j) - '0'); 
        } 
  
        maxProd = Math.max(maxProd, product); 
        maxSum = Math.max(maxSum, sum); 
    } 
    System.out.println("Maximum Product = " + maxProd); 
    System.out.print( "\nMaximum Sum = " + maxSum); 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        String str = "3675356291"; 
    int m = 5; 
  
    maxProductSum(str, m); 
    } 
} 
// This code is contributed by anuj_67.. 

