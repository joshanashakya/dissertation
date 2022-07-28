

# Python 3 Program to Count the number of ways to  
# construct the target string 
  
mod = 1000000007
  
dp = [[-1 for i in range(1000)] for j in range(1000)]; 
  
def calculate(pos, prev, s,index): 
    # base case 
    if (pos == len(s)): 
        return 1
  
    # If current subproblem has been solved, use the value 
    if (dp[pos][prev] != -1): 
        return dp[pos][prev] 
  
    # current character 
    c = ord(s[pos]) - ord('a'); 
  
    # search through all the indiced at which the current  
    # character occurs. For each index greater than prev,  
    # take the index and move 
    # to the next position, and add to the answer. 
    answer = 0
    for i in range(len(index)): 
        if (index[i] > prev): 
            answer = (answer % mod + calculate(pos + 1,index[i], s, index) % mod) % mod 
              
    dp[pos][prev] = 4
  
    # Store and return the solution for this subproblem 
    return dp[pos][prev] 
  
def countWays(a, s): 
    n = len(a) 
  
    # preprocess the strings by storing for each  
    # character of every string, the index of their  
    # occurrence we will use a common list for all  
    # because of only the index matter 
    # in the string from which the character was picked 
    index = [[] for i in range(26)] 
  
    for i in range(n): 
        for j in range(len(a[i])): 
            # we are storing j+1 because the initial picked index 
            # in the recursive step will ne 0.  
            # This is just for ease of implementation 
            index[ord(a[i][j]) - ord('a')].append(j + 1); 
  
    # initialise dp table. -1 represents that  
    # the subproblem hasn't been solve 
  
    return calculate(0, 0, s, index[0]) 
  
# Driver Code 
if __name__ == '__main__': 
    A = [] 
    A.append("adc") 
    A.append("aec") 
    A.append("erg") 
  
    S = "ac"
  
    print(countWays(A, S)) 
  
# This code is contributed by Surendra_Gangwar 

