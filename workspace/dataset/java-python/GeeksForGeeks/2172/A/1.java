

// Java program to Find the count  
// of the numbers in the given  
// range such that the sum of its 
// digit is equal to the sum of  
// all its prime factors digits sum. 
import java.io.*; 
  
class GFG  
{ 
  
// maximum size of number 
static int MAXN = 100005; 
  
// array to store smallest  
// prime factor of number 
static int spf[] = new int[MAXN]; 
  
// array to store sum  
// of digits of a number 
static int sum_digits[] = new int[MAXN]; 
  
// boolean array to check 
// given number is countable 
// for required answer or not. 
static boolean isValid[] = new boolean[MAXN]; 
  
// prefix array to store answer 
static int ans[] = new int[MAXN]; 
  
// Calculating SPF (Smallest 
// Prime Factor) for every 
// number till MAXN. 
static void Smallest_prime_factor() 
{ 
    // marking smallest prime factor  
    // for every number to be itself. 
    for (int i = 1; i < MAXN; i++) 
        spf[i] = i; 
  
    // separately marking spf  
    // for every even number as 2 
    for (int i = 4; i < MAXN; i += 2) 
        spf[i] = 2; 
  
    for (int i = 3;  
             i * i <= MAXN; i += 2) 
  
        // checking if i is prime 
        if (spf[i] == i) 
  
            // marking SPF for all 
            // numbers divisible by i 
            for (int j = i * i;  
                     j < MAXN; j += i) 
  
                // marking spf[j] if it 
                // is not previously marked 
                if (spf[j] == j) 
                    spf[j] = i; 
} 
  
// Function to find sum  
// of digits in a number 
static int Digit_Sum(int copy) 
{ 
    int d = 0; 
    while (copy > 0)  
    { 
        d += copy % 10; 
        copy /= 10; 
    } 
  
    return d; 
} 
  
// find sum of digits of  
// all numbers up to MAXN 
static void Sum_Of_All_Digits() 
{ 
    for (int n = 2; n < MAXN; n++) 
    { 
        // add sum of digits of least  
        // prime factor and n/spf[n] 
        sum_digits[n] = sum_digits[n / spf[n]]  
                          + Digit_Sum(spf[n]); 
  
        // if it is valid make isValid true 
        if (Digit_Sum(n) == sum_digits[n]) 
            isValid[n] = true; 
    } 
  
    // prefix sum to compute answer 
    for (int n = 2; n < MAXN; n++)  
    { 
        if (isValid[n]) 
            ans[n] = 1; 
        ans[n] += ans[n - 1]; 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    Smallest_prime_factor(); 
    Sum_Of_All_Digits(); 
      
    // declaration 
    int l, r; 
      
    // print answer for required range 
    l = 2; r = 3; 
    System.out.println("Valid numbers in the range " +  
                               l + " " + r + " are " +  
                              (ans[r] - ans[l - 1] )); 
      
    // print answer for required range 
    l = 2; r = 10; 
    System.out.println("Valid numbers in the range " +  
                               l + " " + r + " are " +  
                               (ans[r] - ans[l - 1])); 
} 
} 
  
// This code is contributed 
// by Inder 

