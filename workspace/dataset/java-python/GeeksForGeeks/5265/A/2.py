

# Python3 program to find x such  
# that 1*n, 2*n, 3*n ...x * n 
# have all digits from 1 to 9  
# at least once 
  
# Returns smallest value x such  
# that 1*n, 2*n, 3*n ...x * n  
# have all digits from 1 to 9  
# at least once 
def smallestX(n): 
    # taking temporary  
    # array and variable. 
    temp = [0]*10
  
    if (n == 0): 
        return -1
  
    # iterate till we get  
    # all the 10 digits  
    # at least once 
    count = 0
    x = 1
    while(count < 10):  
        y = x * n 
          
        # checking all 
        # the digits 
        while (y>0): 
            if (temp[y % 10] == 0): 
                count+=1
                temp[y % 10] = 1
            y = int(y / 10) 
        x+=1
  
    return x - 1
  
  
# Driver code 
if __name__=='__main__': 
    n = 5
    print(smallestX(n)) 
  
# This code is contributed  
# by mits 

