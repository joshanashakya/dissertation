

//Java program to find the XOR of XOR's  
// of all submatrices 
class GFG 
{ 
      
// Function to find to required 
// XOR value 
static int submatrixXor(int[][]arr) 
{ 
    int n = 3; 
    int ans = 0; 
  
    // Nested loop to find the 
    // number of sub-matrix each 
    // index belongs to 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < n; j++)  
        { 
            // Number of ways to choose 
            // from top-left elements 
            int top_left = (i + 1) * (j + 1); 
  
            // Number of ways to choose 
            // from bottom-right elements 
            int bottom_right = (n - i) * (n - j); 
  
            if ((top_left % 2 == 1) && 
                (bottom_right % 2 == 1)) 
                ans = (ans ^ arr[i][j]); 
        } 
    } 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[][] arr = {{ 6, 7, 13}, 
                   { 8, 3, 4 }, 
                   { 9, 7, 6 }}; 
  
    System.out.println(submatrixXor(arr)); 
} 
} 
  
// This code is contributed 
// by Code_Mech. 

