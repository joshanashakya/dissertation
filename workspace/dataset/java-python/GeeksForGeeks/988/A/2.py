

# Python3 implementation of the approach 
  
# Function to return the size of the 
# longest increasing subsequence 
def LISusingLCS(seq): 
    n = len(seq) 
  
    # Create an 2D array of integer 
    # for tabulation 
    L = [[0 for i in range(n + 1)]  
            for i in range(n + 1)] 
      
    # Take the second sequence as the sorted 
    # sequence of the given sequence 
    sortedseq = sorted(seq) 
  
    # Classical Dynamic Programming algorithm 
    # for Longest Common Subsequence 
    for i in range(n + 1): 
        for j in range(n + 1): 
            if (i == 0 or j == 0): 
                L[i][j] = 0
  
            elif (seq[i - 1] == sortedseq[j - 1]): 
                L[i][j] = L[i - 1][j - 1] + 1
  
            else: 
                L[i][j] = max(L[i - 1][j],  
                              L[i][j - 1]) 
  
    # Return the ans 
    return L[n][n] 
  
# Driver code 
sequence = [12, 34, 1, 5, 40, 80] 
  
print(LISusingLCS(sequence)) 
  
# This code is contributed by mohit kumar 

