

// Java implementation of above approach 
class GFG  
{ 
  
// Function to count the divisors 
static int countDivisors(int n) 
{ 
int count = 0; 
  
// Note that this loop  
// runs till square root 
for (int i = 1; i <= Math.sqrt(n); i++)  
{ 
    if (n % i == 0)  
    { 
  
        // If divisors are equal, 
        // print only one 
        if (n / i == i) 
            count++; 
  
        else // Otherwise print both 
            count += 2; 
    } 
} 
  
return count; 
} 
  
// Function to count the number  
// with maximum divisors 
static int MaximumDivisors(int X, int Y) 
{ 
int maxDivisors = 0, result = 0; 
  
// to store number of divisors 
int[] arr = new int[Y - X + 1]; 
  
// Traverse from X to Y 
for (int i = X; i <= Y; i++)  
{ 
  
    // Count the number of divisors of i 
    int Div = countDivisors(i); 
  
    // Store the value of div in an array 
    arr[i - X] = Div; 
  
    // Update the value of maxDivisors 
    maxDivisors = Math.max(Div, maxDivisors); 
  
} 
  
// Traverse the array  
for (int i = 0; i < (Y - X + 1); i++) 
  
    // Count the value equals  
    // to maxDivisors 
    if (arr[i] == maxDivisors) 
        result++; 
  
return result; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int X = 1, Y = 10; 
  
    // function call 
    System.out.println(MaximumDivisors(X, Y)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

