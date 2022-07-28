

# Python 3 program to solve the above problem 
  
# Function to check if string is palindrome or not 
def isPalindrome(s): 
    for i in range(len(s)): 
        if (s[i] != s[len(s) - i - 1]): 
            return False
      
    return true 
  
# Function to check if it is possible to 
# get result by making just one cut 
def ans(s): 
    s2 = s 
  
    for i in range(len(s)): 
          
        # Appending last element in front 
        s2 = s2[len(s2) - 1] + s2 
          
        # Removing last element 
        s2 = s2[0:len(s2) - 1] 
  
        # Checking whether string s2 is palindrome 
        # and different from s. 
        if (s != s2 and isPalindrome(s2)): 
            return True
      
    return False
  
def solve(s): 
      
    # If length is <=3 then it is impossible 
    if (len(s) <= 3): 
        return -1
  
    # Array to store frequency of characters 
    cnt = [0 for i in range(26)] 
  
    # Store count of characters in a array 
    for i in range(len(s)): 
        cnt[ord(s[i]) - ord('a')] += 1
  
    # Condition for edge cases 
    max = cnt[0] 
    for i in range(len(cnt)): 
        if cnt[i]>max: 
            max = cnt[i] 
    if (max >= len(s) - 1): 
        return -1
      
    else: 
          
        # Return 1 if it is possible to get  
        # palindromic string in just one cut. 
        # Else we can always reached in two cuttings. 
        if ans(s) == True: 
            return 1
        else: 
            return 2
  
# Driver Code 
if __name__ == '__main__': 
    s = "nolon"
  
    print(solve(s)) 
      
# This code is contributed by 
# Surendra_Gangwar 

