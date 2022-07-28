

# Python3 implementation to reverse 
# the substrings of the given String 
# according to the given Array of indices 
  
# Function to reverse a string 
def reverseStr(str, l, h): 
    n = h - l 
  
    # Swap character starting 
    # from two corners 
    for i in range(n//2): 
        str[i + l], str[n - i - 1 + l] = str[n - i - 1 + l], str[i + l] 
  
# Function to reverse the string 
# with the given array of indices 
def reverseString(s, A, n): 
  
    # Reverse the from 0 to A[0] 
    reverseStr(s, 0, A[0]) 
  
    # Reverse the for A[i] to A[i+1] 
    for i in range(1, n): 
        reverseStr(s, A[i - 1], A[i]) 
  
    # Reverse String for A[n-1] to length 
    reverseStr(s, A[n - 1], len(s)) 
  
# Driver Code 
s = "abcdefgh"
s = [i for i in s] 
A = [2, 4, 6] 
n = len(A) 
  
reverseString(s, A, n) 
print("".join(s)) 
  
# This code is contributed by mohit kumar 29 

