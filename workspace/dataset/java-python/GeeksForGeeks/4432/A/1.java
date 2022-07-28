

// Java program to Count the no of subarray 
// which do not contain any subarray 
// whose sum of elements is equal to zero 
import java.util.*; 
  
class GFG{ 
   
// Function that print the number of 
// subarrays which do not contain any subarray 
// whose elements sum is equal to 0 
static void numberOfSubarrays(int arr[], int n) 
{ 
    int []v = new int[n + 1]; 
    v[0] = 0; 
   
    // Storing each element as sum 
    // of its previous element 
    for (int i = 0; i < n; i++) { 
        v[i + 1] = v[i] + arr[i]; 
    } 
   
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
   
    int begin = 0, end = 0, answer = 0; 
   
    mp.put(0, 1); 
   
    while (begin < n) { 
   
        while (end < n 
               && !mp.containsKey(v[end + 1])) { 
            end++; 
            mp.put(v[end],  1); 
        } 
   
        // Check if another same element found 
        // this means a subarray exist between 
        // end and begin whose sum 
        // of elements is equal to 0 
        answer = answer + end - begin; 
   
        // Erase begining element from map 
        mp.remove(v[begin]); 
   
        // Increase begin 
        begin++; 
    } 
   
    // Print the result 
    System.out.print(answer +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
   
    int arr[] = { 2, 4, -6 }; 
    int size = arr.length; 
   
    numberOfSubarrays(arr, size); 
} 
} 
  
// This code is contributed by sapnasingh4991 

