

# Python3 code to find the number of steps 
  
# Modified Binary search function 
# to solve the equation 
def solve( low, high, T ): 
      
    while low <= high: 
        mid = int((low + high) / 2) 
          
        # if mid is solution to equation 
        if (mid * (mid + 1)) == T: 
            return mid 
          
        # if our solution to equation  
        # lies between mid and mid-1 
        if (mid > 0 and (mid * (mid + 1)) > T  
                and (mid * (mid - 1)) <= T) : 
            return mid - 1
                      
        # if solution to equation is 
        # greater than mid 
        if (mid * (mid + 1)) > T: 
            high = mid - 1; 
              
        # if solution to equation is 
        # less than mid 
        else: 
            low = mid + 1
    return -1
      
# driver code 
T = 15
  
# call binary search method to 
# solve for limits 1 to T 
ans = solve(1, T, 2 * T) 
  
# Because our pattern starts from 2, 3, 4, 5... 
# so, we subtract 1 from ans 
if ans != -1: 
    ans-= 1
  
print("Number of stair steps = ", ans) 
  
# This code is contributed by "Sharad_Bhardwaj". 

