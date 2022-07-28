

# Python program to find if Array can have sum 
# of K by applying three types of possible 
# operations on it 
  
MAX = 100
  
# Check if it is possible to achieve a sum with  
# three operation allowed 
def check(i, add, n, k, a, dp): 
  
    # if sum id negative. 
    if add <= 0: 
        return False
      
    # If going out of bound. 
    if i >= n: 
        if add == k: 
            return True
          
        return False
      
    # If the current state is not evaluated yet. 
    if dp[i][add] != -1: 
        return dp[i][add] 
      
    # Replacing element with negative value of 
    # the element. 
    dp[i][add] = (check(i+1, add-2*a[i], n, 
        k, a, dp) or check(i+1, add, n, k, a, dp)) 
      
    # Substracting index number from the element. 
    dp[i][add] = (check(i+1, add - (i+1), n, 
        k, a, dp) or dp[i][add]) 
      
    # Adding index number to the element. 
    dp[i][add] = (check(i+1, add+i+1, n, 
                        k, a, dp) or dp[i][add]) 
      
    return dp[i][add] 
  
# Wrapper Function 
def wrapper(n, k, a): 
    add = 0
    for i in range(n): 
        add += a[i] 
      
    dp = [-1]*MAX
    for i in range(MAX): 
        dp[i] = [-1]*MAX
  
    return check(0, add, n, k, a, dp) 
  
# Driver Code 
if __name__ == "__main__": 
    a = [1,2,3,4] 
    n = 4
    k = 5
  
    print("Yes") if wrapper(n, k, a) else print("No") 
  
# This code is contributed by 
# sanjeev2552 

