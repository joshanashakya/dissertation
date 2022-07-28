

# Python3 program to find the minimum  
# number of characters to be replaced  
# in string S2, such that S1 is a  
# substring of S2 
import sys  
  
# Function to find the minimum number of 
# characters to be replaced in string S2, 
# such that S1 is a substring of S2 
def minimumChar(S1, S2): 
      
    # Get the sizes of both strings 
    n, m = len(S1), len(S2) 
  
    ans = sys.maxsize 
  
    # Traverse the string S2 
    for i in range(m - n + 1): 
        minRemovedChar = 0
  
        # From every index in S2, check the  
        # number of mis-matching characters  
        # in substring of length of S1 
        for j in range(n): 
            if (S1[j] != S2[i + j]): 
                minRemovedChar += 1
                  
        # Take minimum of prev and  
        # current mis-match 
        ans = min(minRemovedChar, ans) 
          
    # return answer 
    return ans 
      
# Driver Code 
if __name__ == '__main__': 
    S1 = "abc"
    S2 = "paxzk"
    print(minimumChar(S1, S2)) 
  
# This code is contributed  
# by PrinciRaj1992 

