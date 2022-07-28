

// Java program to find the sum of all the integers 
// below N which are multiples of either A or B 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to return the sum of all the integers 
// below N which are multiples of either A or B 
static int findSum(int n, int a, int b) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
  
        // If i is a multiple of a or b 
        if (i % a == 0 || i % b == 0) 
            sum += i; 
  
    return sum; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        int n = 10, a = 3, b = 5; 
    System.out.println( findSum(n, a, b)); 
    } 
} 
// This code is contributed by anuj_67.. 

