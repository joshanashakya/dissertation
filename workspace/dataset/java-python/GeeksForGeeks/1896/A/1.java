

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX = 100000; 
  
// Map to store the divisor count 
static int []divisors = new int[MAX]; 
  
// Function to generate the divisors 
// of all the array elements 
static void generateDivisors(int n) 
{ 
    for (int i = 1; i <= Math.sqrt(n); i++)  
    { 
        if (n % i == 0)  
        { 
            if (n / i == i) 
            { 
                divisors[i]++; 
            } 
            else 
            { 
                divisors[i]++; 
                divisors[n / i]++; 
            } 
        } 
    } 
} 
  
// Function to find the maximum number 
// of multiples in an array before it 
static int findMaxMultiples(int []arr, int n) 
{ 
    // To store the maximum divisor count 
    int ans = 0; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // Update ans if more number 
        // of divisors are found 
        ans = Math.max(divisors[arr[i]], ans); 
  
        // Generating all the divisors of 
        // the next element of the array 
        generateDivisors(arr[i]); 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 8, 1, 28, 4, 2, 6, 7 }; 
    int n = arr.length; 
  
    System.out.print(findMaxMultiples(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

