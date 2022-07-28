

// Java program to make the array zero 
// by decrementing value in pairs 
class GFG 
{ 
  
// Function to check if all the elements 
// can be made 0 in an array 
static void canMake(int n, int ar[]) 
{ 
  
    // Variable to store 
    // sum and maximum element 
    // in an array 
    int sum = 0, maxx = -1; 
  
    // Loop to calculate the sum and max value 
    // of the given array 
    for (int i = 0; i < n; i++)  
    { 
        sum += ar[i]; 
        maxx = Math.max(maxx, ar[i]); 
    } 
  
    // If n is 1 or sum is odd or 
    // sum - max element < max 
    // then no solution 
    if (n == 1 || sum % 2 == 1
        || sum - maxx < maxx)  
    { 
        System.out.print("No\n"); 
    } 
    else 
    { 
  
        // For the remaining case, print Yes 
        System.out.print("Yes\n"); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int n = 6; 
    int arr[] = { 1, 1, 2, 3, 6, 11 }; 
  
    canMake(n, arr); 
} 
} 
  
// This code is contributed by 29AjayKumar 

