

// Java program to find the 
// minimum number of changes 
// required to make the given 
// array an AP with common 
// difference d 
import java.util.*; 
  
class GFG { 
  
    // Function to find the minimum 
    // number of changes required 
    // to make the given array an 
    // AP with common difference d 
    static int minimumChanges(int arr[], 
                              int n, int d) 
    { 
        int maxFreq = -1; 
  
        // Map to store frequency of a0 
        HashMap<Integer, 
                Integer> 
            freq = new HashMap<Integer, 
                               Integer>(); 
  
        // storing frequency of a0 for 
        // all possible values of a[i] 
        // and finding the maximum 
        // frequency 
        for (int i = 0; i < n; ++i) { 
            int a0 = arr[i] - (i)*d; 
  
            // increment frequency by 1 
            if (freq.containsKey(a0)) { 
                freq.put(a0, freq.get(a0) + 1); 
            } 
            else
                freq.put(a0, 1); 
  
            // finds count of most 
            // frequent number 
            if (freq.get(a0) > maxFreq) 
                maxFreq = freq.get(a0); 
        } 
  
        // minimum number of elements 
        // needed to be changed is: 
        // n - (maximum frequency of a0) 
        return (n - maxFreq); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 5, d = 1; 
  
        int arr[] = { 1, 3, 3, 4, 6 }; 
  
        System.out.println(minimumChanges(arr, n, d)); 
    } 
} 
  
// This code is contributed 
// by Arnab Kundu 

