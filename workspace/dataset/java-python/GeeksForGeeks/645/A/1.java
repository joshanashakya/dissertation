

// Java program to remove all the 
// fibonacci numbers from the 
// given array 
import java.util.*; 
  
class GFG{ 
   
static int sz = (int) 1e3; 
   
// Set to store all the Fibonacci numbers 
static HashSet<Integer> fib = new HashSet<Integer>(); 
   
// Function to generate Fibonacci numbers using 
// Dynamic Programming and create hash table 
// to check Fibonacci numbers 
static void fibonacci() 
{ 
    // Storing the first two Fibonacci 
    // numbers in the set 
    int prev = 0, curr = 1, len = 2; 
    fib.add(prev); 
    fib.add(curr); 
   
    // Compute the remaining Fibonacci numbers 
    // until the max size and store them 
    // in the set 
    while (len <= sz) { 
        int temp = curr + prev; 
        fib.add(temp); 
        prev = curr; 
        curr = temp; 
        len++; 
    } 
} 
   
// Function to print the elements of the array 
static void printArray(int arr[], int len) 
{ 
    for (int i = 0; i < len; i++) { 
        System.out.print(arr[i] +" "); 
    } 
} 
   
// Function to remove all the Fibonacci numbers 
// from the array 
static void removeFibonacci(int arr[], int len) 
{ 
    // Creating a set containing 
    // all the fibonacci numbers 
    fibonacci(); 
   
    // Traverse the array 
    for (int i = 0; i < len; i++) { 
   
        // If the current element is fibonacci 
        if (fib.contains(arr[i])) { 
   
            // Shift all the elements on the 
            // right of it to the left 
            for (int j = i; j < len - 1; j++) { 
                arr[j] = arr[j + 1]; 
            } 
   
            // Decrease the loop counter by 1 
            // to check the shifted element 
            i--; 
   
            // Decrease the length 
            len--; 
        } 
    } 
   
    // Print the updated array 
    printArray(arr, len); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 6, 5, 3, 8, 7, 
                  10, 11, 14, 15 }; 
   
    int len = arr.length; 
    removeFibonacci(arr, len); 
} 
} 
  
// This code is contributed by 29AjayKumar 

