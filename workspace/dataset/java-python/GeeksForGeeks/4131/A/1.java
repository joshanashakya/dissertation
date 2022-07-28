

// Java implementation to find the transition point 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the transition point 
static int findTransitionPoint(int arr[], int n) 
{ 
    // perform a linear search and return the index of  
    // first 1 
    for(int i = 0; i < n ; i++) 
    if(arr[i] == 1) 
        return i; 
  
    // if no element is 1 
    return -1; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int arr[] = {0, 0, 0, 0, 1, 1}; 
    int n = arr.length; 
      
    int point = findTransitionPoint(arr, n); 
      
    if (point >= 0) 
        System.out.print("Transition point is " + point); 
    else
        System.out.print("There is no transition point"); 
} 
} 
  
// This code is contributed by shivanisinghss2110 

