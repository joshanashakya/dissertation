

// Java program to find bitonicity 
// of an array 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// Function to find the bitonicity 
// of an array 
static int findBitonicity(int[] arr,  
                          int n) 
{ 
    int bt = 0; 
  
    for (int i = 1; i < n; i++)  
    { 
        if (arr[i] > arr[i - 1]) 
            bt++; 
        else if (arr[i] < arr[i - 1]) 
            bt--; 
    } 
  
    return bt; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 3, 4, 5, 6, 4, 3 }; 
  
    int n = arr.length; 
  
    System.out.print("Bitonicity = " +  
              findBitonicity(arr, n)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai 

