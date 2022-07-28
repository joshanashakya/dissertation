

// Java program to find all common 
// divisors of N numbers 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate gcd of 
// two numbers 
static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to print all the 
// common divisors 
static void printAllDivisors(int arr[], int N) 
{ 
    // Variable to find the gcd 
    // of N numbers 
    int g = arr[0]; 
  
    // Set to store all the 
    // common divisors 
    HashSet<Integer> divisors = new HashSet<Integer>(); 
  
    // Finding GCD of the given 
    // N numbers 
    for (int i = 1; i < N; i++)  
    { 
        g = gcd(arr[i], g); 
    } 
  
    // Finding divisors of the 
    // HCF of n numbers 
    for (int i = 1; i * i <= g; i++) 
    { 
        if (g % i == 0)  
        { 
            divisors.add(i); 
            if (g / i != i) 
                divisors.add(g / i); 
        } 
    } 
  
    // Print all the divisors 
    for (int it : divisors) 
        System.out.print(it+ " "); 
} 
  
// Driver's Code 
public static void main(String[] args) 
{ 
    int arr[] = { 6, 90, 12, 18, 30, 24 }; 
    int n = arr.length; 
  
    // Function to print all the 
    // common divisors 
    printAllDivisors(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

