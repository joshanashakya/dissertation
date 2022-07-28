

# Python3 implementation of 
# above approach  
  
# Function to find the value of N  
def findN(k) : 
  
    # handling case for '0'  
    if (k == 0) : 
        ans = 3
  
    # handling case for '1'  
    if (k == 1) : 
        ans = 1
  
    # when number is completely  
    # divided by 4 then minimum 
    # 'x' will be 'k'  
    elif (k % 4 == 0) : 
        ans = k  
  
    # when number divided by 4  
    # gives 3 as remainder then 
    # minimum 'x' will be 'k-1'  
    elif (k % 4 == 3) : 
        ans = k - 1
  
    # else it is not possible to   
    # get k for any value of x  
    else: 
        ans = -1
  
    return ans  
  
# Driver code  
  
# let the given number be 7  
k = 7
  
res = findN(k)  
if (res == -1):  
    print("Not possible")  
else: 
    print(res) 
  
# This code is contributed 
# by Smitha 

