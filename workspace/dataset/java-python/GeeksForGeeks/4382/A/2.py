

# Python3 program to Find values of a, in equation  
# (a+b)<=n and a+b is divisible by x.  
  
# function to Find values of a, in equation  
# (a+b)<=n and a+b is divisible by x.  
def PossibleValues(b, x, n) : 
  
    # least possible which is divisible by x  
    leastdivisible = int(b / x + 1) * x  
  
    flag = 1
  
    # run a loop to get required answer  
    while (leastdivisible <= n) :  
  
        if (leastdivisible - b >= 1) :  
            print(leastdivisible - b ,end= " ")  
  
            # increase value by x  
            leastdivisible += x  
  
            # answer is possible  
            flag = 0
          
        else : 
            break
      
  
    if (flag != 0) : 
        print(-1)  
  
# Driver code  
if __name__=='__main__': 
    b = 10
    x = 6
    n = 40
# function call  
    PossibleValues(b, x, n)  
  
# This code is contributed by 
# Smitha Dinesh Semwal 

