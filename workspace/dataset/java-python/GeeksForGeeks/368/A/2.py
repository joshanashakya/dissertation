

# Python3 implementation of above approach 
def max_profit(a, b, n, fee): 
  
    i, j, profit = 1, n - 1, 0
      
    l, r, diff_day = 0, 0, 1 
      
    # b[0] will contain the maximum profit 
    b[0] = 0    
      
    # b[1] will contain the day on which  
    # we are getting the maximum profit 
    b[1] = diff_day 
  
    for i in range(1, n): 
        l = 0
        r = diff_day 
        Sum = 0
      
        for j in range(n - 1, i - 1, -1): 
              
            # here finding the max profit 
            profit = (a[r] - a[l]) - fee  
          
            # if we get less then or equal to zero 
            # it means we are not getting the profit  
            if(profit > 0): 
                Sum = Sum + profit 
                      
            l += 1
            r += 1
                  
        # check if Sum is greater then maximum  
        # then store the new maximum 
        if(b[0] < Sum): 
            b[0] = Sum
            b[1] = diff_day  
      
    diff_day += 1
      
    return 0
      
# Driver code 
arr = [6, 1, 7, 2, 8, 4]  
n = len(arr) 
b = [0 for i in range(2)] 
tranFee = 2
  
max_profit(arr, b, n, tranFee) 
  
print(b[0], ",", b[1]) 
  
# This code is contributed by 
# Mohit kumar 29 

