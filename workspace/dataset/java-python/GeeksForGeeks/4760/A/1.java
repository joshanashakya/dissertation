

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
  
    static int MAX_INDEX = 51; 
    static int MAX_SUM = 2505; 
  
    // This dp array is used to store our values 
    // so that we don't have to calculate same 
    // values again and again 
    static int[][][] dp = new int[MAX_INDEX][MAX_SUM][MAX_INDEX]; 
  
    static int waysutil(int index, int sum, int count, 
                        Vector<Integer> arr, int K) 
    { 
        // Base cases 
        // Index can't be less than 0 
        if (index < 0)  
        { 
            return 0; 
        } 
  
        if (index == 0)  
        { 
  
            // No element is picked hence 
            // average cannot be calculated 
            if (count == 0) 
            { 
                return 0; 
            } 
            int remainder = sum % count; 
  
            // If remainder is non zero, we cannot 
            // divide the sum by count i.e. the average 
            // will not be an integer 
            if (remainder != 0)  
            { 
                return 0; 
            } 
            int average = sum / count; 
  
            // If we find an average return 1 
            if (average == K)  
            { 
                return 1; 
            } 
        } 
  
        // If we have already calculated this function 
        // simply return it instead of calculating it again 
        if (dp[index][sum][count] != -1)  
        { 
            return dp[index][sum][count]; 
        } 
  
        // If we don't pick the current element 
        // simple recur for index -1 
        int dontpick = waysutil(index - 1, 
                sum, count, arr, K); 
  
        // If we pick the current element add it to 
        // our current sum and increment count by 1 
        int pick = waysutil(index - 1, 
                sum + arr.get(index), 
                count + 1, arr, K); 
        int total = pick + dontpick; 
  
        // Store the value for the current function 
        dp[index][sum][count] = total; 
        return total; 
    } 
  
    // Function to return the number of ways 
    static int ways(int N, int K, int[] arr) 
    { 
        Vector<Integer> Arr = new Vector<>(); 
  
        // Push -1 at the beginning to 
        // make it 1-based indexing 
        Arr.add(-1); 
        for (int i = 0; i < N; ++i) 
        { 
            Arr.add(arr[i]); 
        } 
  
        // Initialize dp array by -1 
        for (int i = 0; i < MAX_INDEX; i++) 
        { 
            for (int j = 0; j < MAX_SUM; j++) 
            { 
                for (int l = 0; l < MAX_INDEX; l++)  
                { 
                    dp[i][j][l] = -1; 
                } 
            } 
        } 
  
        // Call recursive function 
        // waysutil to calculate total ways 
        int answer = waysutil(N, 0, 0, Arr, K); 
        return answer; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 6, 2, 8, 7, 6, 5, 9}; 
        int N = arr.length; 
        int K = 5; 
        System.out.println(ways(N, K, arr)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

