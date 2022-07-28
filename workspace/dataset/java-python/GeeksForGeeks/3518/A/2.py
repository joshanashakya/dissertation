

# Python3 program of finding nth palindrome 
# of k digit 
  
def nthPalindrome(n, k): 
  
    # Determine the first half digits 
    if(k & 1): 
        temp = k // 2
    else: 
        temp = k // 2 - 1
  
    palindrome = 10**temp 
    palindrome = palindrome + n - 1
  
    # Print the first half digits of palindrome 
    print(palindrome, end="") 
  
    # If k is odd, truncate the last digit 
    if(k & 1): 
        palindrome = palindrome // 10
  
    # print the last half digits of palindrome 
    while(palindrome): 
        print(palindrome % 10, end="") 
        palindrome = palindrome // 10
  
# Driver code 
if __name__=='__main__': 
    n = 6
    k = 5
    print(n, "th palindrome of", k, " digit = ", end=" ") 
    nthPalindrome(n, k) 
    print() 
    n = 10
    k = 6
    print(n, "th palindrome of", k, "digit = ",end=" ") 
    nthPalindrome(n, k) 
  
# This code is contributed by 
# Sanjit_Prasad 

