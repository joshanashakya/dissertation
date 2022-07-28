

# Python3 implmentation to check 
# wheather array of strrings 
# can correspond to a number X 
  
# Function to find the maximum  
# base possible for the number N 
def val(c): 
    if (c >= '0' and c <= '9'): 
        return int(c) 
    else: 
        return c - 'A' + 10
          
# Function to find the decimal 
# equivalennt of the number 
def toDeci(strr, base): 
      
    lenn = len(strr) 
    power = 1
    num = 0
    for i in range(lenn - 1, -1, -1): 
          
        # Condition to check if the 
        # number is convertible  
        # to another base 
        if (val(strr[i]) >= base): 
            return -1
          
        num += val(strr[i]) * power 
        power = power * base 
      
    return num 
  
  
# Function to check that the  
# array can correspond to a number X  
def checkCorrespond(strr, x): 
      
    # counter to count the numbers 
    # those are convertible to X 
    counter = 0
    n = len(strr) 
      
    # Loop to iterate over the array 
    for i in range(n): 
        for j in range(2,37): 
              
            # Convert the current strring 
            # to every base for checking 
            # whether it will correspond 
            # to X from any base 
            if (toDeci(strr[i], j) == x): 
                counter += 1
                break
              
    # Condition to check if every 
    # number of the array can 
    # be converted to X 
    if (counter == n): 
        print("YES") 
    else: 
        print("NO") 
  
# Driver Code 
x = 16
  
# The set of strrings  
# in base from [2, 36] 
strr = ["10000", "20", "16"] 
checkCorrespond(strr, x) 
  
# This code is contributed by shubhamsingh10 

