

# Python 3 program to find the 
# count of Steps to reduce N to 
# zero by subtracting its most 
# significant digit at every step 
  
# Function to count the number 
# of digits in a number m 
def countdig(m) : 
  
    if (m == 0) : 
        return 0
    else : 
        return 1 + countdig(m // 10) 
  
# Function to count the number  
# of steps to reach 0 
def countSteps(x) : 
      
    # count the total number  
    # of stesp 
    c = 0
    last = x 
  
    # iterate till we reach 0 
    while (last) : 
  
        # count the digits in last 
        digits = countdig(last) 
  
        # decrease it by 1 
        digits -= 1
  
        # find the number on whose  
        # division, we get the first digit 
        divisor = pow(10, digits) 
  
        # first digit in last 
        first = last // divisor 
  
        # find the first number less  
        # than last where the first  
        # digit changes 
        lastnumber = first * divisor 
  
        # find the number of numbers 
        # with same first digit that  
        # are jumped 
        skipped = (last - lastnumber) // first 
  
        skipped += 1
  
        # count the steps 
        c += skipped 
  
        # the next number with a different 
        # first digit 
        last = last - (first * skipped) 
  
    return c 
  
# Driver code 
n = 14
print(countSteps(n)) 
  
# This code is contributed by ANKITRAI1 

