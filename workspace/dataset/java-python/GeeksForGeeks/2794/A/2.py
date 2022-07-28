

# Python3 program to find smallest  
# value of root of an equation 
# under given constraints. 
import math 
  
# function to check if the sum  
# of digits is equal to the 
# summation assumed 
def check(a, b): 
    c = 0; 
  
    # calculate the 
    # sum of digit 
    while (a != 0): 
        c = c + a % 10; 
        a = int(a / 10); 
  
    return True if(c == b) else False; 
  
# function to find the 
# largest root possible. 
def root(n): 
    found = False; 
      
    # float(1E+18) 
    mx = 1000000000000000001;  
  
    # iterate for all  
    # possible sum of digits. 
    for i in range(91):  
  
        # check if discriminent 
        # is a perfect square. 
        s = i * i + 4 * n; 
        sq = int(math.sqrt(s)); 
  
        # check if discriminent is  
        # a perfect square and 
        # if it as perefect root  
        # of the equation 
        if (sq * sq == s and 
            check(int((sq - i) / 2), i)):  
            found = True; 
            mx = min(mx, int((sq-i) / 2)); 
  
    # function returns answer 
    if (found): 
        return mx; 
    else: 
        return -1; 
  
# Driver Code 
n = 110; 
print(root(n)); 
  
# This code is contributed by mits 

