

// Java Program to find GCD of a number in a given Range 
// using segment Trees 
class GFG  
{ 
  
// To store segment tree 
static int []st; 
  
// Function to find gcd of 2 numbers. 
static int gcd(int a, int b) 
{ 
    if (a < b) 
        swap(a, b); 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
} 
  
private static void swap(int x, int y)  
{ 
    int temp = x; 
    x = y; 
    y = temp; 
}  
/* A recursive function to get gcd of given 
    range of array indexes. The following are parameters for 
    this function. 
  
    st --> Pointer to segment tree 
    si --> Index of current node in the segment tree. Initially 
            0 is passed as root is always at index 0 
    ss & se --> Starting and ending indexes of the segment 
                represented by current node, i.e., st[index] 
    qs & qe --> Starting and ending indexes of query range */
static int findGcd(int ss, int se, int qs, int qe, int si) 
{ 
    if (ss > qe || se < qs) 
        return 0; 
    if (qs <= ss && qe >= se) 
        return st[si]; 
    int mid = ss + (se - ss) / 2; 
    return gcd(findGcd(ss, mid, qs, qe, si * 2 + 1), 
            findGcd(mid + 1, se, qs, qe, si * 2 + 2)); 
} 
  
// Finding The gcd of given Range 
static int findRangeGcd(int ss, int se, int arr[], int n) 
{ 
    if (ss < 0 || se > n-1 || ss > se) 
    { 
        System.out.println("Invalid Arguments"); 
        return -1; 
    } 
    return findGcd(0, n - 1, ss, se, 0); 
} 
  
// A recursive function that constructs Segment Tree for 
// array[ss..se]. si is index of current node in segment 
// tree st 
static int constructST(int arr[], int ss, int se, int si) 
{ 
    if (ss == se) 
    { 
        st[si] = arr[ss]; 
        return st[si]; 
    } 
    int mid = ss + (se - ss) / 2; 
    st[si] = gcd(constructST(arr, ss, mid, si * 2 + 1), 
                constructST(arr, mid+1, se, si * 2 + 2)); 
    return st[si]; 
} 
  
/* Function to construct segment tree from given array. 
This function allocates memory for segment tree and 
calls constructSTUtil() to fill the allocated memory */
static int []constructSegmentTree(int arr[], int n) 
{ 
    int height = (int)(Math.ceil(Math.log(n))); 
    int size = 2*(int)Math.pow(2, height) - 1; 
    st = new int[size]; 
    constructST(arr, 0, n - 1, 0); 
    return st; 
} 
  
// Returns size of smallest subarray of arr[0..n-1] 
// with GCD equal to k. 
static int findSmallestSubarr(int arr[], int n, int k) 
{ 
    // To check if a multiple of k exists. 
    boolean found = false; 
  
    // Find if k or its multiple is present 
    for (int i = 0; i < n; i++) 
    { 
        // If k is present, then subarray size is 1. 
        if (arr[i] == k) 
            return 1; 
  
        // Break the loop to indicate presence of a 
        // multiple of k. 
        if (arr[i] % k == 0) 
            found = true; 
    } 
  
    // If there was no multiple of k in arr[], then 
    // we can't get k as GCD. 
    if (found == false) 
        return -1; 
  
    // If there is a multiple of k in arr[], build 
    // segment tree from given array 
    constructSegmentTree(arr, n); 
  
    // Initialize result 
    int res = n + 1; 
  
    // Now consider every element as starting point 
    // and search for ending point using Binary Search 
    for (int i = 0; i < n - 1; i++) 
    { 
        // a[i] cannot be a starting point, if it is 
        // not a multiple of k. 
        if (arr[i] % k != 0) 
            continue; 
  
        // Initialize indexes for binary search of closest 
        // ending point to i with GCD of subarray as k. 
        int low = i + 1; 
        int high = n - 1; 
  
        // Initialize closest ending point for i. 
        int closest = 0; 
  
        // Binary Search for closest ending point 
        // with GCD equal to k. 
        while (true) 
        { 
            // Find middle point and GCD of subarray 
            // arr[i..mid] 
            int mid = low + (high-low)/2; 
            int gcd = findRangeGcd(i, mid, arr, n); 
  
            // If GCD is more than k, look further 
            if (gcd > k) 
                low = mid; 
  
            // If GCD is k, store this point and look for 
            // a closer point 
            else if (gcd == k) 
            { 
                high = mid; 
                closest = mid; 
                break; 
            } 
  
            // If GCD is less than, look closer 
            else
                high = mid; 
  
            // If termination condition reached, set 
            // closest 
            if (Math.abs(high-low) <= 1) 
            { 
                if (findRangeGcd(i, low, arr, n) == k) 
                    closest = low; 
                else if (findRangeGcd(i, high, arr, n)==k) 
                    closest = high; 
                break; 
            } 
        } 
  
        if (closest != 0) 
            res = Math.min(res, closest - i + 1); 
    } 
  
    // If res was not changed by loop, return -1, 
    // else return its value. 
    return (res == n+1) ? -1 : res; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int n = 8; 
    int k = 3; 
    int arr[] = {6, 9, 7, 10, 12, 24, 36, 27}; 
    System.out.println("Size of smallest sub-array with given"
        + " size is " + findSmallestSubarr(arr, n, k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

