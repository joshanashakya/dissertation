

# Python implementation of the approach 
def maxSum(arr, n): 
    # To store sum 
    s = 0
  
    # To store ending indices  
    # of the chosen prefix arrays 
    l = [] 
    for i in range(len(a)): 
  
        # Adding the absolute  
        # value of a[i] 
        s += abs(a[i]) 
        if (a[i] >= 0): 
            continue
  
        # If i == 0 then there is  
        # no index to be flipped  
        # in (i-1) position 
        if (i == 0): 
            l.append(i + 1) 
        else: 
            l.append(i + 1) 
            l.append(i) 
  
    # print the  
    # maximised sum 
    print(s) 
  
    # print the ending indices  
    # of the chosen prefix arrays 
    print(*l) 
      
n = 4
a = [1, -2, -3, 4] 
maxSum(a, n) 

