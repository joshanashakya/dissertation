

// Java code to Count the odd length contiguous 
// Palindromic sequences in the matrix 
class GFG 
{ 
  
static final int MAX = 10; 
  
// Function to count the number of 
// contiguous palindromic sequences in the matrix 
static int countPalindromes(int n, int m, int matrix[][]) 
{ 
    // Add the total number of elements 
    // in the matrix to the count 
    int count = n * m; 
  
    // Length of possible sequence to be checked 
    // for palindrome horizontally and vertically 
    int length_of_sequence_row; 
    int length_of_sequence_column; 
  
    // Iterate through each element of the matrix 
    // and count the number of palindromic 
    // sequences in each row and column 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < m; j++)  
        { 
  
            // Find the possible length of sequences 
            // that can be a palindrome 
            length_of_sequence_row 
                = Math.min(j, m - 1 - j); 
            length_of_sequence_column 
                = Math.min(i, n - i - 1); 
  
            // From i, check if the sequence 
            // formed by elements to its 
            // left and right is 
            // palindrome or not 
            for (int k = 1; k <= length_of_sequence_row; k++) 
            { 
  
                // if the sequence [i, j-k] to [i, j+k] 
                // is a palindrome, 
                // increment the count by 1 
                if (matrix[i][j - k] == matrix[i][j + k])  
                { 
                    count++; 
                } 
                else
                { 
                    break; 
                } 
            } 
  
            // From i, check if the sequence 
            // formed by elements to its 
            // above and below is 
            // palindrome or not 
            for (int k = 1; k <= length_of_sequence_column; k++) 
            { 
  
                // if the sequence [i-k, j] to [i+k, j] 
                // is a palindrome, 
                // increment the count by 1 
                if (matrix[i - k][j] == matrix[i + k][j])  
                { 
                    count++; 
                } 
                else
                { 
                    break; 
                } 
            } 
        } 
    } 
  
    // Return the total count 
    // of the palindromic sequences 
    return count; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int m = 3, n = 3; 
    int matrix[][] = { { 2, 1, 2 }, 
                        { 1, 1, 1 }, 
                        { 2, 1, 2 } }; 
  
    System.out.print(countPalindromes(n, m, matrix) 
        +"\n"); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 
` 

