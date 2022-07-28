

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
static int N = 100005; 
  
static int []lpf = new int[N]; 
  
// Function to calculate least 
// prime factor of each number 
static void least_prime_factor() 
{ 
    for (int i = 2; i < N; i++) 
  
        // If it is a prime number 
        if (lpf[i] % 2 != 1) 
  
            for (int j = i; j < N; j += i) 
  
                // For all multiples which are not 
                // visited yet. 
                if (lpf[j] % 2 != 0) 
                    lpf[j] = i; 
} 
  
// Function to find the value of Mobius function 
// for all the numbers from 1 to n 
static void Mobius(int n) 
{ 
    // To store the values of Mobius function 
    int []mobius = new int[N]; 
  
    for (int i = 1; i < N; i++)  
    { 
  
        // If number is one 
        if (i == 1) 
            mobius[i] = 1; 
        else
        { 
  
            // If number has a squared prime factor 
            if (lpf[i / lpf[i]] == lpf[i]) 
                mobius[i] = 0; 
  
            // Multiply -1 with the previous number 
            else
                mobius[i] = -1 * mobius[i / lpf[i]]; 
        } 
    } 
  
    for (int i = 1; i <= n; i++) 
        System.out.print(mobius[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
    Arrays.fill(lpf, -1); 
      
    // Function to find least prime factor 
    least_prime_factor(); 
  
    // Function to find mobius function 
    Mobius(n); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

