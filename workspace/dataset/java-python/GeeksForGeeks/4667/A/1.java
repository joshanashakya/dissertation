

// Java program to count number of submatrices 
// with OR value 1 
import java.util.*; 
  
class GFG 
{ 
static int n = 3; 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// Function to find required prefix-count  
// for each row from right to left 
static void findPrefixCount(int p_arr[][], 
                            boolean arr[][]) 
{ 
    for (int i = 0; i < n; i++) 
        for (int j = n - 1; j >= 0; j--) 
        { 
            if (arr[i][j]) 
                continue; 
            if (j != n - 1) 
                p_arr[i][j] += p_arr[i][j + 1]; 
  
            p_arr[i][j] += (arr[i][j] == false ? 1 : 0); 
        } 
} 
  
// Function to find the count of submatrices 
// with OR value 1 
static int matrixOrValueOne(boolean arr[][]) 
{ 
    // Array to store prefix count of zeros from 
    // right to left for boolean array 
    int [][]p_arr = new int[n][n]; 
  
    findPrefixCount(p_arr, arr); 
  
    // Variable to store the count of 
    // submatrices with OR value 0 
    int count_zero_submatrices = 0; 
  
    // Loop to evaluate each column of 
    // the prefix matrix uniquely. 
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
        Stack<pair> q = new Stack<pair>(); 
  
        // Variable to store the number of submatrices 
        // with all 0s 
        int to_sum = 0; 
  
        while (i >= 0) 
        { 
            int c = 0; 
  
            while (q.size() != 0 &&  
                   q.peek().first > p_arr[i][j])  
            { 
  
                to_sum -= (q.peek().second + 1) *  
                          (q.peek().first - p_arr[i][j]); 
  
                c += q.peek().second + 1; 
  
                q.pop(); 
            } 
  
            to_sum += p_arr[i][j]; 
  
            count_zero_submatrices += to_sum; 
  
            q.add(new pair(p_arr[i][j], c )); 
  
            i--; 
        } 
    } 
  
    // Return the final answer 
    return (n * (n + 1) * n * (n + 1)) / 4
        - count_zero_submatrices; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    boolean arr[][] = { { false, false, false }, 
                        { false, true, false }, 
                        { false, false, false } }; 
  
    System.out.println(matrixOrValueOne(arr)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

