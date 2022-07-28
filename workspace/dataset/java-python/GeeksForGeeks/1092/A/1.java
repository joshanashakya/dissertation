

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the gcd of two numbers 
static int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    else
        return gcd(b, a % b); 
} 
  
// Function to return the lcm of 
// all the elements of the array 
static int lcmOfArray(int arr[], int n) 
{ 
    if (n < 1) 
        return 0; 
  
    int lcm = arr[0]; 
  
    // To calculate lcm of two numbers 
    // multiply them and divide the result 
    // by gcd of both the numbers 
    for (int i = 1; i < n; i++) 
        lcm = (lcm * arr[i]) / gcd(lcm, arr[i]); 
  
    // Return the LCM of the array elements 
    return lcm; 
} 
  
// Function to return the smallest perfect square 
// divisible by all the elements of arr[] 
static int minPerfectSquare(int arr[], int n) 
{ 
    int minPerfectSq; 
  
    // LCM of all the elements of arr[] 
    int lcm = lcmOfArray(arr, n); 
    minPerfectSq = (int)lcm; 
  
    // Check if 2 divides lcm odd number of times 
    int cnt = 0; 
    while (lcm > 1 && lcm % 2 == 0) { 
        cnt++; 
        lcm /= 2; 
    } 
    if (cnt % 2 != 0) 
        minPerfectSq *= 2; 
  
    int i = 3; 
  
    // Check all the numbers that divide lcm 
    // odd number of times 
    while (lcm > 1) { 
        cnt = 0; 
        while (lcm % i == 0) { 
            cnt++; 
            lcm /= i; 
        } 
  
        // If i divided lcm odd number of times 
        // then multiply the lcm with i 
        if (cnt % 2 != 0) 
            minPerfectSq *= i; 
  
        i += 2; 
    } 
  
    // Return the answer 
    return minPerfectSq; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 2, 3, 4, 5, 7 }; 
    int n = arr.length; 
    System.out.println(minPerfectSquare(arr, n)); 
  
} 
} 
  
// This code is contributed by 
// Shashank_Sharma 

