

// Java program to find number of sets without size A and B 
import java.util.*; 
  
class GFG{ 
static final int mod =(int)(1e9 + 7); 
   
// Function to find a^m1 
static int power(int a, int m1) 
{ 
    if (m1 == 0) 
        return 1; 
    else if (m1 == 1) 
        return a; 
    else if (m1 == 2) 
        return (int) ((1L * a * a) % mod); 
    // If m1 is odd, then return a * a^m1/2 * a^m1/2 
    else if (m1 % 2 == 1) 
        return (int) ((1L * a * power(power(a, m1 / 2), 2)) % mod); 
    else
        return power(power(a, m1 / 2), 2) % mod; 
} 
   
// Function to find factorial of a number 
static int factorial(int x) 
{ 
    int ans = 1; 
    for (int i = 1; i <= x; i++) 
        ans = (int) ((1L * ans * i) % mod); 
   
    return ans; 
} 
   
// Function to find inverse of x 
static int inverse(int x) 
{ 
    return power(x, mod - 2); 
} 
   
// Function to find nCr 
static int binomial(int n, int r) 
{ 
    if (r > n) 
        return 0; 
   
    int ans = factorial(n); 
   
    ans = (int) ((1L * ans * inverse(factorial(r))) % mod); 
   
    ans = (int) ((1L * ans * inverse(factorial(n - r))) % mod); 
   
    return ans; 
} 
   
// Function to find number of sets without size a and b 
static int number_of_sets(int n, int a, int b) 
{ 
    // First calculate all sets 
    int ans = power(2, n); 
   
    // Remove sets of size a 
    ans = ans - binomial(n, a); 
   
    if (ans < 0) 
        ans += mod; 
   
    // Remove sets of size b 
    ans = ans - binomial(n, b); 
   
    // Remove empty set 
    ans--; 
   
    if (ans < 0) 
        ans += mod; 
   
    // Return the required answer 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 4, A = 1, B = 3; 
   
    // Function call 
    System.out.print(number_of_sets(N, A, B)); 
   
} 
} 
  
// This code contributed by sapnasingh4991 

