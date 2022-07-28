

// Java program to find the frequency of 
// minimum element in the array 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the frequency of the 
// smallest value in the array 
static int frequencyOfSmallest(int n, int arr[]) 
{ 
    int mn = arr[0], freq = 1; 
  
    for (int i = 1; i < n; i++)  
    { 
  
        // If current element is smaller 
        // than minimum 
        if (arr[i] < mn) 
        { 
            mn = arr[i]; 
            freq = 1; 
        } 
          
        // If current element is equal 
        // to smallest 
        else if (arr[i] == mn) 
            freq++; 
    } 
    return freq; 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        int N = 5; 
        int arr[] = { 3, 2, 3, 4, 4 }; 
        System.out.println (frequencyOfSmallest(N, arr)); 
    } 
} 
  
// This code is contributed by Tushil. 

