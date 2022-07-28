

// Java implementation of the approach 
class GFG 
{ 
static int maxN = 20; 
static int maxM = 10; 
  
// To store the states of DP 
static int [][]dp = new int[maxN][maxM]; 
static boolean [][]v = new boolean[maxN][maxM]; 
  
// Function to find the required count 
static int findCnt(int[] arr, int i,  
                   int curr, int n, int m) 
{ 
    // Base case 
    if (i == n)  
    { 
        if (curr == 0) 
            return 1; 
        else
            return 0; 
    } 
  
    // If the state has been solved before 
    // return the value of the state 
    if (v[i][curr]) 
        return dp[i][curr]; 
  
    // Setting the state as solved 
    v[i][curr] = true; 
  
    // Recurrence relation 
    return dp[i][curr] = findCnt(arr, i + 1, 
                                 curr, n, m) +  
                         findCnt(arr, i + 1, 
                                (curr + arr[i]) % m, 
                                 n, m); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 3, 3, 3 }; 
    int n = arr.length; 
    int m = 6; 
  
    System.out.println(findCnt(arr, 0, 0, n, m) - 1); 
} 
} 
  
// This code is contributed by 29AjayKumar 

