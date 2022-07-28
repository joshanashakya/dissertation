

//  Java implementation of above approach 
import java .io.*; 
  
class GFG 
{ 
// function to find longest sub-array 
// whose elements gives same remainder 
// when divided with K 
static int LongestSubarray(int[] arr,  
                        int n, int k) 
{ 
    // second array contains modulo 
    // results of each element with K 
    int[] arr2 = new int[n]; 
    for (int i = 0; i < n; i++) 
        arr2[i] = arr[i] % k; 
  
    int current_length, max_length = 0; 
    int j; 
  
    // loop for finding longest  
    // sub-array with equal elements 
    for (int i = 0; i < n;)  
    { 
        current_length = 1; 
        for (j = i + 1; j < n; j++)  
        { 
            if (arr2[j] == arr2[i]) 
                current_length++; 
            else
                break; 
        } 
        max_length = Math.max(max_length,  
                            current_length); 
        i = j; 
    } 
    return max_length; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int[] arr = { 4, 9, 7, 18, 29, 11 }; 
    int n = arr.length; 
    int k = 11; 
    System.out.println(LongestSubarray(arr, n, k)); 
} 
} 
  
// This code is contributed  
// by shs 

