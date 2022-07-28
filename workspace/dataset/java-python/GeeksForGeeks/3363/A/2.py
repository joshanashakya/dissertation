

# Python3 program to convert string X to 
# string Y which minimum number of changes. 
MAX = 26
  
# Function that converts string X 
# into lexicographically smallest 
# anagram of string Y with minimal changes 
def printAnagramAndChanges(x, y): 
    x = list(x) 
    y = list(y) 
    countx, county = [0] * MAX, [0] * MAX
    ctrx, ctry = [0] * MAX, [0] * MAX
  
    change = 0
    l = len(x) 
  
    # Counting frequency of characters 
    # in each string. 
    for i in range(l): 
        countx[ord(x[i]) - ord('A')] += 1
        county[ord(y[i]) - ord('A')] += 1
  
    # We maintain two more counter arrays 
    # ctrx[] and ctry[] 
    # Ctrx[] maintains the count of extra 
    # elements present in string X than 
    # string Y 
    # Ctry[] maintains the count of 
    # characters missing from string X 
    # which should be present in string Y. 
    for i in range(MAX): 
        if countx[i] > county[i]: 
            ctrx[i] += (countx[i] - county[i]) 
        elif countx[i] < county[i]: 
            ctry[i] += (county[i] - countx[i]) 
        change += abs(county[i] - countx[i]) 
  
    for i in range(l): 
  
        # This means that we cannot edit the 
        # current character as it's frequency 
        # in string X is equal to or less 
        # than the frequency in string Y. 
        # Thus, we go to the next position 
        if ctrx[ord(x[i]) - ord('A')] == 0: 
            continue
  
        # Here, we try to find that character, 
        # which has more frequency in string Y 
        # and less in string X. We try to find 
        # this character in lexicographical 
        # order so that we get 
        # lexicographically smaller string 
        j = 0
        for j in range(MAX): 
            if ctry[j] > 0: 
                break
  
        # This portion deals with the 
        # lexicographical property. 
        # Now, we put a character in string X 
        # when either this character has smaller 
        # value than the character present there 
        # right now or if this is the last position 
        # for it to exchange, else we fix the 
        # character already present here in 
        # this position. 
        if countx[ord(x[i]) -
                ord('A')] == ctrx[ord(x[i]) - ord('A')] or \ 
                                  ord(x[i]) - ord('A') > j: 
            countx[ord(x[i]) - ord('A')] -= 1
            ctrx[ord(x[i]) - ord('A')] -= 1
            ctry[j] -= 1
            x[i] = chr(ord('A') + j) 
        else: 
            countx[ord(x[i]) - ord('A')] -= 1
  
    print("Anagram :", ''.join(x)) 
    print("Number of changes made :", change // 2) 
  
# Driver Code 
if __name__ == "__main__": 
    x = "CDBABC"
    y = "ADCABD"
    printAnagramAndChanges(x, y) 
  
# This code is conributed by 
# sanjeev2552 

