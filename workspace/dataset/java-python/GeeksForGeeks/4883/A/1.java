

// Java program to return minimum number of  
// elements which are not part of increasing 
// or decreasing subsequences. 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX = 102; 
  
// Return minimum number of elements which is  
// not part of any of the sequence. 
static int countMin(int arr[], int dp[][][], int n, 
                    int dec, int inc, int i) 
{ 
    // If already calculated, return value. 
    if (dp[dec][inc][i] != -1) 
        return dp[dec][inc][i]; 
  
    // If whole array is traversed. 
    if (i == n) 
        return 0; 
  
    // calculating by considering element as  
    // part of decreasing sequence. 
    if (arr[i] < arr[dec]) 
        dp[dec][inc][i] = countMin(arr, dp, n, i,  
                                     inc, i + 1); 
  
    // calculating by considering element as  
    // part of increasing sequence. 
    if (arr[i] > arr[inc]) 
    { 
        // If cannot be calculated for  
        // decreasing sequence. 
        if (dp[dec][inc][i] == -1) 
            dp[dec][inc][i] = countMin(arr, dp, n, 
                                       dec, i, i + 1); 
  
        // After considering once by decreasing sequence,  
        // now try for increasing sequence. 
        else
            dp[dec][inc][i] = Math.min(countMin(arr, dp, n, 
                                                dec, i, i + 1), 
                                                dp[dec][inc][i]); 
    } 
  
    // If element cannot be part of any of the sequence. 
    if (dp[dec][inc][i] == -1) 
        dp[dec][inc][i] = 1 + countMin(arr, dp, n,  
                                       dec, inc, i + 1); 
  
    // After considering element as part of increasing and 
    // decreasing sequence trying as not part of any of the 
    // sequence. 
    else
        dp[dec][inc][i] = Math.min(1 + countMin(arr, dp, n,      
                                                dec, inc, i + 1), 
                                                dp[dec][inc][i]); 
  
    return dp[dec][inc][i]; 
} 
  
// Wrapper Function 
static int wrapper(int arr[], int n) 
{ 
    // Adding two number at the end of array,  
    // so that increasing and decreasing sequence  
    // can be made. MAX - 2 index is assigned  
    // INT_MAX for decreasing sequence because 
    // next number of sequence must be less than it. 
    // Similarly, for Increasing sequence INT_MIN  
    // is assigned to MAX - 1 index. 
    arr[MAX - 2] = Integer.MAX_VALUE; 
    arr[MAX - 1] = Integer.MIN_VALUE; 
  
    int [][][]dp = new int[MAX][MAX][MAX]; 
    for(int i = 0; i < MAX; i++) 
    { 
        for(int j = 0; j < MAX; j++) 
        { 
            for(int l = 0; l < MAX; l++) 
            dp[i][j][l] = -1; 
        } 
    } 
  
    return countMin(arr, dp, n, MAX - 2,  
                                MAX - 1, 0); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 12;  
    int[] arr = new int[MAX]; 
    arr[0] = 7; 
    arr[1] = 8; 
    arr[2] = 1; 
    arr[3] = 2; 
    arr[4] = 4; 
    arr[5] = 6; 
    arr[6] = 3; 
    arr[7] = 5; 
    arr[8] = 2; 
    arr[9] = 1; 
    arr[10] = 8; 
    arr[11] = 7;  
  
    System.out.println(wrapper(arr, n)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

