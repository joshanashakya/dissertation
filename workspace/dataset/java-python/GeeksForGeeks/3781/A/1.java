

import java.util.HashMap; 
import java.util.Map; 
  
// A hashing based solution to find the  
// minimum number of subsets of a set  
// such that every subset contains distinct 
// elements. 
class GFG  
{  
      
// Function to count subsets such that all 
// subsets have distinct elements. 
static int subset(int arr[], int n) 
{  
    // Traverse the input array and 
    // store frequencies of elements 
    HashMap<Integer, Integer> mp = new HashMap<>();  
    for (int i = 0; i < n; i++)  
        mp.put(arr[i],mp.get(arr[i]) == null?1:mp.get(arr[i])+1); 
      
    // Find the maximum value in map. 
    int res = 0; 
    for (Map.Entry<Integer,Integer> entry : mp.entrySet())  
    res = Math.max(res, entry.getValue()); 
  
    return res; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 5, 6, 9, 3, 4, 3, 4 }; 
    int n = arr.length; 
    System.out.println( subset(arr, n)); 
  
} 
} 
  
// This code is contributed by Rajput-Ji 

