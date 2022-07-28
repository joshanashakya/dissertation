

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to recursively fill the dp array  
    static int f(int i, int state, int A[],  
                 int dp[][], int N)  
    {  
        if (i >= N)  
            return 0;  
      
        // If f(i, state) is already calculated  
        // then return the value  
        else if (dp[i][state] != -1) 
        {  
            return dp[i][state];  
        }  
      
        // Calculate f(i, state) according to the  
        // recurrence relation and store in dp[][]  
        else
        {  
            if (i == N - 1)  
                dp[i][state] = 1;  
            else if (state == 1 && A[i] > A[i + 1])  
                dp[i][state] = 1;  
            else if (state == 2 && A[i] < A[i + 1])  
                dp[i][state] = 1;  
            else if (state == 1 && A[i] <= A[i + 1])  
                dp[i][state] = 1 + f(i + 1, 2, A, dp, N);  
            else if (state == 2 && A[i] >= A[i + 1])  
                dp[i][state] = 1 + f(i + 1, 1, A, dp, N);  
            return dp[i][state];  
        }  
    }  
      
    // Function that calls the resucrsive function to  
    // fill the dp array and then returns the result  
    static int maxLenSeq(int A[], int N)  
    {  
        int i,j, tmp, y, ans;  
      
        // dp[][] array for storing result  
        // of f(i, 1) and f(1, 2)  
        int dp[][] = new int[1000][3];  
          
        // Populating the array dp[] with -1 
        for(i= 0; i < 1000; i++) 
            for(j = 0; j < 3; j++) 
                dp[i][j] = -1; 
  
        // Make sure that longest UD and DU  
        // sequence starting at each  
        // index is calculated  
        for (i = 0; i < N; i++)  
        {  
            tmp = f(i, 1, A, dp, N);  
            tmp = f(i, 2, A, dp, N);  
        }  
      
        // Assume the answer to be -1 
        // This value will only increase  
        ans = -1;  
        for (i = 0; i < N; i++)  
        {  
      
            // y is the length of the longest  
            // UD sequence starting at i  
            y = dp[i][1];  
      
            if (i + y >= N)  
                ans = Math.max(ans, dp[i][1] + 1);  
      
            // If length is even then add an integer  
            // and then a DU sequence starting at i + y  
            else if (y % 2 == 0)  
            {  
                ans = Math.max(ans, dp[i][1] + 1 + dp[i + y][2]);  
            }  
      
            // If length is odd then add an integer  
            // and then a UD sequence starting at i + y  
            else if (y % 2 == 1)  
            {  
                ans = Math.max(ans, dp[i][1] + 1 + dp[i + y][1]);  
            }  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int A[] = { 1, 10, 3, 20, 25, 24 };  
        int n = A.length;  
      
        System.out.println(maxLenSeq(A, n));  
    } 
} 
  
// This code is contributed by AnkitRai01 

