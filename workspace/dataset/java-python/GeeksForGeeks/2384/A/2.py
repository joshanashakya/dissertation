

# Python 3 program for brute force approach  
# to find largest number having digits in  
# non-decreasing order.  
  
# Returns the required number 
def nondecdigits( n): 
  
    ''' loop to recursively check the numbers  
    less than or equal to given number'''
    x = 0
    for x in range(n, 0, -1): 
        no = x 
        prev_dig = 11
  
        # Keep traversing digits from 
        # right to left. For every digit 
        # check if it is smaller than prev_dig 
        flag = True
        while (no != 0): 
            if (prev_dig < no % 10): 
                flag = False
                break
              
            prev_dig = no % 10
            no //= 10
  
        # We found the required number 
        if (flag == True): 
            break
    return x 
  
# Driver Code 
if __name__=="__main__": 
      
    n = 200
    print(nondecdigits(n)) 
  
# This code is contributed by ita_c 

