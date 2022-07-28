

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the largest number 
// that divides the maximum elements 
// fom the given array 
static int findLargest(int[] arr, int n) 
{ 
  
    // Finding gcd of all the numbers 
    // in the array 
    int gcd = 0; 
    for (int i = 0; i < n; i++) 
        gcd = __gcd(arr[i], gcd); 
    return gcd; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0 ? a : __gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 6, 9 }; 
    int n = arr.length; 
  
    System.out.print(findLargest(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

