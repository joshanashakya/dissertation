

# Python3 implementation of the approach 
N = 100
  
# Pre-processing function 
def pre_process(dp, s): 
  
    # Get the size of the string 
    n = len(s) 
  
    # Initially mark every 
    # position as false 
    for i in range(n): 
        for j in range(n): 
            dp[i][j] = False
  
    # For the length 
    for j in range(1, n + 1): 
  
        # Iterate for every index with 
        # length j 
        for i in range(n - j + 1): 
  
            # If the length is less than 2 
            if (j <= 2): 
  
                # If characters are equal 
                if (s[i] == s[i + j - 1]): 
                    dp[i][i + j - 1] = True
  
            # Check for equal 
            elif (s[i] == s[i + j - 1]): 
                dp[i][i + j - 1] = dp[i + 1][i + j - 2] 
  
# Function to answer every query in O(1) 
def answerQuery(l, r, dp): 
  
    if (dp[l][r]): 
        print("Yes") 
    else: 
        print("No") 
  
# Driver code 
s = "abaaab"
dp = [[0 for i in range(N)] 
         for i in range(N)] 
pre_process(dp, s) 
  
queries = [[0, 1], [1, 5]] 
q = len(queries) 
  
for i in range(q): 
    answerQuery(queries[i][0],  
                queries[i][1], dp) 
  
# This code is contributed by mohit kumar 

