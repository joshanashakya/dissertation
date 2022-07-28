

# Python3 implementation for minimum 
# number of subsequences required 
# to convert one to another 
  
# Function to find the minimum number 
# of subsequences required to connvert 
# one to another 
# S2 == A and S1 == B 
def findMinimumSubsequences(A, B): 
  
    # At least 1 subsequence is required 
    # Even in best case, when A is same as B 
    numberOfSubsequences = 1
  
    # size of B 
    sizeOfB = len(B) 
  
    # size of A 
    sizeOfA = len(A) 
    inf = 1000000
  
    # Create an 2D array next[][] 
    # of size 26 * sizeOfB to store 
    # the next occurrence of a character 
    # ('a' to 'z') as an index [0, sizeOfA - 1] 
    next = [[ inf for i in range(sizeOfB)] for i in range(26)] 
  
    # Loop to Store the values of index 
    for i in range(sizeOfB): 
        next[ord(B[i]) - ord('a')][i] = i 
  
    # If the value of next[i][j] 
    # is infinite then update it with 
    # next[i][j + 1] 
    for i in range(26): 
        for j in range(sizeOfB-2, -1, -1): 
            if (next[i][j] == inf): 
                next[i][j] = next[i][j + 1] 
  
    # Greedy algorithm to obtain the maximum 
    # possible subsequence of B to cover the 
    # remaining of A using next subsequence 
    pos = 0
    i = 0
  
    # Loop to iterate over the A 
    while (i < sizeOfA): 
  
        # Condition to check if the character is 
        # not present in the B 
        if (pos == 0 and
        next[ord(A[i]) - ord('a')][pos] == inf): 
            numberOfSubsequences = -1
            break
  
        # Condition to check if there 
        # is an element in B matching with 
        # character A[i] on or next to B[pos] 
        # given by next[A[i] - 'a'][pos] 
        elif (pos < sizeOfB and
                next[ord(A[i]) - ord('a')][pos] < inf) : 
            nextIndex = next[ord(A[i]) - ord('a')][pos] + 1
            pos = nextIndex 
            i += 1
  
        # Condition to check if reached at the end 
        # of B or no such element exists on 
        # or next to A[pos], thus increment number 
        # by one and reinitialise pos to zero 
        else : 
            numberOfSubsequences += 1
            pos = 0
  
    return numberOfSubsequences 
  
# Driver Code 
if __name__ == '__main__': 
    A = "aacbe"
    B = "aceab"
    print(findMinimumSubsequences(A, B)) 
      
# This code is contributed by mohit kumar 29 

