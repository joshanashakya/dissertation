

// Java to count number of elements present in arr1 whose 
// occurrence is more than in arr2 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG { 
    public static int Largercount(int arr1[], int arr2[], int m, int n) 
    { 
        int count = 0; 
  
        // map to store frequency of elements present in arr1 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
  
        // frequency of elements of arr1 is calulated 
        for (int i = 0; i < m; i++) { 
            int key = arr1[i]; 
            if (mp.containsKey(key)) { 
                int freq = mp.get(key); 
                freq++; 
                mp.put(key, freq); 
            } 
            else
                mp.put(key, 1); 
        } 
  
        // check if the elements of arr2 is present in arr2 or not 
        for (int i = 0; i < n; i++) { 
            if (mp.containsKey(arr2[i]) && mp.get(arr2[i]) != 0) { 
                int freq = mp.get(arr2[i]); 
                freq--; 
                mp.put(arr2[i], freq); 
            } 
        } 
  
        // count the elements of arr1 whose 
        // frequency is more than arr2 
        for (int i = 0; i < m; i++) { 
            if (mp.get(arr1[i]) != 0) { 
                count++; 
                mp.put(arr1[i], 0); 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr1[] = new int[] { 2, 4, 4, 6, 6, 6, 8, 9}; 
        int arr2[] = new int[] { 2, 2, 4, 6, 6 }; 
  
        System.out.print(Largercount(arr1, arr2, 8, 5)); 
    } 
} 

