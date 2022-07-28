

// Java program to find the largest number 
// from the array after n deletions 
import java.util.*; 
  
class GFG  
{ 
  
// Returns maximum element from arr[0..m-1] after deleting 
// elements from del[0..n-1] 
static int findlargestAfterDel(int arr[], int m, 
                               int del[], int n) 
{ 
    // Hash Map of the numbers to be deleted 
    HashMap<Integer, 
            Integer> mp = new HashMap<Integer, 
                                      Integer>(); 
    for (int i = 0; i < n; ++i)  
    { 
  
        // Increment the count of del[i] 
        if(mp.containsKey(del[i])) 
        { 
            mp.put(del[i], mp.get(del[i]) + 1); 
        } 
        else
        { 
            mp.put(del[i], 1); 
        } 
    } 
  
    // Initializing the largestElement 
    int largestElement = Integer.MIN_VALUE; 
  
    for (int i = 0; i < m; i++)  
    { 
  
        // Search if the element is present 
        if (mp.containsKey(arr[i]))  
        { 
  
            // Decrement its frequency 
            mp.put(arr[i], mp.get(arr[i]) - 1); 
  
            // If the frequency becomes 0, 
            // erase it from the map 
            if (mp.get(arr[i]) == 0) 
                mp.remove(arr[i]); 
        } 
  
        // Else compare it largestElement 
        else
            largestElement = Math.max(largestElement, arr[i]); 
    } 
    return largestElement; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int array[] = { 5, 12, 33, 4, 56, 12, 20 }; 
    int m = array.length; 
  
    int del[] = { 12, 33, 56, 5 }; 
    int n = del.length; 
  
    System.out.println(findlargestAfterDel(array, m, del, n));     
} 
} 
  
// This code is contributed by Rajput-Ji 

