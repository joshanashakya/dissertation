

// Java program of the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function to find the maximum pairs 
// such that arr[i+1] > arr[i] 
static void countPairs(int arr[], int N) 
{ 
   
    // To store the frequency of the 
    // element in arr[] 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
   
    // Store the frequency in map M 
    for (int i = 0; i < N; i++) { 
        if(mp.containsKey(arr[i])){ 
            mp.put(arr[i], mp.get(arr[i])+1); 
        }else{ 
            mp.put(arr[i], 1); 
    } 
    } 
   
    int maxFreq = 0; 
   
    // To find the maximum frequency 
    // store in map M 
    for (Map.Entry<Integer,Integer> it : mp.entrySet()) { 
        maxFreq = Math.max(maxFreq, 
                      it.getValue()); 
    } 
   
    // Print the maximum number of 
    // possible pairs 
    System.out.print(N - maxFreq +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
   
    int arr[] = { 1, 8, 5, 9, 8, 8, 7, 
                  7, 5, 7, 7 }; 
    int N = arr.length; 
   
    countPairs(arr, N); 
} 
} 
  
// This code is contributed by Rajput-Ji 

