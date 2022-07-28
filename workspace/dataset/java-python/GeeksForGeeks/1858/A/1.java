

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to return the xor of 
// elements having odd frequency 
static int xorOdd(int arr[], int n) 
{ 
    // To store the frequency 
    // of all the elements 
    HashMap<Integer,  
            Integer> mp = new HashMap<Integer, 
                                      Integer>(); 
  
    // Update the map with the 
    // frequency of the elements 
    for (int i = 0 ; i < n; i++) 
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
      
    // To store the XOR of the elements 
    // appearing odd number of 
    // times in the array 
    int xorArr = 0; 
  
    // Traverse the map using an iterator 
    for (Map.Entry<Integer, 
                   Integer> it : mp.entrySet())  
    { 
        // Check for odd frequency 
        // and update the xor 
        if (((it.getValue()) % 2) ==1) 
        { 
            xorArr ^= it.getKey(); 
        } 
    } 
    return xorArr; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 1, 3, 3, 4, 2, 3, 1 }; 
    int n = arr.length; 
  
    System.out.println(xorOdd(arr, n)); 
} 
} 
  
// This code contributed by PrinciRaj1992 

