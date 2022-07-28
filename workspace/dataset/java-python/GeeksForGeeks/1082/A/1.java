

// Java program to count numbers in a range  
// that are divisible by all array elements 
class GFG 
{ 
      
// Function to calculate gcd 
static int __gcd(int a, int b) 
{ 
        
    // Everything divides 0  
    if (a == 0 || b == 0) 
        return 0; 
    
    // base case 
    if (a == b) 
        return a; 
    
    // a is greater 
    if (a > b) 
        return __gcd(a - b, b); 
            
    return __gcd(a, b - a); 
} 
      
// Function to find the lcm of array 
static int findLCM(int arr[], int n) 
{ 
    int lcm = arr[0]; 
  
    // Iterate in the array 
    for (int i = 1; i < n; i++)  
    { 
  
        // Find lcm 
        lcm = (lcm * arr[i]) / __gcd(arr[i], lcm); 
    } 
  
    return lcm; 
} 
  
// Function to return the count of numbers 
static int countNumbers(int arr[], int n,  
                        int l, int r) 
{ 
  
    // Function call to find the 
    // LCM of N numbers 
    int lcm = findLCM(arr, n); 
  
    // Return the count of numbers 
    int count = (r / lcm) - ((l - 1) / lcm); 
  
    return count; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 4, 2 }; 
    int n = arr.length; 
    int l = 1, r = 10; 
  
    System.out.println(countNumbers(arr, n, l, r)); 
} 
} 
  
// This code is contributed by Mukul Singh 

