

# A simple recursive implementation for 
# counting ways to reach a score using 1 and 2 with 
# consecutive 2 allowed 
  
def CountWays(n,flag): 
  
    # base case 
    if n ==0: 
        return 1
    sum =0
    # 2 is not scored last time so  
    # we can score either 2 or 1  
    if flag ==False and n>1: 
        sum = sum+CountWays(n-1,False)+CountWays(n-2,True) 
    else: 
    # 2 is scored last time so we can only score 1  
        sum = sum+CountWays(n-1,False) 
    return sum
  
# Driver code 
if __name__=='__main__': 
    n = 5
    print(CountWays(n,False)) 
  
# This code is contributed by  
# Shrikant13 

