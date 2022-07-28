

/* Java program to count number of sub-arrays in which  
number of occurrence of x is equal to that of y 
    using brute force */
import java.util.*; 
  
class solution 
{ 
  
static int sameOccurrence(int arr[], int n, int x, int y) 
{ 
    int result = 0; 
  
    // Check for each subarray for the required condition 
    for (int i = 0; i <= n - 1; i++) { 
        int ctX = 0, ctY = 0; 
        for (int j = i; j <= n - 1; j++) { 
            if (arr[j] == x)  
                ctX += 1; 
            else if (arr[j] == y)  
                ctY += 1; 
            if (ctX == ctY)  
                result += 1;          
        } 
    } 
  
    return (result); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 2, 3, 4, 1 }; 
    int n = arr.length; 
    int x = 2, y = 3; 
    System.out.println(sameOccurrence(arr, n, x, y)); 
  
} 
} 
  
// This code is contributed by 
// Sahil_shelangia 

