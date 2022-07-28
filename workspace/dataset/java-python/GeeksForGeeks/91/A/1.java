

// Java implementation of the above approach 
import java.io.*; 
  
class GFG { 
      
static int MAX =100000; 
  
static boolean prime[] = new boolean[MAX]; 
  
// Sieve to find prime 
static void sieve() 
{ 
    for(int i=0;i<MAX;i++) 
    { 
        prime[i] =true; 
    } 
    prime[0] = prime[1] = false; 
    for (int i = 2; i < MAX; i++)  
        if (prime[i])  
            for (int j = 2 * i; j < MAX; j += i) 
                prime[j] = false; 
          
      
} 
  
// Function to check if the sum of 
// prime is prime or not 
static boolean checkArray(int arr[], int n) 
{ 
    // find sum of all prime number 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        if (prime[arr[i]]) 
            sum += arr[i]; 
  
    // if sum is prime 
    // then return yes 
    if (prime[sum]) 
        return true; 
  
    return false; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    // array of elements 
    int arr[] = { 1, 2, 3 }; 
    int n = arr.length; 
  
    sieve(); 
  
    if (checkArray(arr, n)) 
        System.out.println("Yes"); 
    else
         System.out.println("No"); 
  
    } 
} 
// This code is contributed by shs.. 

