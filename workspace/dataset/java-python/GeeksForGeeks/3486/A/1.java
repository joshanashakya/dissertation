

// Java implementation of above approach 
class GFG 
{ 
      
// Function to return the minimum number 
// of operations needed to partition 
// the array in k contiguous groups 
// such that all elements of a 
// given group are identical 
static int getMinimumOps(int ar[], int k) 
{ 
    // n is the size of the array 
    int n = ar.length; 
  
    // dp(i, j) represents the minimum cost for 
    // partitioning the array[0..i] into j groups 
    int dp[][] = new int[n][k + 1]; 
  
    // Base case, cost is 0 for parititoning the 
    // array[0..0] into 1 group 
    dp[0][1] = 0; 
  
    // Fill dp(i, j) and the answer will 
    // be stored at dp(n-1, k) 
    for (int i = 1; i < n; i++) 
    { 
  
        // The maximum groups that the segment 0..i can 
        // be divided in is represented by maxGroups 
        int maxGroups = Math.min(k, i + 1); 
  
        for (int j = 1; j <= maxGroups; j++)  
        { 
  
            // Initialize dp(i, j) to infinity 
            dp[i][j] = Integer.MAX_VALUE; 
  
            // Divide segment 0..i in 1 group 
            if (j == 1)  
            { 
  
                // map and freqOfMode are together used to 
                // keep track of the frequency of the most 
                // occurring element in [0..i] 
                int freq[] = new int[100000]; 
                int freqOfMode = 0; 
                for (int it = 0; it <= i; it++)  
                { 
                    freq[ar[it]]++; 
                    int newElementFreq = freq[ar[it]]; 
                    if (newElementFreq > freqOfMode) 
                        freqOfMode = newElementFreq; 
                } 
  
                // Change all the elements in the range 
                // 0..i to the most frequent element 
                // in this range 
                dp[i][1] = (i + 1) - freqOfMode; 
            } 
            else
            { 
                int freq[] = new int[100000]; 
                int freqOfMode = 0; 
  
                // If the jth group is the segment from 
                // it..i, we change all the elements in this 
                // range to this range's most occurring element 
                for (int it = i; it >= j - 1; it--)  
                { 
                    freq[ar[it]]++; 
                    int newElementFreq = freq[ar[it]]; 
                    if (newElementFreq > freqOfMode) 
                        freqOfMode = newElementFreq; 
  
                    // Number of elements we need to change 
                    // in the jth group i.e. the range it..i 
                    int elementsToChange = i - it + 1; 
                    elementsToChange -= freqOfMode; 
  
                    // For all the possible sizes of the jth 
                    // group that end at the ith element 
                    // we pick the size that gives us the minimum 
                    // cost for dp(i, j) 
                    // elementsToChange is the cost of making 
                    // all the elements in the jth group identical 
                    // and we make use of dp(it - 1, j - 1) to 
                    // find the overall minimal cost 
                    dp[i][j] = Math.min(dp[it - 1][j - 1] + 
                                        elementsToChange, dp[i][j]); 
                } 
            } 
        } 
    } 
  
    // Return the minimum cost for 
    // partitioning array[0..n-1] 
    // into k groups which is 
    // stored at dp(n-1, k) 
    return dp[n - 1][k]; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int k = 3; 
    int ar[] = { 3, 1, 3, 3, 2, 1, 8, 5 }; 
  
    System.out.println(getMinimumOps(ar, k)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

