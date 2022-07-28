

# Python3 implementation of above approach 
  
# Finds reverse of given num x. 
def reverseNum(x): 
    s = str(x) 
    s = s[::-1] 
    return int(s) 
      
def isMysteryNumber(n): 
      
    for i in range(1, n // 2 + 1): 
          
        # if found print the pair, return 
        j = reverseNum(i) 
          
        if i + j == n: 
            print(i, j) 
            return True
      
    print("Not a Mystery Number") 
    return False
  
# Driver Code 
n = 121
isMysteryNumber(n) 
  
# This code is contributed by  
# Mohit Kumar 29 (IIIT gwalior) 

