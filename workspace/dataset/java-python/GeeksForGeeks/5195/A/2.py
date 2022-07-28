

# Python3 implementation of the approach  
  
# Function that returns true if every  
# lowercase character appears atmost once  
def valid(cnt):  
  
    # Every character frequency must  
    # be not greater than one  
    for i in range(0, 26):  
        if cnt[i] >= 2:  
            return False
  
    return True
  
# Function that returns the modified  
# good string if possible  
def getGoodString(s, n):  
  
    # If the length of the string is 
    # less than n  
    if n < 26: 
        return "-1"
  
    # Sub-strings of length 26  
    for i in range(25, n):  
  
        # To store frequency of each character  
        cnt = [0] * 26
  
        # Get the frequency of each character  
        # in the current sub-string  
        for j in range(i, i - 26, -1):  
            if s[j] != '?': 
                cnt[ord(s[j]) - ord('a')] += 1
  
        # Check if we can get sub-string  
        # containing the 26 characters all 
        if valid(cnt):  
  
            # Find which character is missing  
            cur = 0
            while cur < 26 and cnt[cur] > 0:  
                cur += 1
  
            for j in range(i - 25, i + 1):  
  
                # Fill with missing characters  
                if s[j] == '?': 
                    s[j] = chr(cur + ord('a'))  
                    cur += 1
  
                    # Find the next missing character  
                    while cur < 26 and cnt[cur] > 0: 
                        cur += 1
  
            # Return the modified good string  
            return ''.join(s)  
  
    return "-1"
  
# Driver code  
if __name__ == "__main__": 
  
    s = "abcdefghijkl?nopqrstuvwxy?"
    n = len(s)  
  
    print(getGoodString(list(s), n))  
  
# This code is contributed by Rituraj Jain 

