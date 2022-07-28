

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Returns number of subsequences 
// of maximum length k and 
// contains no repeated element 
static int countSubSeq(int a[], int n, int k) 
{ 
    // Sort the array a[] 
    Arrays.sort(a); 
    List<Integer> arr = new LinkedList<>(); 
  
    // Store the frequencies of all the 
    // distinct element in the vector arr 
    for (int i = 0; i < n;) 
    { 
        int count = 1, x = a[i]; 
        i++; 
        while (i < n && a[i] == x)  
        { 
            count++; 
            i++; 
        } 
        arr.add(count); 
    } 
  
    int m = arr.size(); 
    n = Math.min(m, k); 
  
    // count is the the number 
    // of such subsequences 
    int count = 1; 
  
    // Create a 2-d array dp[n+1][m+1] to 
    // store the intermediate result 
    int [][]dp = new int[n + 1][m + 1]; 
  
    // Initialize the first row to 1 
    for (int i = 0; i <= m; i++) 
        dp[0][i] = 1; 
  
    // Update the dp[][] array based 
    // on the recurrence relation 
    for (int i = 1; i <= n; i++)  
    { 
        for (int j = m; j >= 0; j--)  
        { 
            if (j > m - i) 
                dp[i][j] = 0; 
            else
            { 
                dp[i][j] = dp[i][j + 1] +  
                             arr.get(j) *  
                           dp[i - 1][j + 1]; 
            } 
        } 
        count = count + dp[i][0]; 
    } 
  
    // Return the number of subsequences 
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 2, 2, 3, 3, 5 }; 
    int n = a.length; 
    int k = 3; 
  
    System.out.println(countSubSeq(a, n, k)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

