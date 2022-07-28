

# A Dynamic Programming based Python3 program to  
# find minimum number operations is less than  
# or equal to k or not to convert str1 to str2  
  
# Utility function to find minimum  
# of three numbers  
def minn(x, y, z) : 
  
    return min(min(x, y), z)  
  
def editDistDP(str1, str2, m, n) : 
  
    # Create a table to store results  
    # of subproblems  
    dp = [[0 for i in range(n + 1)]  
             for j in range(m + 1)]  
  
    # Fill d[][] in bottom up manner  
    for i in range(m + 1):  
        for j in range(n + 1):  
              
            # If first is empty, only option is  
            # to insert all characters of second  
            if (i == 0) : 
                dp[i][j] = j # Min. operations = j  
  
            # If second is empty, only option is  
            # to remove all characters of second  
            elif (j == 0):  
                dp[i][j] = i # Min. operations = i  
  
            # If last characters are same,  
            # ignore last char and recur 
            # for remaining  
            elif (str1[i - 1] == str2[j - 1]): 
                dp[i][j] = dp[i - 1][j - 1]  
  
            # If last character are different,  
            # consider all possibilities and  
            # find minimum  
            else: 
                dp[i][j] = 1 + minn(dp[i][j - 1], # Insert  
                                    dp[i - 1][j], # Remove  
                                    dp[i - 1][j - 1]) # Replace  
          
    return dp[m][n]  
  
# Returns true if str1 and str2 are 
# k edit distance apart, else false.  
def areKDistant(str1, str2, k): 
  
    m = len(str1) 
    n = len(str2) 
  
    if (abs(m - n) > k) : 
        return False
  
    return (editDistDP(str1, str2,  
                       m, n) <= k)  
  
# Driver Code  
if __name__ == '__main__': 
  
    str1 = "geek"
    str2 = "gks"
    k = 3
    if areKDistant(str1, str2, k): 
        print("Yes")   
    else: 
        print("No") 
  
# This code is contributed  
# by SHUBHAMSINGH10 

