

// Java program to count numbers  
// with N digits which consists  
// of odd number of 0's 
import java.io.*; 
  
class GFG  
{ 
  
// Function to count Numbers 
// with N digits which consists 
// of odd number of 0's 
static int countNumbers(int N) 
{ 
    return (int)(Math.pow(10, N) -  
                 Math.pow(8, N)) / 2; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 5; 
    System.out.println(countNumbers(n)); 
} 
} 
  
// This code is contributed by Shashank 

