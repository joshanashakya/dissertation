

// Java Program to find  
// Sum of first n terms 
import java.util.*; 
  
class solution 
{ 
static int calculateSum(int n) 
{ 
  
// Returning the final sum 
return ((int)Math.pow(10, n + 1) * (9 * n - 1) + 10) /  
                (int)Math.pow(9, 3) - n * (n + 1) / 18; 
} 
  
// Driver code 
public static void main(String ar[]) 
{ 
// no. of terms to find the sum 
int n=3; 
System.out.println("Sum= "+ calculateSum(n)); 
  
} 
} 
  
//This code is contributed by Surendra_Gangwar 

