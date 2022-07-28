

# Python3 implementation of the above approach 
  
# Function to find the Number of sub-strings 
# without using given character 
def countSubstring(S, L,n): 
    freq = [0 for i in range(26)] 
      
    # the freq array 
    for i in range(n): 
        freq[(ord(L[i]) - ord('a'))] = 1
  
    # Count variable to store the count 
    # of the characters until a character 
    # from given L is encountered 
    count,ans = 0,0
  
    for x in S: 
  
        # If a character from L is encountered, 
        # then the answer variable is incremented by 
        # the value obtained by using 
        # the mentioned formula and count is set to 0 
        if (freq[ord(x) - ord('a')]): 
            ans += (count * count + count) // 2
            count = 0
        else: 
            count += 1
  
    # For last remaining characters 
    ans += (count * count + count) // 2
  
    return ans 
  
# Driver code 
  
S = "abcpxyz"
L = ['a', 'p', 'q'] 
n = len(L) 
  
print(countSubstring(S, L, n)) 
  
# This code is contributed by mohit kumar 29 

