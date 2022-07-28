

# Python 3 implementation of 
# above approach 
  
# to store power of 2 
power = [0] * 31
  
# to store presum of the  
# power of 2's 
pre = [0] * 31
  
# function to find power of 2 
def PowerOfTwo(): 
  
    # to store power of 2 
    x = 1
    for i in range(31): 
        power[i] = x 
        x *= 2
  
    # to store pre sum 
    pre[0] = 1
    for i in range(1, 31): 
        pre[i] = pre[i - 1] + power[i] 
  
# Function to find the sum 
def Sum(n): 
      
    # first store sum of 
    # first n natural numbers. 
    ans = n * (n + 1) // 2
  
    # find the first greater number  
    # than given number then minus  
    # double of this from answer 
    for i in range( 31) : 
        if (power[i] > n): 
            ans -= 2 * pre[i - 1] 
            break
  
    return ans 
  
# Driver code 
if __name__ == "__main__": 
      
    # function call 
    PowerOfTwo() 
  
    n = 4
  
    # function call 
    print(Sum(n)) 
  
# This code is contributed  
# by ChitraNayal 

