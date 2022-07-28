

# Python3 implementation to find the  
# length of longest common subsequence  
# which contains all vowel characters 
  
# function to check whether 'ch' 
# is a vowel or not 
def isVowel(ch): 
    if (ch == 'a' or ch == 'e' or
        ch == 'i'or ch == 'o' or 
        ch == 'u'): 
        return True
    return False
  
# function to find the length of longest  
# common subsequence which contains all  
# vowel characters 
def lcs(X, Y, m, n): 
  
    L = [[0 for i in range(n + 1)] 
            for j in range(m + 1)] 
    i, j = 0, 0
   
    # Following steps build L[m+1][n+1] in  
    # bottom up fashion. Note that L[i][j]  
    # contains length of LCS of X[0..i-1]  
    # and Y[0..j-1] 
    for i in range(m + 1): 
        for j in range(n + 1): 
            if (i == 0 or j == 0): 
                L[i][j] = 0
            elif ((X[i - 1] == Y[j - 1]) and
                      isVowel(X[i - 1])): 
                L[i][j] = L[i - 1][j - 1] + 1
            else: 
                L[i][j] = max(L[i - 1][j], 
                              L[i][j - 1]) 
      
    # L[m][n] contains length of LCS for 
    # X[0..n-1] and Y[0..m-1] which  
    # contains all vowel characters 
    return L[m][n] 
  
# Driver Code 
X = "aieef"
Y = "klaief"
  
m = len(X) 
n = len(Y) 
  
print("Length of LCS =", lcs(X, Y, m, n)) 
  
# This code is contributed by Mohit Kumar 

