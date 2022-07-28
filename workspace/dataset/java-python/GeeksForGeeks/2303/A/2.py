

# Python3 implementation of above approach 
  
# Function that returns the minimum 
# number of operations to be performed 
# to reduce the number to 1 
def count_minimum_operations(n): 
  
    # To stores the total number of 
    # operations to be performed 
    count = 0
    while (n > 1) : 
  
        # if n is divisible by 3 
        # then reduce it to n / 3 
        if (n % 3 == 0): 
            n //= 3
  
        # if n modulo 3 is 1 
        # decrement it by 1 
        elif (n % 3 == 1): 
            n -= 1
        else : 
            if (n == 2): 
                n -= 1
              
            # if n modulo 3 is 2 
            # then increment it by 1 
            else: 
                n += 1
          
        # update the counter 
        count += 1
      
    return count 
  
# Driver code 
if __name__ =="__main__": 
    n = 4
    ans = count_minimum_operations(n) 
    print (ans) 
  
# This code is contributed  
# by ChitraNayal 

