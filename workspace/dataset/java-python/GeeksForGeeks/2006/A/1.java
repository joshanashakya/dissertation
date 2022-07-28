

// Java  program to Find the sum of  
// first N odd Fibonacci numbers  
  
import java.io.*; 
  
class GFG { 
    static int mod =1000000007;  
  
// Function to calculate sum of first  
// N odd Fibonacci numbers  
static  int sumOddFibonacci(int n)  
{  
     int Sum[]=new int[n + 1];  
  
    // base values  
    Sum[0] = 0;  
    Sum[1] = 1;  
    Sum[2] = 2;  
    Sum[3] = 5;  
    Sum[4] = 10;  
    Sum[5] = 23;  
  
    for (int i = 6; i <= n; i++) {  
        Sum[i] = ((Sum[i - 1] + (4 * Sum[i - 2]) % mod -  
                (4 * Sum[i - 3]) % mod + mod) % mod +  
                (Sum[i - 4] - Sum[i - 5] + mod) % mod) % mod;  
    }  
  
    return Sum[n];  
}  
  
// Driver code  
      
    public static void main (String[] args) { 
  
    int n = 6;  
    System.out.println(sumOddFibonacci(n)); 
    } 
//This Code is Contributed by Sachin     
} 

