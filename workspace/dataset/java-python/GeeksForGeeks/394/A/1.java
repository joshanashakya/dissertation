

// JAVA program to transform N to the minimum value 
import java.util.*; 
  
class GFG{ 
   
// Intialising the answer 
static int min_val = Integer.MAX_VALUE; 
static int min_steps = 0; 
   
// Function to find the digitsum 
static int sumOfDigits(int n) 
{ 
    String s = String.valueOf(n); 
   
    int sum = 0; 
   
    // Iterate over all digits and add them 
    for (int i = 0; i < s.length(); i++) { 
        sum += (s.charAt(i) - '0'); 
    } 
       
    // Return the digit su, 
    return sum; 
} 
   
// Function to transform N to the minimum value 
static void Transform(int n, int d, int steps) 
{ 
    // If the final value is lesser than least value 
    if (n < min_val) { 
        min_val = n; 
        min_steps = steps; 
    } 
   
    // If final value is equal to least value then check  
    // for lesser number of steps to reach this value 
    else if (n == min_val) { 
        min_steps = Math.min(min_steps, steps); 
    } 
   
    // The value will be obtained in less than 15 steps as  
    // proved so applying normal recursive operations 
    if (steps < 15) { 
        Transform(sumOfDigits(n), d, steps + 1); 
        Transform(n + d, d, steps + 1); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 9, D = 3; 
       
    // Function call 
    Transform(N, D, 0); 
       
    // Print the answers 
    System.out.print(min_val+ " " +  min_steps); 
       
} 
} 
  
// This code is contributed by 29AjayKumar 

