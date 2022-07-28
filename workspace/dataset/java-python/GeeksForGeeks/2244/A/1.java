

// Java program to count number of ways we can 
// partition an array in three parts with equal 
// sum. 
import java.util.*; 
  
class GFG  
{ 
  
// binary search to find the number of required 
// indices in suffix array. Returns index of 
// first element which is greater than x. 
static int binarysearch(Vector<Integer> v, int x) 
{ 
    int low = 0, high = v.size() - 1; 
    while (low <= high) 
    { 
        int mid = (low + high) / 2; 
        if (v.get(mid) <= x) 
            low = mid + 1; 
        else if (v.get(mid) > x &&  
                 v.get(mid) <= x) 
            return mid; 
        else if (v.get(mid) > x && mid == 0) 
            return mid; 
        else
            high = mid - 1; 
    } 
    return -1; 
} 
  
// function to calculate the number of ways to 
// divide the array into three contiguous parts 
static int CountContiguousParts(int arr[], int n) 
{ 
    int count = 0; // initializing answer 
  
    // Creating and filling prefix array 
    int []prefix = new int[n]; 
    prefix[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        prefix[i] = prefix[i - 1] + arr[i]; 
  
    // Total sum of elements is equal to last 
    // value in prefix array. 
    int total_sum = prefix[n - 1]; 
  
    // If sum of all the elements is not divisible 
    // by 3, we can't divide array in 3 parts of 
    // same sum. 
    if (total_sum % 3 != 0) 
        return 0; 
  
    // Creating and filling suffix array 
    int []suffix = new int[n]; 
    suffix[n - 1] = arr[n - 1]; 
    for (int i = n - 2; i >= 0; i--) 
        suffix[i] = suffix[i + 1] + arr[i]; 
  
    // Storing all indexes with suffix 
    // sum equal to total sum by 3. 
    Vector<Integer> v = new Vector<>(); 
    for (int i = 0; i < n; i++) 
        if (suffix[i] == total_sum / 3) 
            v.add(i); 
  
    // Traversing the prefix array and 
    // doing binary search in above vector 
    for (int i = 0; i < n; i++) 
    { 
        // We found a prefix with total_sum/3 
        if (prefix[i] == total_sum / 3) 
        { 
            // Find first index in v[] which 
            // is greater than i+1. 
            int res = binarysearch(v, i + 1); 
  
            if (res != -1) 
                count += v.size() - res; 
        } 
    } 
    return count; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = {1 , 2 , 3 , 0 , 3}; 
    int n = arr.length; 
    System.out.println(CountContiguousParts(arr, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

