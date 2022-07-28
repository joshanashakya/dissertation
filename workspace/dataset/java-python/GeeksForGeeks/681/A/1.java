

// Java program to check if array has an 
// element whose value is half of array 
// sum. 
  
import java.io.*; 
  
class GFG { 
  
// Function to check if answer exists 
static boolean checkForElement(int array[], int n) 
{ 
    // Sum of all array elements 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += array[i];  
  
    // If sum is odd  
    if (sum % 2>0)  
    return false; 
  
    sum /= 2; // If sum is Even 
  
    // Do binary search for the required element 
    int start = 0; 
    int end = n - 1; 
    while (start <= end)  
    { 
        int mid = start + (end - start) / 2; 
        if (array[mid] == sum)  
            return true;      
        else if (array[mid] > sum)  
            end = mid - 1;      
        else
            start = mid + 1; 
    } 
  
    return false; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    int array[] = { 1, 2, 3 }; 
    int n = array.length; 
    if (checkForElement(array, n)) 
    System.out.println( "Yes"); 
    else
    System.out.println( "No"); 
    } 
} 
// This code is contributed by anuj_67.. 

