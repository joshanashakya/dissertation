

# Python3 implementation  
# of above approach 
  
# Function to find profit 
def solve(N, M, cp, sp) : 
      
    # take empty list 
    profit = [] 
      
    # Calculating profit 
    # for each gadget 
    for i in range(N) : 
        profit.append(sp[i] - cp[i]) 
  
    # sort the profit array 
    # in decending order 
    profit.sort(reverse = True) 
  
    sum = 0
      
    # check for best M profits 
    for i in range(M) : 
        if profit[i] > 0 : 
            sum += profit[i] 
        else : 
            break
  
    return sum
  
# Driver Code 
if __name__ == "__main__" : 
  
    N, M = 5, 3
    CP = [5, 10, 35, 7, 23] 
    SP = [11, 10, 0, 9, 19] 
      
    # function calling 
    print(solve(N, M, CP, SP)) 
      
# This code is contributed 
# by ANKITRAI1  

