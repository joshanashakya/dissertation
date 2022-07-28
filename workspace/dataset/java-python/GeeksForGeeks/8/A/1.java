

// Java program to find 
// prime divisors of 
// all numbers from 1 to n 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
      
// function to find prime  
// divisors of all numbers  
// from 1 to n 
static int Sum(int N) 
{ 
    int SumOfPrimeDivisors[] = new int[N + 1]; 
      
  
    for (int i = 2; i <= N; ++i)  
    { 
  
        // if the number is prime 
        if (SumOfPrimeDivisors[i] == 0)  
        { 
  
            // add this prime to 
            // all it's multiples 
            for (int j = i; j <= N; j += i)  
            { 
  
                SumOfPrimeDivisors[j] += i; 
            } 
        } 
    } 
    return SumOfPrimeDivisors[N]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int N = 60; 
    System.out.print("Sum of prime " +  
                "divisors of 60 is " +  
                       Sum(N) + "\n"); 
} 
} 

