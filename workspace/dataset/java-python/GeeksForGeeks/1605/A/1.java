

// Java Program to find the minimum element to  
// be added such that the array can be partitioned  
// into two contiguous subarrays with equal sums 
import java.util.*; 
  
class GFG 
{ 
      
// Structure to store the minimum element 
// and its position  
static class data  
{ 
    int element; 
    int position; 
}; 
  
static data findMinElement(int arr[], int n) 
{ 
    data result=new data();  
      
    // initialize prefix and suffix sum arrays with 0 
    int []prefixSum = new int[n];  
    int []suffixSum = new int[n]; 
  
    prefixSum[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
    { 
        // add current element to Sum 
        prefixSum[i] = prefixSum[i - 1] + arr[i]; 
    } 
  
    suffixSum[n - 1] = arr[n - 1]; 
    for (int i = n - 2; i >= 0; i--) 
    { 
        // add current element to Sum 
        suffixSum[i] = suffixSum[i + 1] + arr[i]; 
    } 
      
    // initialize the minimum element to be a large value 
    int min = suffixSum[0];  
    int pos=0; 
  
    for (int i = 0; i < n - 1; i++)  
    { 
        // check for the minimum absolute difference  
        // between current prefix sum and the next  
        // suffix sum element 
        if (Math.abs(suffixSum[i + 1] - prefixSum[i]) < min)  
        { 
            min = Math.abs(suffixSum[i + 1] - prefixSum[i]); 
  
            // if prefixsum has a greater value then position  
            // is the next element, else it's the same element. 
            if (suffixSum[i + 1] < prefixSum[i]) pos = i + 1; 
            else     pos = i; 
        } 
    } 
  
    // return the data in struct. 
    result.element = min; 
    result.position = pos; 
    return result; 
} 
  
// Driver Code  
public static void main(String[] args) 
{ 
    int arr[] = { 10, 1, 2, 3, 4 }; 
    int n = arr.length; 
    data values; 
  
    values = findMinElement(arr, n); 
    System.out.println("Minimum element : " + values.element  
        + "\nPosition : " + values.position); 
} 
} 
  
// This code is contributed by Rajput-Ji 

