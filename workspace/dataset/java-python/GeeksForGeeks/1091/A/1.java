

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
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
// aint the elements of the array 
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
  
// Function to return the smaintest perfect cube 
// divisible by aint the elements of arr[] 
static int minPerfectCube(int arr[], int n) 
{ 
    int minPerfectCube; 
  
    // LCM of all the elements of arr[] 
    int lcm = lcmOfArray(arr, n); 
    minPerfectCube = lcm; 
  
    int cnt = 0; 
    while (lcm > 1 && lcm % 2 == 0) 
    { 
        cnt++; 
        lcm /= 2; 
    } 
  
    // If 2 divides lcm cnt number of times 
    if (cnt % 3 == 2) 
        minPerfectCube *= 2; 
    else if (cnt % 3 == 1) 
        minPerfectCube *= 4; 
  
    int i = 3; 
  
    // Check aint the numbers that divide lcm 
    while (lcm > 1)  
    { 
        cnt = 0; 
        while (lcm % i == 0) 
        { 
            cnt++; 
            lcm /= i; 
        } 
  
        if (cnt % 3 == 1) 
            minPerfectCube *= i * i; 
        else if (cnt % 3 == 2) 
            minPerfectCube *= i; 
  
        i += 2; 
    } 
  
    // Return the answer 
    return minPerfectCube; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 10, 125, 14, 42, 100 }; 
    int n = arr.length; 
    System.out.println(minPerfectCube(arr, n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

