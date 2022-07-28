

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
    // Function to return the value of  
    // Binomial Coefficient C(n, k)  
    static int binomialCoeff(int n, int k)  
    {  
        int C[][] = new int [n + 1][k + 1];  
        int i, j;  
      
        // Calculate value of Binomial Coefficient  
        // in bottom up manner  
        for (i = 0; i <= n; i++)  
        {  
            for (j = 0; j <= Math.min(i, k); j++)  
            {  
      
                // Base Cases  
                if (j == 0 || j == i)  
                    C[i][j] = 1;  
      
                // Calculate value using previously  
                // stored values  
                else
                    C[i][j] = C[i - 1][j - 1] +  
                              C[i - 1][j];  
            }  
        }  
        return C[n][k];  
    }  
      
    // Function to return the count  
    // of valid subsequences  
    static int cntSubSeq(int arr[], int n, int k)  
    {  
      
        // Sort the array  
        Arrays.sort(arr);  
      
        // Maximum among the minimum K elements  
        int num = arr[k - 1];  
      
        // Y will store the frequency of num  
        // in the minimum K elements  
        int Y = 0;  
        for (int i = k - 1; i >= 0; i--)  
        {  
            if (arr[i] == num)  
                Y++;  
        }  
      
        // cntX will store the frequency of  
        // num in the complete array  
        int cntX = Y;  
        for (int i = k; i < n; i++)  
        {  
            if (arr[i] == num)  
                cntX++;  
        }  
        return binomialCoeff(cntX, Y);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 2, 3, 4 };  
        int n = arr.length;  
        int k = 2;  
      
        System.out.println(cntSubSeq(arr, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

