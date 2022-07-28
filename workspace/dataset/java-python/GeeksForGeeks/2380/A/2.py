

# Python3 program to count number of multiples  
# of 2 or 3 or 5 less than or equal to N  
  
  
# Function to count number of multiples  
# of 2 or 3 or 5 less than or equal to N  
def countMultiples( n):  
  
    # As we have to check divisibility  
    # by three numbers, So we can implement  
    # bit masking  
    multiple = [ 2, 3, 5 ]  
      
    count = 0
    mask = int(pow(2, 3))  
    for i in range(1,mask):  
        # we check whether jth bit  
        # is set or not, if jth bit  
        # is set, simply multiply  
        # to prod  
        prod = 1
        for j in range(3):  
  
            # check for set bit  
            if (i & (1 << j)):  
                prod = prod * multiple[j]  
          
        # check multiple of product  
        if (bin(i).count('1') % 2 == 1):  
            count = count + n // prod  
        else: 
            count = count - n // prod  
      
    return count  
  
  
# Driver code 
if __name__=='__main__': 
    n = 10
    print(countMultiples(n))  
      
# This code is contributed by ash264 

