

// Java program to check whether the 
// sum of fibonacci elements of the 
// array is a Fibonacci number or not 
import java.util.*; 
  
class GFG{ 
  
static final int MAX = 100005; 
  
// Hash to store the Fibonacci 
// numbers up to Max 
static HashSet<Integer> fibonacci = new HashSet<Integer>(); 
   
// Function to create the hash table 
// to check Fibonacci numbers 
static void createHash() 
{ 
    // Inserting the first two Fibonacci 
    // numbers into the hash 
    int prev = 0, curr = 1; 
    fibonacci.add(prev); 
    fibonacci.add(curr); 
   
    // Add the remaining Fibonacci numbers 
    // based on the previous two numbers 
    while (curr <= MAX) { 
        int temp = curr + prev; 
        fibonacci.add(temp); 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to check if the sum of 
// Fibonacci numbers is Fibonacci or not 
static boolean checkArray(int arr[], int n) 
{ 
    // Find the sum of 
    // all Fibonacci numbers 
    int sum = 0; 
   
    // Iterating through the array 
    for (int i = 0; i < n; i++) 
        if (fibonacci.contains(arr[i])) 
            sum += arr[i]; 
   
    // If the sum is Fibonacci 
    // then return true 
    if (fibonacci.contains(sum)) 
        return true; 
   
    return false; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // array of elements 
    int arr[] = { 1, 2, 4, 8, 2 }; 
    int n = arr.length; 
   
    // Creating a set containing 
    // all fibonacci numbers 
    createHash(); 
   
    if (checkArray(arr, n)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

