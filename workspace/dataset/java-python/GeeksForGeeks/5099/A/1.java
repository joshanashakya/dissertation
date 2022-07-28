

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function that returns true 
// if n is a perfect cube 
static boolean checkPerfectcube(int n) 
{ 
    // Takes the sqrt of the number 
    int d = (int)Math.cbrt(n); 
  
    // Checks if it is a perfect 
    // cube number 
    if (d * d * d == n) 
        return true; 
  
    return false; 
} 
  
// Function to return the smallest perfect 
// cube from the array 
static int smallestPerfectCube(int a[], int n) 
{ 
  
    // Stores the minimum of all the 
    // perfect cubes from the array 
    int mini = Integer.MAX_VALUE; 
  
    // Traverse all elements in the array 
    for (int i = 0; i < n; i++)  
    { 
  
        // Store the minimum if current 
        // element is a perfect cube 
        if (checkPerfectcube(a[i])) 
        { 
            mini = Math.min(a[i], mini); 
        } 
    } 
  
    return mini; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a[] = { 16, 8, 25, 2, 3, 10 }; 
  
    int n = a.length; 
  
    System.out.print(smallestPerfectCube(a, n)); 
} 
} 
  
// This code is contributed by anuj_67.. 

