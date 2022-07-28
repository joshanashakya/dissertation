

// Java program to find the length of the 
// largest sub-array of an array every 
// element of whose is a perfect square 
import java.io.*; 
  
class GFG { 
      
  
  
// function to return the length of the 
// largest sub-array of an array every 
// element of whose is a perfect square 
 static int contiguousPerfectSquare(int []arr, int n) 
{ 
    int a; 
    float b; 
  
    int current_length = 0; 
    int max_length = 0; 
  
    for (int i = 0; i < n; i++) { 
        b = (float)Math.sqrt(arr[i]); 
        a = (int)b; 
  
        // if both a and b are equal then 
        // arr[i] is a perfect square 
        if (a == b) 
            current_length++; 
        else
            current_length = 0; 
  
        max_length = Math.max(max_length, current_length); 
    } 
    return max_length; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int arr[] = { 9, 75, 4, 64, 121, 25 }; 
    int n = arr.length; 
  
    System.out.print(contiguousPerfectSquare(arr, n)); 
    } 
} 
// This code is contributed by inder_verma.. 

