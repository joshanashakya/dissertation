

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 1000001; 
  
// Function to return the count of numbers 
// below N whose sum of prime factors is K 
static int countNum(int N, int K) 
{ 
    // To store the sum of prime factors 
    // for all the numbers 
    int []sumPF = new int[MAX]; 
  
    for (int i = 2; i < N; i++)  
    { 
  
        // If i is prime 
        if (sumPF[i] == 0)  
        { 
  
            // Add i to all the numbers 
            // which are divisible by i 
            for (int j = i; j < N; j += i)  
            { 
                sumPF[j] += i; 
            } 
        } 
    } 
  
    // To store the count of required numbers 
    int count = 0; 
    for (int i = 2; i < N; i++) 
    { 
        if (sumPF[i] == K) 
            count++; 
    } 
  
    // Return the required count 
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int N = 20, K = 7; 
  
    System.out.println(countNum(N, K)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

