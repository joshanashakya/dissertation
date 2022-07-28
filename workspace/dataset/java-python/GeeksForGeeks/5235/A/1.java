

import java.util.HashMap; 
  
// Java program to replace the elements  
// by their frequency in the array. 
class GFG { 
  
    static void ReplaceElementsByFrequency(int arr[], int n) { 
        // Hash map which will store the  
        // frequency of the elements of the array.  
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
  
        for (int i = 0; i < n; ++i) { 
  
            // Increment the frequency  
            // of the element by 1.  
            if (mp.get(arr[i]) == null) { 
                mp.put(arr[i], 1); 
            } else { 
                mp.put(arr[i], (mp.get(arr[i]) + 1)); 
            } 
            //mp[arr[i]]++;  
        } 
  
        // Replace every element by its frequency  
        for (int i = 0; i < n; ++i) { 
            if (mp.get(arr[i]) != null) { 
                arr[i] = mp.get(arr[i]); 
            } 
            //arr[i] = mp[arr[i]];  
        } 
    } 
  
    public static void main(String[] args) { 
        int arr[] = {1, 2, 5, 2, 2, 5}; 
        int n = arr.length; 
  
        ReplaceElementsByFrequency(arr, n); 
  
        // Print the modified array.  
        for (int i = 0; i < n; ++i) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
// This code contributed by 29AJayKumar 

