

// Java implementation of the approach 
// Utility function to print 
// the array elements 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
  
static void printArr(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Function to generate and print 
// the required array 
static void generateArr(int arr[], int n) 
{ 
  
    // To switch the ceil and floor 
    // function alternatively 
    boolean flip = true; 
  
    // For every element of the array 
    for (int i = 0; i < n; i++) 
    { 
  
        // If the number is odd then print the ceil 
        // or floor value after division by 2 
        if ((arr[i] & 1) != 0) 
        { 
  
            // Use the ceil and floor alternatively 
            if (flip ^= true) 
                System.out.print((int)(Math.ceil(arr[i] /  
                                            2.0)) + " "); 
            else
                System.out.print((int)(Math.floor(arr[i] /  
                                            2.0)) + " "); 
        } 
  
        // If arr[i] is even then it will 
        // be completely divisible by 2 
        else
        { 
            System.out.print(arr[i] / 2 +" "); 
        } 
    } 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 3, -5, -7, 9, 2, -2 }; 
    int n = arr.length; 
  
    generateArr(arr, n); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

