

# Python implementation of the above approach 
  
# check if a number is a palindrome 
def ispalindrome(x): 
    ans, temp = 0, x 
    while temp > 0: 
        ans = 10 * ans + temp % 10
        temp = temp // 10
    return ans == x 
  
# Function to return required count of palindromes 
def SuperPalindromes(L, R): 
    # Range [L, R] 
    L, R = int(L), int(R) 
  
    # Upper limit 
    LIMIT = 100000
  
    ans = 0
  
    # count odd length palindromes 
    for i in range(LIMIT): 
        s = str(i)  # if s = '1234' 
        p = s + s[-2::-1]  # then, t = '1234321' 
        p_sq = int(p) ** 2
        if p_sq > R: 
            break
        if p_sq >= L and ispalindrome(p_sq): 
            ans = ans + 1
  
    # count even length palindromes 
    for i in range(LIMIT): 
        s = str(i)  # if s = '1234' 
        p = s + s[::-1]  # then, t = '12344321' 
        p_sq = int(p) ** 2
        if p_sq > R: 
            break
        if p_sq >= L and ispalindrome(p_sq): 
            ans = ans + 1
  
    # Return count of super-palindromes 
    return ans 
  
# Driver program 
L = "4"
R = "1000"
  
# function call to get required answer 
print(SuperPalindromes(L, R)) 
  
# This code is written by 
# Sanjit_Prasad 

