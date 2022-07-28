

# Python3 program to calculate number 
# of substring  
  
# Return the number of substring divisible  
# by 6 and starting at index i in s[] and  
# previous sum of digits modulo 3 is m.  
def f(i, m, s, memoize): 
      
    # End of the string.  
    if (i == len(s)): 
        return 0
  
    # If already calculated, return  
    # the stored value.  
    if (memoize[i][m] != -1):  
        return memoize[i][m]  
  
    # Converting into integer.  
    x = ord(s[i]) - ord('0') 
  
    # Increment result by 1, if current digit  
    # is divisible by 2 and sum of digits is  
    # divisible by 3.  
    # And recur for next index with new modulo.  
    ans = (((x + m) % 3 == 0 and x % 2 == 0) +
          f(i + 1, (m + x) % 3, s, memoize))  
  
    memoize[i][m] = ans 
    return memoize[i][m] 
  
# Returns substrings divisible by 6.  
def countDivBy6(s): 
    n = len(s) 
  
    # For storing the value of all states. 
    memoize = [[-1] * 3 for i in range(n + 1)] 
  
    ans = 0
    for i in range(len(s)): 
          
        # If string contain 0, increment  
        # count by 1.  
        if (s[i] == '0'): 
            ans += 1
  
        # Else calculate using recursive function.  
        # Pass previous sum modulo 3 as 0.  
        else: 
            ans += f(i, 0, s, memoize) 
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    s = "4806"
  
    print(countDivBy6(s)) 
  
# This code is contributed by PranchalK 

