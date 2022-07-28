

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the minimum flips 
// required such that the submatrix from 
// mat[i][j] to mat[i + 1][j + 1] 
// contains all equal elements 
static int minFlipsSub(String mat[], int i, int j) 
{ 
    int cnt0 = 0, cnt1 = 0; 
  
    if (mat[i].charAt(j) == '1') 
        cnt1++; 
    else
        cnt0++; 
  
    if (mat[i].charAt(j+1) == '1') 
        cnt1++; 
    else
        cnt0++; 
  
    if (mat[i + 1].charAt(j) == '1') 
        cnt1++; 
    else
        cnt0++; 
  
    if (mat[i + 1].charAt(j+1) == '1') 
        cnt1++; 
    else
        cnt0++; 
  
    return Math.min(cnt0, cnt1); 
} 
  
// Function to return the minimum number 
// of slips required such that the matrix 
// contains at least a single submatrix 
// of size 2*2 with all equal elements 
static int minFlips(String mat[], int r, int c) 
{ 
    // To store the result 
    int res = Integer.MAX_VALUE; 
  
    // For every submatrix of size 2*2 
    for (int i = 0; i < r - 1; i++)  
    { 
        for (int j = 0; j < c - 1; j++) 
        { 
            // Update the count of flips required 
            // for the current submatrix 
            res = Math.min(res, minFlipsSub(mat, i, j)); 
        } 
    } 
    return res; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String mat[] = { "0101", "0101", "0101" }; 
    int r = mat.length; 
    int c = mat[0].length(); 
  
    System.out.print(minFlips(mat, r, c)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

