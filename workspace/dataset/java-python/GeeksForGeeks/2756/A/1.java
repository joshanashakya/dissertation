

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that return true if 
// a symmetric is possible with 
// the elements of the array 
static boolean isPlusPossible(int arr[], int n) 
{ 
  
    // Map to store the frequency 
    // of the array elements 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
  
    // Traverse through array elements and 
    // count frequencies 
    for (int i = 0; i < n; i++) 
    { 
        if(mp.containsKey(arr[i])) 
        { 
            mp.put(arr[i], mp.get(arr[i]) + 1); 
        } 
        else
        { 
            mp.put(arr[i], 1); 
        } 
    } 
  
    boolean foundModOne = false; 
  
    // For every unique element 
    for (Map.Entry<Integer,Integer> x : mp.entrySet())  
    { 
        int element = x.getKey(); 
        int frequency = x.getValue(); 
  
        if (frequency % 4 == 0) 
            continue; 
        if (frequency % 4 == 1)  
        { 
  
            // Element has already been found 
            if (foundModOne) 
                return false; 
            foundModOne = true; 
        } 
  
        // The frequency of the element 
        // something other than 0 and 1 
        else
            return false; 
    } 
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 1, 1, 2, 2, 2, 3, 2 }; 
    int n = arr.length; 
  
    if (isPlusPossible(arr, n)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

