

# Python3 implementation to find the Nth 
# smallest character in a given range 
# of a string 
  
# Function to prthe Nth smallest 
# character for a given range in a string 
def findSmallest(s, q, m): 
  
    # Integer N contains the 
    # length of the s 
    N = len(s) 
  
    # We initialise our hash array and 
    # set all the elements to 0 
    H = [[0 for i in range(26)]for i in range(N + 1)] 
  
    # We preprocess our in which we 
    # update the current character 
    # as well as add the H[i - 1]th 
    # array to H[i] 
    for i in range(1, N + 1): 
  
        # Incrementing the frequency of 
        # ith row based on the occurrence 
        # of the characters up to i-th index 
        H[i][ord(s[i - 1]) - ord('a')] += 1
  
        # Adding the values of the array at 
        # the previous index to the next index 
        for j in range(26): 
            H[i][j] += H[i - 1][j] 
  
    # We traverse from 0 to m to 
    # fetch all the queries 
    for j in range(m): 
  
        # Extracting L, R and N 
        # from the query array q 
        l = q[j][0] 
        r = q[j][1] 
        n = q[j][2] 
  
        # The initial sum is set to 0 
        sum = 0
  
        # We subtract H[l-1] from h[r] 
        # and add it to the sum 
        for i in range(26): 
            sum += H[r][i] - H[l - 1][i] 
  
            # Whenever the sum is greater than 
            # or equal to N, the equivalent 
            # character of the index is our 
            # nth smallest character 
            if (sum >= n): 
                print(chr(ord('a') + i)) 
                break
  
# Driver code 
if __name__ == '__main__': 
      
    # Input s 
    s = "afbccdeb"
      
    # Query array q, for each q 
    # it contains l, r and n 
    q = [ [ 2, 4, 1 ], 
        [ 1, 6, 4 ], 
        [ 1, 8, 7 ] ] 
    x = len(q) 
  
    findSmallest(s, q, x) 
      
# This code is contributed by mohit kumar 29     

