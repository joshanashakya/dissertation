

// Java Program to find the minimum element to  
// be added such that the array can be partitioned  
// into two contiguous subarrays with equal sums 
import java.util.*; 
  
class GFG  
{ 
  
// Function to count subarrays not satisfying condition 2 
static int exclude(int a[], int n) 
{ 
    int count = 0; 
    // iterate in the array 
    for (int i = 0; i < n; i++) 
    { 
  
        // store the sum of set bits 
        // in the subarray 
        int s = 0; 
        int maximum = 0; 
  
        // iterate for range of 60 subarrays 
        for (int j = i; j < Math.min(n, i + 60); j++) 
        { 
            s += a[j]; 
            maximum = Math.max(a[j], maximum); 
  
            // check if falsifies the condition-2 
            if (s % 2 == 0 && 2 * maximum > s) 
                count++; 
        } 
    } 
  
    return count; 
} 
  
// Function to count subarrays 
static int countSubarrays(int a[], int n) 
{ 
  
    // replace the array element by number 
    // of set bits in them 
    for (int i = 0; i < n; i++) 
        a[i] = Integer.bitCount(a[i]); 
  
    // calculate prefix array 
    int []pre = new int[n]; 
    for (int i = 0; i < n; i++)  
    { 
        pre[i] = a[i]; 
        if (i != 0) 
  
            pre[i] += pre[i - 1]; 
    } 
  
    // Count the number of subarays 
    // satisfying step-1 
    int odd = 0, even = 0; 
  
    // count number of odd and even 
    for (int i = 0; i < n; i++) 
    { 
        if (pre[i]%2== 1) 
            odd++; 
    } 
    even = n - odd; 
  
    // Increase even by 1 for 1, so that the 
    // subarrys starting from the index-0 
    // are also taken to count 
    even++; 
  
    // total subarrays satsfying condition-1 only 
    int answer = (odd * (odd - 1) / 2) + (even * (even - 1) / 2); 
  
    System.out.println(answer); 
  
    // exclude total subarrays not satsfying condition2 
    answer = answer - exclude(a, n); 
  
    return answer; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a[] = { 6, 7, 14 }; 
    int n = a.length; 
  
    System.out.println(countSubarrays(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

