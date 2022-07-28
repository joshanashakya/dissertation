

// Java implementation of the approach  
class GfG 
{ 
      
static int n = 3; 
  
// Function to pre-compute the xor  
static void preComputeXor(int arr[][],  
                            int prefix_xor[][])  
{  
    // Left to right prefix xor  
    // for each row  
    for (int i = 0; i < n; i++)  
        for (int j = 0; j < n; j++)  
        {  
            if (j == 0)  
                prefix_xor[i][j] = arr[i][j];  
            else
                prefix_xor[i][j] =  
                    (prefix_xor[i][j - 1] ^ arr[i][j]);  
        }  
  
    // Top to bottom prefix xor  
    // for each column  
    for (int i = 0; i < n; i++)  
        for (int j = 1; j < n; j++)  
            prefix_xor[j][i] =  
                (prefix_xor[j - 1][i] ^ prefix_xor[j][i]);  
}  
  
// Function to process the queries  
// x1, x2, y1, y2 represent the  
// positions of the top-left  
// and bottom right corners  
static int ansQuerie(int prefix_xor[][], int x1,  
                    int y1, int x2, int y2)  
{  
  
    // To store the xor values  
    int xor_1 = 0, xor_2 = 0, xor_3 = 0;  
  
    // Finding the values we need to xor  
    // with value at (x2, y2) in prefix-xor  
    // matrix  
    if (x1 != 0)  
        xor_1 = prefix_xor[x1 - 1][y2];  
    if (y1 != 0)  
        xor_2 = prefix_xor[x2][y1 - 1];  
    if (x1 != 0 && y1 != 0)  
        xor_3 = prefix_xor[x1 - 1][y1 - 1];  
  
    // Return the required prefix xor  
    return ((prefix_xor[x2][y2] ^ xor_1) ^ (xor_2 ^ xor_3));  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[][] = new int[][]{{ 1, 2, 3 }, 
                            { 4, 5, 6 },  
                            { 7, 8, 9 }};  
  
    // To store pre-computed xor  
    int prefix_xor[][] = new int[n][n];  
  
    // Pre-computing xor  
    preComputeXor(arr, prefix_xor);  
  
    // Queries  
    System.out.println(ansQuerie(prefix_xor, 1, 1, 2, 2));  
    System.out.println(ansQuerie(prefix_xor, 1, 2, 2, 2));  
}  
}  
  
// This code is contributed by  
// Prerna Saini. 

