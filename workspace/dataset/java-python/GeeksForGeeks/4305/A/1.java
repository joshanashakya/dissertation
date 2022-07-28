

import java.util.Scanner; 
  
public class PatternGFG // create a Class named PatternGFG 
{ 
  
  // Function to print the pattern "GFG" 
  private static void print(int n, int k) { 
    for (int i = 0; i < n; i++) { 
      System.out.println(); 
      for (int j = 0; j < (3 * k + 2); j++) { 
  
         // For printing the upper portion of  
         // the pattern "GFG" 
        if ((i == 0 && j != k && j != 2 * k + 1) || 
            ((i == n / 2) && (j > 1) && (j != k) &&  
  
             // for printing the middle portion of 
             // the pattern "GFG" 
             (j != 2 * k + 1) && (j != 2 * k + 3)) || 
            ((i == n - 1) && (j != k) && 
  
             // for printing the lower portion of 
             // the pattern   "GFG"  
             ((j <= k) || (j > 2 * k + 1)))  
   
           || (j == 0) || (j == k + 1) || (j == (2 * k + 2)) || 
            ((j == k - 1 || j == 3 * k + 1) && (i > n / 2))) 
  
          // printing * where ever required 
          System.out.print("*");  
  
        else
          System.out.print(" "); // printing space where ever required 
      } 
    } 
  } 
  
  // Driver code 
  public static void main(String[] args) { 
    int n = 7, k = 5; // length and width of the pattern 
    print(n, k); 
  } 
} 

