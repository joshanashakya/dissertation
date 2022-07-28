

// Java program to find numbers 
// that divide X and Y 
// to produce the same remainder 
class GFG{ 
   
// Function to find 
// the required number as M 
static void printModulus(int X, int Y) 
{ 
    // Finding the maximum 
    // value among X and Y 
    int n = Math.max(X, Y); 
   
    // Loop to iterate through 
    // maximum value among X and Y. 
    for (int i = 1; i <= n; i++) { 
   
        // If the condition satisfies, then 
        // print the value of M 
        if (X % i == Y % i) 
            System.out.print(i + " "); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int X, Y; 
    X = 10; 
    Y = 20; 
    printModulus(X, Y); 
} 
} 
  
// This code is contributed by Princi Singh 

