

// Java progarm to maximum value of  
// division of two numbers in an array 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Function to maximum value of  
// division of two numbers in an array 
static int Divison(int a[], int n) 
{ 
    int maxi = Integer.MIN_VALUE,  
        mini = Integer.MAX_VALUE; 
      
    // Traverse through the array 
    for (int i = 0; i < n; i++) 
    { 
        maxi = Math.max(a[i], maxi); 
        mini = Math.min(a[i], mini); 
    } 
      
    // Return the required answer 
    return maxi / mini; 
} 
  
// Driver code 
public static void main (String[] args) 
              throws java.lang.Exception 
{ 
    int a[] = {3, 7, 9, 3, 11}; 
      
    int n = a.length; 
      
    System.out.print(Divison(a, n)); 
} 
} 
  
// This code is contributed by Nidhiva 

