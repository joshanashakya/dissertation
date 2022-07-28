

# Given two strings, check which string 
# makes palindrome first. 
  
MAX_CHAR = 26
  
# returns winner of two strings 
def stringPalindrome(A, B): 
      
    # Count frequencies of characters  
    # in both given strings 
    countA = [0] * MAX_CHAR 
    countB = [0] * MAX_CHAR 
    l1 = len(A) 
    l2 = len(B) 
    for i in range(l1): 
        countA[ord(A[i]) - ord('a')] += 1
    for i in range(l2): 
        countB[ord(B[i]) - ord('a')] += 1
  
    # Check if there is a character that 
    # appears more than once in A and  
    # does not appear in B 
    for i in range(26): 
        if ((countA[i] > 1 and countB[i] == 0)): 
            return 'A'
    return 'B'
  
# Driver Code 
if __name__ == '__main__': 
    a = "abcdea"
    b = "bcdesg"
    print(stringPalindrome(a, b)) 
  
# This code is contributed by Rajput-Ji 

