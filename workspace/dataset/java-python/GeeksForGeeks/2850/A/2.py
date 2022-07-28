

# Python3 program to find the largest  
# palindromic subsequence  
  
# Function to find the largest  
# palindromic subsequence  
def largestPalinSub(s):  
  
    res = ""  
    mx = s[0]  
  
    # Find the largest character  
    for i in range(1, len(s)):  
        mx = max(mx, s[i])  
  
    # Append all occurrences of largest  
    # character to the resultant string  
    for i in range(0, len(s)):  
        if s[i] == mx:  
            res += s[i]  
  
    return res  
  
# Driver Code  
if __name__ == "__main__": 
  
    s = "geeksforgeeks"
    print(largestPalinSub(s))  
  
# This code is contributed by 
# Rituraj Jain  

