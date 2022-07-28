

# Python code to Count the odd length contiguous 
# Palindromic sequences in the matrix 
MAX = 10; 
  
# Function to count the number of 
# contiguous palindromic sequences in the matrix 
def countPalindromes(n, m, matrix): 
  
    # Add the total number of elements 
    # in the matrix to the count 
    count = n * m; 
  
    # Length of possible sequence to be checked 
    # for palindrome horizontally and vertically 
    length_of_sequence_row = 0; 
    length_of_sequence_column = 0; 
  
    # Iterate through each element of the matrix 
    # and count the number of palindromic 
    # sequences in each row and column 
    for i in range(n): 
        for j in range(m): 
  
            # Find the possible length of sequences 
            # that can be a palindrome 
            length_of_sequence_row = min(j, m - 1 - j); 
            length_of_sequence_column = min(i, n - i - 1); 
  
            # From i, check if the sequence 
            # formed by elements to its 
            # left and right is 
            # palindrome or not 
            for k in range(1, length_of_sequence_row + 1): 
  
                # if the sequence [i, j-k] to [i, j+k] 
                # is a palindrome, 
                # increment the count by 1 
                if (matrix[i][j - k] == matrix[i][j + k]): 
                    count += 1; 
                else: 
                    break; 
                  
            # From i, check if the sequence 
            # formed by elements to its 
            # above and below is 
            # palindrome or not 
            for k in range(1, length_of_sequence_column + 1): 
  
                # if the sequence [i-k, j] to [i+k, j] 
                # is a palindrome, 
                # increment the count by 1 
                if (matrix[i - k][j] == matrix[i + k][j]): 
                    count += 1; 
                else: 
                    break; 
                  
    # Return the total count 
    # of the palindromic sequences 
    return count; 
  
# Driver code 
if __name__ == '__main__': 
    m = 3; 
    n = 3; 
    matrix = [ 2, 1, 2 ],[ 1, 1, 1 ],[ 2, 1, 2 ]; 
  
    print(countPalindromes(n, m, matrix)); 
  
# This code is contributed by 29AjayKumar 

