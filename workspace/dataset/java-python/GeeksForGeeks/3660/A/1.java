

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if the 
// required subarray exists 
// in the given array 
static boolean subArray(int[] arr, int n, int m) 
{ 
    int i; 
  
    // Map to store the positions of 
    // each integer in the original 
    // permutation 
    HashMap<Integer, Integer> mp =  
        new HashMap<Integer, Integer> (); 
    for (i = 0; i < n; i++)  
    { 
  
        // To store the address of each 
        // entry in arr[n] but with 
        // 1-based indexing 
        mp.put(arr[i], i + 1); 
    } 
  
    int sumcur = 0; 
  
    // To track minimum position sumcur 
    // for sum of aint positions 
    // tiint this position 
    int p = Integer.MAX_VALUE; 
    Vector<Integer> ans = new Vector<Integer>(); 
    for (i = 1; i <= m; i++)  
    { 
  
        // Summing up addresses 
        sumcur += mp.get(i); 
  
        // Tracking minimum address 
        // encountered tiint now 
        p = Math.min(p, mp.get(i)); 
  
        // The sum of the addresses if 
        // it forms the required subarray 
        int val = p * i - i + (i * (i + 1)) / 2; 
        if (i == m) 
        { 
  
            // If current sum of address 
            // is equal to val 
            if (val == sumcur) 
            { 
                return true; 
            } 
            else
                return false; 
        } 
    } 
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 5, 1, 3, 2, 6 }; 
    int n = arr.length; 
    int m = 3; 
  
    if (subArray(arr, n, m)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

