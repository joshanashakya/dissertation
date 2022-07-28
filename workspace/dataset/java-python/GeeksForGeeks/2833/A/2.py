

# Python 3 implementation of the approach 
  
# Function that returns true if 
# a palindrome can be formed using 
# exactly k characters 
def isPalindrome(freq, k):  
      
    # Variable to check if characters 
    # with odd frequency are present 
    flag = 0
  
    # Variable to store maximum length 
    # of the palindrome that can be formed 
    length = 0
  
    for i in range(26): 
        if (freq[i] == 0): 
            continue
  
        elif (freq[i] == 1): 
            flag = 1
  
        else: 
            if (freq[i] & 1): 
                flag = 1
            length += freq[i] // 2
  
    # If k is odd 
    if (k & 1): 
        if (2 * length + flag >= k): 
            return True
  
    # If k is even 
    else: 
        if (2 * length >= k): 
            return True
  
    # If palindrome of length 
    # k cant be formed 
    return False
  
# Function that returns true if a palindrome 
# of length k can be formed from a 
# sub-string of length m 
def check(str, m, k): 
      
    # Stores frequency of characters 
    # of a substring of length m 
    freq = [0 for i in range(26)]  
  
    for i in range(m): 
        freq[ord(str[i]) - ord('a')] += 1
  
    # If a palindrome can be 
    # formed from a substring of 
    # length m 
    if (isPalindrome(freq, k)): 
        return True
  
    # Check for all the substrings of 
    # length m, if a palindrome of 
    # length k can be formed 
    for i in range(m, len(str), 1): 
        freq[ord(str[i - m]) - ord('a')] -= 1
        freq[ord(str[i]) - ord('a')] += 1
  
        if (isPalindrome(freq, k)): 
            return True
  
    # If no palindrome of length 
    # k can be formed 
    return False
  
# Function to return the minimum length 
# of the sub-string whose characters can be 
# used to form a palindrome of length k 
def find(str, n, k): 
    l = k 
    h = n 
  
    # To store the minimum length of the 
    # sub-string that can be used to form 
    # a palindrome of length k 
    ans = -1
  
    while (l <= h): 
        m = (l + h) // 2
        if (check(str, m, k)): 
            ans = m 
            h = m - 1
          
        else: 
            l = m + 1
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    str = "abcda"
    n = len(str) 
    k = 2
    print(find(str, n, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

