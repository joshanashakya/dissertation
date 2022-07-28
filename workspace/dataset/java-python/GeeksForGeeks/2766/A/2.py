

# Python3 implementation of the approach  
from collections import defaultdict 
  
# Function to return the count of  
# common words in all the sentences  
def commonWords(S):  
  
    # It will be used to check if a word  
    # is present in a particuler string  
    has = defaultdict(lambda:False)  
  
    # To store all the words of first string  
    ans = []  
  
    # m will store number of strings  
    # in given vector  
    m = len(S)  
  
    i = 0
      
    # Extract all words of first string  
    # and store it in ans  
    while i < len(S[0]):  
        string = ""  
        while i < len(S[0]) and S[0][i] != ' ':  
            string += S[0][i]  
            i += 1
  
        # Increase i to get at starting  
        # index of the next word  
        i += 1
  
        # If str is not empty store it in map  
        if string != "":  
            ans.append([string, True])  
  
    # Start from 2nd line check if any word  
    # of the first string did not match with  
    # some word in the current line  
    for j in range(1, m): 
        has.clear()  
        i = 0
  
        while i < len(S[j]):  
            string = ""  
            while i < len(S[j]) and S[j][i] != ' ':  
                string += S[j][i]  
                i += 1
              
            i += 1
            if string != "":  
                has[string] = True
          
        # Check all words of this vector  
        # if it is not present in current  
        # line make it false  
        for k in range(0, len(ans)):  
            if (ans[k][1] != False and
                has[ans[k][0]] == False):  
                ans[k][1] = False
              
            # This line is used to consider  
            # only distinct words  
            elif (ans[k][1] != False
                and has[ans[k][0]] == True):  
                has[ans[k][0]] = False
  
    # This function will print  
    # the count of common words  
    cnt = 0
  
    # If current word appears in all 
    # the sentences  
    for k in range(0, len(ans)):  
        if ans[k][1] == True:  
            cnt += 1
  
    return cnt  
  
# Driver code  
if __name__ == "__main__": 
  
    S = []  
    S.append("there is a cow")  
    S.append("cow is our mother")  
    S.append("cow gives us milk and milk is sweet")  
    S.append("there is a boy who loves cow")  
  
    print(commonWords(S))  
  
# This code is contributed by Rituraj Jain  

