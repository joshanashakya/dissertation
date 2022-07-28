

# Python3 program to print 
# Number of odd/even results  
# for every value of x in  
# range [min, end] after  
# performing N steps 
  
# Function that prints  
# the number of odd  
# and even results 
def count_even_odd(min, max, steps): 
   
    # If constant at layer i 
    # is even, beven is True, 
    # otherwise False. If  
    # the coefficient of x at 
    # layer i is even, aeven  
    # is True, otherwise False. 
    beven = True
    aeven = False
    n = 2
    for i in range(0, n) : 
        a = steps[i][0] 
        b = steps[i][1] 
   
        # If any of the coefficients 
        # at any layer is found to 
        # be even, then the product  
        # of all the coefficients  
        # will always be even. 
        if (not(aeven or a & 1)): 
            aeven = True
   
        # Checking whether the 
        # constant added after all 
        # layers is even or odd. 
        if (beven) : 
            if (b & 1): 
                beven = False
           
        elif (not(a & 1)) : 
            if (not(b & 1)): 
                beven = True
           
        else : 
            if (b & 1): 
                beven = True
           
    # Counting the number 
    # of even and odd. 
   
    # Assuming input x is even. 
    if (beven):  
        even = (int(max / 2) - 
                int((min - 1) / 2)) 
        odd = 0
       
    else : 
        even = (int(max / 2) -
                int((min - 1) / 2)) 
        odd = 0
   
    # Assuming input x is odd. 
    if (not(beven ^ aeven)): 
        even += (max - min + 1 - 
             int(max / 2) + int((min - 1) / 2)) 
    else: 
        odd += (max - min + 1 - 
            int(max / 2) + int((min - 1) / 2)) 
   
    # Displaying the counts. 
    print("even = " , even ,  
          ", odd = " , odd, sep = "") 
   
# Driver Code 
min = 1
max = 4
steps = [[1, 2],[3, 4]]  
count_even_odd(min, max, steps) 
  
# This code is contributed  
# by Smitha 

