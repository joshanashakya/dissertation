

// Java implementation of the above approach  
import java.util.*; 
  
class GFG 
{ 
  
    // Function to return the minimum operations  
    // required to make all array elements equal  
    static int minOperations(int arr[], int n)  
    { 
  
        // To store the frequency  
        // of all the array elements  
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
  
        // Traverse through array elements and  
        // update frequencies  
        for (int i = 0; i < n; i++)  
        { 
            if (mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else
            { 
                mp.put(arr[i], 1); 
            } 
        } 
  
        // To store the maximum frequency  
        // of an element from the array  
        int maxFreq = Integer.MIN_VALUE; 
  
        // Traverse through the map and find  
        // the maximum frequency for any element  
        maxFreq = Collections.max(mp.entrySet(),  
                Comparator.comparingInt(Map.Entry::getKey)).getValue(); 
                  
        // Return the minimum operations required  
        return (n - maxFreq); 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = {2, 4, 6}; 
        int n = arr.length; 
        System.out.println(minOperations(arr, n)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

