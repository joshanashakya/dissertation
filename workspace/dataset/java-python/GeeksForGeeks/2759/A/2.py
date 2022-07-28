

# Python3 implmentation to find the longest 
# palindromic String formed using 
# concatenation of given strings in any order 
  
# Function to find the longest palindromic 
# from given array of strings 
def longestPalindrome(a, n): 
    pair1 = [0]*n 
    pair2 = [0]*n 
    r = 0
  
    # Loop to find the pair of strings 
    # which are reverse of each other 
    for i in range(n): 
        s = a[i] 
        s = s[::-1] 
        for j in range(i + 1, n): 
            if (a[i] != "" and a[j] != ""): 
                if (s == a[j]): 
                    pair1[r] = a[i] 
                    pair2[r] = a[j] 
                    r += 1
                    a[i] = "" 
                    a[j] = "" 
                    break
  
    s1 = "" 
  
    # Loop to find if any palindromic 
    # is still left in the array 
    for i in range(n): 
        s = a[i] 
        a[i] = a[i][::-1] 
        if (a[i] != ""): 
            if (a[i] == s): 
                s1 = a[i] 
                break
  
    ans = "" 
  
    # Update the answer with 
    # all strings of pair1 
    for i in range(r): 
        ans = ans + pair1[i] 
      
    # Update the answer with 
    # palindromic s1 
    if (s1 != ""): 
        ans = ans + s1 
      
    # Update the answer with 
    # all strings of pair2 
    for j in range(r - 1, -1, -1): 
        ans = ans + pair2[j] 
    print(ans) 
  
# Driver Code 
a1 = ["aba", "aba"] 
n1 = len(a1) 
longestPalindrome(a1, n1) 
  
a2 = ["abc", "dba", "kop","abd", "cba"] 
n2 = len(a2) 
longestPalindrome(a2, n2) 
  
# This code is contributed by mohit kumar 29 

