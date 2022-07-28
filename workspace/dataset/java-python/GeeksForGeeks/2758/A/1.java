

// Java program to find length of the longest 
// subarray with all fibonacci numbers 
import java.util.*; 
  
class GFG{ 
static final int N = 100000; 
   
// Function to create hash table 
// to check for Fibonacci numbers 
static void createHash(HashSet<Integer> hash, 
                int maxElement) 
{ 
   
    // Insert first two fibnonacci numbers 
    int prev = 0, curr = 1; 
   
    hash.add(prev); 
    hash.add(curr); 
   
    while (curr <= maxElement) { 
   
        // Summation of last two numbers 
        int temp = curr + prev; 
   
        hash.add(temp); 
   
        // Update the variable each time 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to find the 
// longest fibonacci subarray 
static int longestFibSubarray( 
    int arr[], int n) 
{ 
   
    // Find maximum value in the array 
    int max_val = Arrays.stream(arr).max().getAsInt(); 
   
    // Creating a set 
    // containing Fibonacci numbers 
    HashSet<Integer> hash = new HashSet<Integer>(); 
   
    createHash(hash, max_val); 
   
    int []left = new int[n]; 
    int []right = new int[n]; 
    int fibcount = 0, res = -1; 
   
    // Left array is used to count number of 
    // continuous fibonacci numbers starting 
    // from left of current element 
    for (int i = 0; i < n; i++) { 
   
        left[i] = fibcount; 
   
        // Check if current element 
        // is a fibonacci number 
        if (hash.contains(arr[i])) { 
            fibcount++; 
        } 
   
        else
            fibcount = 0; 
    } 
   
    // Right array is used to count number of 
    // continuous fibonacci numbers starting 
    // from right of current element 
    fibcount = 0; 
   
    for (int i = n - 1; i >= 0; i--) { 
   
        right[i] = fibcount; 
   
        // Check if current element 
        // is a fibonacci number 
        if (hash.contains(arr[i])) { 
            fibcount++; 
        } 
        else
            fibcount = 0; 
    } 
   
    for (int i = 0; i < n; i++) 
        res = Math.max( 
            res, 
            left[i] + right[i]); 
   
    return res; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int arr[] = { 2, 8, 5, 7, 3, 5, 7 }; 
    int n = arr.length; 
   
    System.out.print(longestFibSubarray(arr, n) 
         +"\n"); 
   
} 
} 
  
// This code is contributed by PrinciRaj1992 

