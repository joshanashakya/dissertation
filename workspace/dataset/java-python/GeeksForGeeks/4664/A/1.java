

// Java program to find sum of Bitwise-OR of  
// all submatrices  
import java.util.*; 
  
class GFG 
{ 
  
static int n = 3;  
  
// Function to find prefix-count for   
// each row from right to left  
static void findPrefixCount(int p_arr[][], 
                        boolean set_bit[][])  
{  
    for (int i = 0; i < n; i++)  
    {  
        for (int j = n - 1; j >= 0; j--)  
        {  
            if (set_bit[i][j])  
                continue;  
  
            if (j != n - 1)  
                p_arr[i][j] += p_arr[i][j + 1];  
  
            p_arr[i][j] += (!set_bit[i][j]) ? 1 : 0;  
        }  
    }  
}  
  
static class pair 
{ 
    int first,second; 
    pair(){} 
      
    pair(int a,int b) 
    { 
        first = a;  
        second = b; 
    } 
} 
  
// Function to create a booleanean 
// matrix set_bit which stores '1'  
// at an index (R, C) if ith bit  
// of arr[R][C] is set.  
static int matrixOrValueOne(boolean set_bit[][])  
{  
    // array to store prefix count of zeros from  
    // right to left for booleanean array  
    int p_arr[][] = new int[n][n] ; 
      
    for(int i = 0; i < n; i++) 
    for(int j = 0; j < n; j++) 
    p_arr[i][j] = 0; 
  
    findPrefixCount(p_arr, set_bit);  
  
    // variable to store the count of  
    // submatrices with OR value 0  
    int count_zero_submatrices = 0;  
  
    // For each index of a column we will try to  
    // determine the number of sub-matrices  
    // starting from that index  
    // and has all 1s  
    for (int j = 0; j < n; j++)  
    {  
        int i = n - 1;  
  
        // stack to store elements and the count  
        // of the numbers they popped  
        // First part of pair will be the  
        // value of inserted element.  
        // Second part will be the count  
        // of the number of elements pushed  
        // before with a greater value  
        Stack<pair > q = new Stack<pair >();  
  
        // variable to store the number of submatrices  
        // with all 0s  
        int to_sum = 0;  
        while (i >= 0)  
        {  
            int c = 0;  
  
            while (q.size() != 0 && q.peek().first > p_arr[i][j])  
            {  
                to_sum -= (q.peek().second + 1) *  
                            (q.peek().first - p_arr[i][j]);  
                c += q.peek().second + 1;  
                q.pop();  
            }  
  
            to_sum += p_arr[i][j];  
            count_zero_submatrices += to_sum;  
            q.push(new pair( p_arr[i][j], c ));  
  
            i--;  
        }  
    }  
  
    return (n * (n + 1) * n * (n + 1)) /  
                4 - count_zero_submatrices;  
}  
  
// Function to find sum of Bitwise-OR of  
// all submatrices  
static int sumOrMatrix(int arr[][])  
{  
    int sum = 0;  
  
    int mul = 1;  
  
    for (int i = 0; i < 30; i++)  
    {  
        // matrix to store the status  
        // of ith bit of each element  
        // of matrix arr  
        boolean set_bit[][] = new boolean[n][n];  
  
        for (int R = 0; R < n; R++)  
            for (int C = 0; C < n; C++)  
                set_bit[R][C] = ((arr[R][C] & (1 << i)) != 0);  
  
        sum += (mul * matrixOrValueOne(set_bit));  
  
        mul *= 2;  
    }  
  
    return sum;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int arr[][] = { { 9, 7, 4 },  
                    { 8, 9, 2 },  
                    { 11, 11, 5 } };  
  
    System.out.println( sumOrMatrix(arr));  
}  
} 
  
// This code is contributed by Arnab Kundu  

