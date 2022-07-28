

// Java implementation to replace maximum element 
// by coefficient of range 
import java.util.*; 
  
class GFG 
{ 
  
// Utility function to print the  
// contents of the array 
static void printArr(float arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Function to replace the maximum  
// element from the array with the  
// coefficient of range of the array 
static void replaceMax(float arr[], int n) 
{ 
    // Maximum element from the array 
    float max = arr[0]; 
    for(int i = 0; i < n; i++) 
    {  
        if(arr[i] > max) 
        max = arr[i]; 
    }  
    // Minimum element from the arra 
    float min = arr[0]; 
    for(int i = 0; i < n; i++) 
    {  
        if(arr[i] < min) 
        min = arr[i]; 
    }  
  
    // Calculate the coefficient of  
    // range for the array 
    float range = max - min; 
    float coeffOfRange = range / (max + min); 
  
    // Assuming all the array elements are distinc 
    // Replace the maximum element with 
    // the coeffient of range of the array 
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] == max)  
        { 
            arr[i] = coeffOfRange; 
            break; 
        } 
    } 
  
    // Print the updated array 
    printArr(arr, n); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    float arr[] = { 15, 16, 10, 9, 6, 7, 17 }; 
    int n = arr.length; 
    replaceMax(arr, n); 
  
} 
} 
  
// This code is contributed by 
// Sahil_Shelangia 

