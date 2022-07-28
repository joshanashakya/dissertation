

// Java program to count number less 
// than N which are product of 
// any two perfect squares 
import java.util.*; 
  
  
class solution 
{ 
  
// Function to count number less 
// than N which are product of 
// any two perfect squares 
static int countNumbers(int N) 
{ 
    return (int)Math.sqrt(N) - 1; 
} 
  
// Driver program 
public static void main(String args[]) 
{ 
    int N = 36; 
  
    System.out.println(countNumbers(N)); 
      
} 
  
} 
  
//This code is contributed by 
// Surendra_Gangwar 

