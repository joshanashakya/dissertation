

// Java implementation to find longest subsequence  
// such that difference between adjacents is one 
import java.util.*; 
  
class GFG  
{ 
      
// function to find longest subsequence such 
// that difference between adjacents is one 
static int longLenSub(int []arr, int n) 
{ 
    // hash table to map the array element with the 
    // length of the longest subsequence of which 
    // it is a part of and is the last element of 
    // that subsequence 
    HashMap<Integer,  
            Integer> um = new HashMap<Integer,  
                                      Integer>(); 
      
    // to store the longest length subsequence 
    int longLen = 0; 
      
    // traverse the array elements 
    for (int i = 0; i < n; i++) 
    { 
        // initialize current length  
        // for element arr[i] as 0 
        int len = 0; 
          
        // if 'arr[i]-1' is in 'um' and its length  
        // of subsequence is greater than 'len' 
        if (um.containsKey(arr[i] - 1) &&  
              len < um.get(arr[i] - 1)) 
              len = um.get(arr[i] - 1); 
          
        // if 'arr[i]+1' is in 'um' and its length  
        // of subsequence is greater than 'len'      
        if (um.containsKey(arr[i] + 1) &&  
              len < um.get(arr[i] + 1)) 
              len = um.get(arr[i] + 1);  
          
        // update arr[i] subsequence length in 'um'  
        um. put(arr[i], len + 1); 
          
        // update longest length 
        if (longLen < um.get(arr[i]))  
            longLen = um.get(arr[i]); 
    } 
          
    // required longest length subsequence 
    return longLen;      
} 
      
// Driver Code 
public static void main(String[] args)  
{ 
    int[] arr = {1, 2, 3, 4, 5, 3, 2}; 
    int n = arr.length; 
    System.out.println("Longest length subsequence = " +  
                                    longLenSub(arr, n)); 
} 
}  
  
// This code is contributed by Princi Singh 

