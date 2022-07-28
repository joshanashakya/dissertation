

// Java implementation of the above approach. 
class GFG 
{ 
  
// This variable counts discarded subsequences 
static long discard_count = 0; 
  
// Function to return a^n 
static long power(long a, long n) 
{ 
    if (n == 0) 
        return 1; 
    long p = power(a, n / 2); 
    p = p * p; 
    if (n % 2 == 1) 
        p = p * a; 
    return p; 
} 
  
// Recursive function that counts discarded  
// subsequences 
static void solve(int i, int n, float sum, float k, 
                float []a, float []prefix) 
{ 
  
    // If at any stage, sum > k 
    // discard further subsequences 
    if (sum > k)  
    { 
        discard_count += power(2, n - i); 
  
        // Recursive calong terminated 
        // No further calongs 
        return; 
    } 
  
    if (i == n) 
        return; 
  
    // rem = Sum of array[i+1...n-1] 
    float rem = prefix[n - 1] - prefix[i]; 
  
    // If there are chances of discarding  
    // further subsequences then make a 
    // recursive calong, otherwise not 
    // Including a[i] 
    if (sum + a[i] + rem > k) 
        solve(i + 1, n, sum + a[i], k, 
                        a, prefix); 
  
    // Excluding a[i] 
    if (sum + rem > k) 
        solve(i + 1, n, sum, k, a, prefix); 
} 
  
// Function to return count of non-empty  
// subsequences whose product doesn't 
// exceed k 
static int countSubsequences(int []arr,  
                        int n, long K) 
{ 
    float sum = 0.0f; 
  
    // Converting k to log(k) 
    float k = (float) Math.log(K); 
  
    // Prefix sum array and array to 
    // store log values. 
    float []prefix = new float[n]; 
    float []a = new float[n]; 
  
    // a[] is the array obtained 
    // after converting numbers to  
    // logarithms 
    for (int i = 0; i < n; i++) 
    { 
        a[i] = (float) Math.log(arr[i]); 
        sum += a[i]; 
    } 
  
    // Computing prefix sums 
    prefix[0] = a[0]; 
    for (int i = 1; i < n; i++) 
    { 
        prefix[i] = prefix[i - 1] + a[i]; 
    } 
  
    // Calculate non-empty subsequences 
    // hence 1 is subtracted 
    long total = power(2, n) - 1; 
  
    // If total sum is <= k, then  
    // answer = 2^n - 1 
    if (sum <= k)  
    { 
        return (int) total; 
    } 
  
    solve(0, n, 0.0f, k, a, prefix); 
    return (int) (total - discard_count); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 8, 7, 2 }; 
    int n = arr.length; 
    long k = 50; 
    System.out.print(countSubsequences(arr, n, k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

