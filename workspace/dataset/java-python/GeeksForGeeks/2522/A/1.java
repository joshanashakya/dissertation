

// Java program to maximize profit 
import java.util.*; 
  
class GFG 
{ 
  
// Function that maximizes the sum 
static int maximize(int A1[], int A2[], int n, 
            int x, int y) 
{ 
    // Array to store the loss 
    int[] c = new int[n]; 
  
    // Initial sum 
    int sum = 0; 
  
    // Generate the array C 
    for (int i = 0; i < n; i++)  
    { 
        c[i] = A2[i] - A1[i]; 
        sum += A1[i]; 
    } 
  
    // Sort the array elements 
    // in descending order 
int temp; 
for(int i = 0; i < n - 1; i++) 
{ 
    if(c[i] < c[i+1]) 
    { 
        temp = c[i]; 
        c[i] = c[i + 1]; 
        c[i + 1] = temp; 
    } 
} 
  
    // Variable to store the answer 
    int maxi = -1; 
  
    // Iterate in the array, C 
    for (int i = 0; i < n; i++)  
    { 
  
        // Subtract the loss 
        sum += c[i]; 
  
        // Check if X orders are going 
        // to be used 
        if (i + 1 >= (n - x)) 
            maxi = Math.max(sum, maxi); 
    } 
  
    return maxi; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int A1[] = { 1, 2, 3, 4, 5 }; 
    int A2[] = { 5, 4, 3, 2, 1 }; 
  
    int n = 5; 
    int x = 3, y = 3; 
  
    System.out.println(maximize(A1, A2, n, x, y)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

