

# Python3 program for maximum possible product 
# with given array of numbers 
  
# Function that prints operations  
# in each step 
def MaximumProduct(a, n): 
    cntneg = 0
    cntzero = 0
      
    used = [0] * n 
    pos = -1
  
    # count number of zeros and  
    # negative numbers 
    for i in range(n): 
        if (a[i] == 0) : 
            used[i] = 1
            cntzero += 1
          
        if (a[i] < 0): 
            cntneg += 1
              
            # To get negative number which  
            # is nearest to zero, that is maximum  
            # negative number  
            if (pos == -1 or abs(a[pos]) > abs(a[i])): 
                pos = i 
      
    # if number of negative number are odd then 
    # remove negative number at position pos 
    if (cntneg % 2 == 1): 
        used[pos] = 1
  
    # initial condition 
    if (cntzero == n or (cntzero == n - 1 and
                         cntneg == 1)): 
        for i in range(n - 1): 
            print (1, " ", i + 1, " ", i + 2) 
        return
  
    lst = -1
    for i in range(n) : 
        if (used[i]) : 
            if (lst != -1): 
                print (1, " ", lst + 1, " ", i + 1) 
            lst = i 
      
    # perform second type operation 
    if (lst != -1): 
        print (2, " ", lst + 1) 
  
    lst = -1
      
    # for reamining numbers 
    for i in range( n) : 
          
        # if it is not removed yet 
        if (not used[i]) : 
            if (lst != -1): 
                print (1, " ", lst + 1, " ", i + 1) 
            lst = i 
      
# Driver code 
if __name__ == "__main__": 
    a = [ 5, -2, 0, 1, -3 ] 
  
    n = len(a) 
  
    MaximumProduct(a, n) 
  
# This code is contributed by ita_c 

