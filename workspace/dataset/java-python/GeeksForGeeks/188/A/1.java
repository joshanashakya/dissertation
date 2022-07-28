

// Java program to represent K^N 
// as the sum of exactly N numbers 
import java.util.*; 
  
class GFG{ 
   
// Function to print N numbers whose 
// sum is a power of K 
static void print(int n, int k) 
{ 
    // Printing K ^ 1 
    System.out.print(k+ " "); 
   
    // Loop to print the difference of 
    // powers from K ^ 2 
    for (int i = 2; i <= n; i++) { 
        int x = (int) (Math.pow(k, i) - Math.pow(k, i - 1)); 
        System.out.print(x+ " "); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 3, K = 4; 
    print(N, K); 
} 
} 
  
// This code is contributed by 29AjayKumar 

