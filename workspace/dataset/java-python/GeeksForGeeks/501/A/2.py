

# Python3 program for above approach 
  
# function to calculate the value 
# of the a and r of geometric series 
def values_of_r_and_a(m, n, mth, nth): 
  
    a, r = 0.0, 0.0
  
    if (m < n): 
        m, n = n, m 
        mth, nth = mth, nth 
  
    # calculate value of r using formula 
    r = pow(mth // nth, 1.0 /(m - n)) 
  
    # calculate value of a using value of r 
    a = mth // pow(r, (m - 1)) 
  
    # push both values in the vector 
    # and return it 
    return a, r 
  
# function to calculate the value 
# of pth term of the series 
def FindSum(m, n, mth, nth, p): 
  
  
    # first calculate value of a and r 
    a,r = values_of_r_and_a(m, n, mth, nth) 
  
    # calculate pth term by using formula 
    pth = a * pow(r, (p - 1.0)) 
  
    # return the value of pth term 
    return pth 
  
# Driven Code 
m, n, p = 10, 5, 15
mth, nth = 2560.0, 80.0
print(FindSum(m, n, mth, nth, p)) 
      
# This code is contributed by  
# Mohit kumar 29 

