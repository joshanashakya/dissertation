

// Java Program to find the 
// product of first N factorials 
  
class GFG{ 
// To compute (a * b) % MOD 
static double mulmod(long a, long b,  
                                    long mod) 
{ 
    long res = 0; // Initialize result 
    a = a % mod; 
    while (b > 0) { 
  
        // If b is odd, add 'a' to result 
        if (b % 2 == 1) 
            res = (res + a) % mod; 
  
        // Multiply 'a' with 2 
        a = (a * 2) % mod; 
  
        // Divide b by 2 
        b /= 2; 
    } 
  
    // Return result 
    return res % mod; 
} 
  
// This function computes factorials and 
// product by using above function i.e. 
// modular multiplication 
static long findProduct(long N) 
{ 
    // Initialize product and fact with 1 
    long product = 1, fact = 1; 
    long MOD = (long)(1e9 + 7); 
    for (int i = 1; i <= N; i++) { 
  
        // ith factorial 
        fact = (long)mulmod(fact, i, MOD); 
  
        // product of first i factorials 
        product = (long)mulmod(product, fact, MOD); 
  
        // If at any iteration, product becomes 
        // divisible by MOD, simply return 0; 
        if (product == 0) 
            return 0; 
    } 
    return product; 
} 
  
// Driver Code to Test above functions 
public static void main(String[] args) 
{ 
    long N = 3; 
    System.out.println(findProduct(N)); 
  
    N = 5; 
    System.out.println(findProduct(N)); 
  
} 
} 
// this Code is contributed by mits 

