

// Java program to find minimum and maximum 
// fibonacci number in given array 
import java.util.*; 
  
class GFG{ 
   
// Function to create hash table 
// to check Fibonacci numbers 
static void createHash(HashSet<Integer> hash, 
                int maxElement) 
{ 
    // Insert initial two numbers 
    // in the hash table 
    int prev = 0, curr = 1; 
    hash.add(prev); 
    hash.add(curr); 
   
    while (curr <= maxElement) { 
   
        // Sum of previous two numbers 
        int temp = curr + prev; 
   
        hash.add(temp); 
   
        // Update the variable each time 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to find minimum and maximum 
// fibonacci number in given array 
static void fibonacci(int arr[], int n) 
{ 
   
    // Find maximum value in the array 
    int max_val= Arrays.stream(arr).max().getAsInt(); 
   
    // Creating a set containing 
    // all Fibonacci numbers up to 
    // maximum value in the array 
    HashSet<Integer> hash = new HashSet<Integer>(); 
    createHash(hash, max_val); 
   
    // For storing the Minimum 
    // and Maximum Fibonacci number 
    int minimum = Integer.MAX_VALUE; 
    int maximum = Integer.MIN_VALUE; 
   
    for (int i = 0; i < n; i++) { 
   
        // Check if current element 
        // is a fibonacci number 
        if (hash.contains(arr[i])) { 
   
            // Update the maximum and 
            // minimum accordingly 
            minimum = Math.min(minimum, arr[i]); 
            maximum = Math.max(maximum, arr[i]); 
        } 
    } 
   
    System.out.print(minimum+ ", "
         + maximum +"\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
    int n = arr.length; 
   
    fibonacci(arr, n); 
   
} 
} 
  
// This code is contributed by sapnasingh4991 

