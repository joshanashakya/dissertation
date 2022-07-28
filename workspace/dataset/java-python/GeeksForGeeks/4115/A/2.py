

# Python3 implementation of the approach  
from collections import defaultdict 
  
maxlen = 100
  
# Function to generate all the sub-strings  
def generateSubStrings(s, mpp):  
  
    # Length of the string  
    l = len(s)  
  
    # Generate all sub-strings  
    for i in range(0, l):  
        temp = ""  
        for j in range(i, l):  
            temp += s[j]  
  
            # Count the occurrence of  
            # every sub-string  
            mpp[temp] += 1
  
# Compute the Binomial Coefficient  
def binomialCoeff(C):  
  
    # Calculate value of Binomial  
    # Coefficient in bottom up manner  
    for i in range(0, 100):  
        for j in range(0, 100):  
  
            # Base Cases  
            if j == 0 or j == i:  
                C[i][j] = 1
  
            # Calculate value using previously  
            # stored values  
            else: 
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]  
  
# Function to return the result for a query  
def answerQuery(mpp, C, k):  
  
    ans = 0
    # Iterate for every  
    # unique sub-string  
    for it in mpp:  
  
        # Count the combinations  
        if mpp[it] >= k:  
            ans += C[mpp[it]][k]  
  
    return ans  
  
# Driver code  
if __name__ == "__main__": 
      
    s = "aabaab"
      
    # Get all the sub-strings  
    # Store the occurrence of  
    # all the sub-strings  
    mpp = defaultdict(lambda:0) 
    generateSubStrings(s, mpp)  
  
    # Pre-computation  
    C = [[0 for i in range(maxlen)]  
            for j in range(maxlen)] 
    binomialCoeff(C)  
  
    # Queries  
    queries = [2, 3, 4]  
    q = len(queries)  
  
    # Perform queries  
    for i in range(0, q):  
        print(answerQuery(mpp, C, queries[i])) 
          
# This code is contributed by Rituraj Jain 

