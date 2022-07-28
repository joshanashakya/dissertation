

# Python3 program to find minimum number 
# of steps to reach M from N 
  
# Function to find a minimum number 
# of steps to reach M from N 
def Minsteps(n, m): 
  
    ans = 0
      
    # Continue till m is greater than n 
    while(m > n): 
  
        # If m is odd 
        if(m & 1): 
              
            # add one 
            m += 1
            ans += 1
          
        # divide m by 2      
        m //= 2
        ans += 1
      
    # Return the required answer 
    return ans + n - m 
  
# Driver code 
n = 4
m = 6
  
print(Minsteps(n, m)) 
  
# This code is contributed by mohit kumar 

