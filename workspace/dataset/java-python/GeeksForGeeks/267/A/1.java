

// Java program to check whether the given array 
// is perfect or not. 
import java.util.*; 
  
class Node  
{ 
      
static boolean checkUnimodal(int arr[], int n) 
{ 
    // Cover first strictly increasing part 
    int i = 1; 
    while (i < n && arr[i] > arr[i - 1]) 
        ++i; 
  
    // Cover middle equal part 
    while (i < n && arr[i] == arr[i - 1]) 
        ++i; 
  
    // Cover last decreasing part 
    while (i < n &&arr[i] < arr[i - 1]) 
        ++i; 
  
    // Return true if we reached end. 
    return (i == n); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 5, 5, 5, 4, 2 }; 
    int n = arr.length; 
    if (checkUnimodal(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

