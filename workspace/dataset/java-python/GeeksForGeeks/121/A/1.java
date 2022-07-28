

// Java Program to find length of 
// Longest Permutaion Subsequence 
// in a given array 
import java.util.*; 
  
class GFG{ 
   
// Function to find the 
// longest permutation subsequence 
static int longestPermutation(int arr[], int n) 
{ 
   
    // Map data structure to 
    // count the frequency of each element 
    HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>(); 
   
    for (int i = 0; i < n; i++) { 
   
        if(freq.containsKey(arr[i])){ 
            freq.put(arr[i], freq.get(arr[i])+1); 
        }else{ 
            freq.put(arr[i], 1); 
        } 
    } 
   
    int len = 0; 
   
    for (int i = 1; i <= n; i++) { 
   
        // If frequency of element is 0, 
        // then we can not move forward 
        // as every element should be present 
        if (!freq.containsKey(i)) { 
            break; 
        } 
   
        // Increasing the length by one 
        len++; 
    } 
   
    return len; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
   
    int arr[] = { 3, 2, 1, 6, 5 }; 
    int n = arr.length; 
   
    System.out.print(longestPermutation(arr, n)); 
   
} 
} 
  
// This code is contributed by Rajput-Ji 

