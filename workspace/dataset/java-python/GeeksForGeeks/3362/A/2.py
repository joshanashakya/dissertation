

# Python 3 program to count the minimal 
# replacements such that adjacent characters 
# are unequal 
import sys 
  
# function to return integer value 
# of i-th character in the string 
def charVal(s, i): 
    if (s[i] == '0'): 
        return 0
    elif (s[i] == '1'): 
        return 1
    else: 
        return 2
  
# Function to count the number of 
# minimal replacements 
def countMinimalReplacements(s,i,prev, dp, n): 
      
    # If the string has reached the end 
    if (i == n): 
        return 0
  
    # If the state has been visited previously 
    if (dp[i][prev] != -1): 
        return dp[i][prev] 
  
    # Get the current value of character 
    val = charVal(s, i) 
    ans = sys.maxsize 
  
    # If it is equal then change it 
    if (val == prev): 
        val = 0
  
        # All possible changes 
        for cur in range(3): 
            if (cur == prev): 
                continue
  
            # Change done 
            val = 1 + countMinimalReplacements(s, i + 1, cur, dp, n) 
            ans = min(ans, val) 
              
        # If same no change  
    else: 
        ans = countMinimalReplacements(s, i + 1, val, dp, n) 
  
    dp[i][val] = ans 
  
    return dp[i][val] 
  
# Driver Code 
if __name__ == '__main__': 
    s = "201220211"
  
    # Length of string 
    n = len(s) 
  
    # Create a DP array 
    dp = [[-1 for i in range(3)] for i in range(n)] 
  
    # First character 
    val = charVal(s, 0) 
  
    # Function to find minimal replacements 
    print(countMinimalReplacements(s, 1, val, dp, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

