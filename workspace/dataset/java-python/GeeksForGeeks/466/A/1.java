

// Java program to print the Fibonacci numbers 
// present at K-th level of a Binary Tree 
import java.util.*; 
  
class GFG{ 
   
// Initializing the max value 
static final int MAX_SIZE = 100005; 
   
// Array to store all the 
// fibonacci numbers 
static int []fib = new int[MAX_SIZE + 1]; 
   
// Function to generate fibonacci numbers 
// using Dynamic Programming 
static void fibonacci() 
{ 
    int i; 
   
    // 0th and 1st number of the series 
    // are 0 and 1 
    fib[0] = 0; 
    fib[1] = 1; 
   
    for (i = 2; i <= MAX_SIZE; i++) { 
   
        // Add the previous two numbers in the 
        // series and store it 
        fib[i] = fib[i - 1] + fib[i - 2]; 
    } 
} 
   
// Function to print the Fibonacci numbers 
// present at Kth level of a Binary Tree 
static void printLevel(int level) 
{ 
    // Finding the left and right index 
    int left_index = (int) Math.pow(2, level - 1); 
    int right_index = (int) (Math.pow(2, level) - 1); 
   
    // Iterating and printing the numbers 
    for (int i = left_index; 
         i <= right_index; i++) { 
   
        System.out.print(fib[i - 1]+ " "); 
    } 
    System.out.println(); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // Precomputing Fibonacci numbers 
    fibonacci(); 
   
    int K = 4; 
    printLevel(K); 
} 
} 
  
// This code is contributed by Rajput-Ji 

