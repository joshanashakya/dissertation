

# Python3 program to solve the above problem  
  
# Recursive function to find minimum number  
# of cuts if length of string is even  
def solveEven(s):  
  
    # If length is odd then return 2  
    if len(s) % 2 == 1:  
        return 2
  
    # To check if half of palindromic  
    # string is itself a palindrome  
    ls = s[0 : len(s) // 2]  
    rs = s[len(s) // 2 : len(s)]  
  
    # If not then return 1  
    if ls != rs: 
        return 1
  
    # Else call function with  
    # half palindromic string  
    return solveEven(ls)  
  
# Function to find minimum number of cuts  
# If length of string is odd  
def solveOdd(s): 
    return 2
  
def solve(s):  
  
    # If length is <=3 then it is impossible  
    if len(s) <= 3:  
        return -1
      
    # Array to store frequency of characters  
    cnt = [0] * 25
  
    # Store count of characters in a array  
    for i in range(0, len(s)):  
        cnt[ord(s[i]) - ord('a')] += 1
      
    # Condition for edge cases  
    if max(cnt) >= len(s) - 1:  
        return -1
      
    # If length is even  
    if len(s) % 2 == 0:  
        return solveEven(s)  
  
    # If length is odd  
    if len(s) % 2 == 1:  
        return solveOdd(s)  
  
# Driver Code  
if __name__ == "__main__":  
  
    s = "nolon"
    print(solve(s))  
  
# This code is contributed by Rituraj Jain 

