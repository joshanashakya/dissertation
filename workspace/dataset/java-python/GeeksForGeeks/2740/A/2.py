

# Python3 implementation of  
# the above approach 
  
# Function to check if a string  
# is palindrome or not 
def isPalindrome(s): 
  
    # String that stores characters 
    # of s in reverse order 
    s1 = "" 
  
    # Length of the string s 
    N = len(s) 
    i = (N - 1) 
    while(i >= 0): 
        s1 += s[i] 
        i = i - 1
  
    if (s == s1): 
        return True
    return False
  
def createString(N): 
  
    s2 = "" 
    s = str(N) 
  
    # String used to form 
    # substring using N 
    letters = "abcdefghij"
      
    # Variable to store sum  
    # of digits of N 
    sum = 0
    substr = "" 
  
    # Forming the substring  
    # by traversing N 
    for i in range(0, len(s)) : 
        digit = int(s[i]) 
        substr += letters[digit] 
        sum += digit 
      
    # Appending the substr to str till 
    # it's length becomes equal to sum 
    while (len(s2) <= sum): 
        s2 += substr 
  
    # Trimming the string str so that  
    # it's length becomes equal to sum 
    s2 = s2[:sum] 
  
    return isPalindrome(s2) 
  
# Driver code 
N = 61; 
  
# Calling function isPalindrome to  
# check if str is Palindrome or not 
flag = createString(N) 
if (flag): 
    print("YES") 
else: 
    print("NO") 
  
# This code is contributed by ihritik 

