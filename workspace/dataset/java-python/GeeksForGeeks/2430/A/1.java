

// Java program to find the sum of numbers 
// divisible by M in the given range 
import java.util.*; 
  
class GFG{ 
   
// Function to find the sum of numbers 
// divisible by M in the given range 
static int sumDivisibles(int A, int B, int M) 
{ 
    // Variable to store the sum 
    int sum = 0; 
   
    // Running a loop from A to B and check 
    // if a number is divisible by i. 
    for (int i = A; i <= B; i++) 
   
        // If the number is divisible, 
        // then add it to sum 
        if (i % M == 0) 
            sum += i; 
   
    // Return the sum 
    return sum; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // A and B define the range 
    // M is the dividend 
    int A = 6, B = 15, M = 3; 
   
    // Printing the result 
    System.out.print(sumDivisibles(A, B, M) +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

