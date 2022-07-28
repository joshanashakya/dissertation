

// Program to find sum of series 
// 1^2 + 3^2 + 5^2 + . . . + (2*n - 1)^2. 
  
import java.io.*; 
  
class GFG { 
     
// Function to find sum of series. 
 static int sumOfSeries(int n) 
{ 
    int sum = 0; 
    for (int i = 1; i <= n; i++) 
       sum = sum + (2 * i - 1) * (2 * i - 1); 
    return sum; 
} 
  
// Driver code 
  public static void  main(String[] args) 
{ 
    int n = 10; 
    System.out.println( sumOfSeries(n));     
} 
      
} 

