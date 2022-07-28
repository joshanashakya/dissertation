

// Java program to find maximum length subsequence 
// such that adjacent elements have at least 
// one common digit 
  
class GFG 
{ 
  
// Returns length of maximum length subsequence 
static int findSubsequence(int arr[], int n) 
{ 
  
    // To store the length of the 
    // maximum length subsequence 
    int len = 1; 
  
    // To store current element arr[i] 
    int tmp; 
  
    int i, j, d; 
  
    // To store the length of the sub-sequence 
    // ending at index i and having common digit d 
    int[][] dp = new int[n][10]; 
  
  
    // To store digits present in current element 
    int[] cnt = new int[10]; 
  
    // To store length of maximum length subsequence 
    // ending at index i 
    int locMax; 
  
    // For first element maximum length is 1 for 
    // each digit 
    tmp = arr[0]; 
    while (tmp > 0)  
    { 
        dp[0][tmp % 10] = 1; 
        tmp /= 10; 
    } 
  
    // Find digits of each element, then find length 
    // of subsequence for each digit and then find 
    // local maximum 
    for (i = 1; i < n; i++)  
    { 
        tmp = arr[i]; 
        locMax = 1; 
        for (int x = 0; x < 10; x++) 
        cnt[x]=0; 
  
        // Find digits in current element 
        while (tmp > 0)  
        { 
            cnt[tmp % 10] = 1; 
            tmp /= 10; 
        } 
  
        // For each digit present find length of 
        // subsequence and find local maximum 
        for (d = 0; d <= 9; d++) 
        { 
            if (cnt[d] > 0) 
            { 
                dp[i][d] = 1; 
                for (j = 0; j < i; j++)  
                { 
                    dp[i][d] = Math.max(dp[i][d], dp[j][d] + 1); 
                    locMax = Math.max(dp[i][d], locMax); 
                } 
            } 
        } 
  
        // Update value of dp[i][d] for each digit 
        // present in current element to local maximum 
        // found. 
        for (d = 0; d <= 9; d++) 
        { 
            if (cnt[d] > 0) 
            { 
                dp[i][d] = locMax; 
            } 
        } 
  
        // Update maximum length with local maximum 
        len = Math.max(len, locMax); 
    } 
  
    return len; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = { 1, 12, 44, 29, 33, 96, 89 }; 
    int n = arr.length; 
  
    System.out.println(findSubsequence(arr, n)); 
} 
} 
  
// This code is contributed by mits 

