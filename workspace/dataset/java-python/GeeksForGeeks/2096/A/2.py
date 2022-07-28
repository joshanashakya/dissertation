

# Python3 implementation of the given approach.  
  
def solve(i, tight, sum_so_far, Sum, number, length):  
  
    if i == length:  
  
        # If sum_so_far equals to given  
        # sum then return 1 else 0  
        if sum_so_far == Sum:  
            return 1
        else: 
            return 0
      
    ans = dp[i][tight][sum_so_far]  
    if ans != -1:  
        return ans  
      
    ans = 0
    for currdigit in range(0, 10):  
  
        currdigitstr = str(currdigit) 
          
        # Our constructed number should  
        # not become greater than N.  
        if not tight and currdigitstr > number[i]:  
            break
  
        # If tight is true then it will also be true for (i+1) digit.  
        ntight = tight or currdigitstr < number[i]  
        nsum_so_far = sum_so_far + currdigit  
        ans += solve(i + 1, ntight, nsum_so_far, Sum, number, length)  
      
    return ans  
  
# Driver code  
if __name__ == "__main__": 
  
    count, Sum = 0, 4
    number = "100"
    dp = [[[-1 for i in range(162)] for j in range(2)] for k in range(18)] 
    print(solve(0, 0, 0, Sum, number, len(number))) 
  
# This code is contributed by Rituraj Jain 

