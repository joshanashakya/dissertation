

# Python 3 implementation of the  
# above approach 
  
# returns the minimum time 
# required to reach 'X' 
def cal_minimum_time(X): 
  
    # Stores the minimum time 
    t = 0
    sum = 0
  
    while (sum < X): 
          
        # increment 't' by 1 
        t = t + 1
          
        # update the sum 
        sum = sum + t; 
      
    return t; 
  
# Driver code 
if __name__ == '__main__': 
    n = 6
    ans = cal_minimum_time(n) 
    print("The minimum time required is :", ans)  
      
# This code is contributed By 
# Surendra_Gangwar 

