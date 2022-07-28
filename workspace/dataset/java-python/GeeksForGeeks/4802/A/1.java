

import java.util.*; 
// Java implementation to count  
// pairs from both sorted arrays  
// whose sum is equal to a given  
// value 
  
class GFG 
{ 
  
// function to count all pairs  
// from both the sorted arrays  
// whose sum is equal to a given  
// value  
static int countPairs(int arr1[], int arr2[],  
            int m, int n, int x)  
{  
    int count = 0;  
      
    HashSet<Integer> us = new HashSet<Integer>(); 
      
    // insert all the elements  
    // of 1st array in the hash  
    // table(unordered_set 'us')  
    for (int i = 0; i < m; i++)  
        us.add(arr1[i]);  
      
    // for each element of 'arr2[]  
    for (int j = 0; j < n; j++)  
  
        // find (x - arr2[j]) in 'us'  
        if (us.contains(x - arr2[j]))  
            count++;  
      
    // required count of pairs  
    return count;  
}  
  
// Driver Code  
public static void main(String[] args) 
{ 
    int arr1[] = {1, 3, 5, 7};  
    int arr2[] = {2, 3, 5, 8};  
    int m = arr1.length;  
    int n = arr2.length;  
    int x = 10;  
    System.out.print("Count = "
        + countPairs(arr1, arr2, m, n, x)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

