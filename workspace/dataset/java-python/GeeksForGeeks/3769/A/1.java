

// Java program to Replace each element 
// by the difference of the total size 
// of the array and its frequency 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to replace the elements 
    static void ReplaceElements(int arr[], int n)  
    { 
        // Hash map which will store the 
        // frequency of the elements of the array. 
        HashMap<Integer, Integer> mp = new HashMap<>(); 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // Increment the frequency 
            // of the element by 1. 
            if (!mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], 1); 
            }  
            else 
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            } 
        } 
  
        // Replace every element by its frequency 
        for (int i = 0; i < n; ++i)  
        { 
            arr[i] = n - mp.get(arr[i]); 
        } 
  
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 5, 2, 2, 5, 4}; 
        int n = arr.length; 
  
        ReplaceElements(arr, n); 
  
        // Print the modified array. 
        for (int i = 0; i < n; ++i) 
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

