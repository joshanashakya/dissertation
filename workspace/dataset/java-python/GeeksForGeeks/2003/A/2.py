

# Python 3 program to find x such  
# that a % x is equal to b. 
  
import math 
def modularEquation(a, b) : 
      
    # if a is less than b then no solution 
    if (a < b) : 
        print("No solution possible ")  
        return 
      
    # if a is equal to b then every number 
    # greater than a will be the solution 
    # so its infinity 
    if (a == b) : 
        print("Infinite Solution possible ") 
        return
      
    # all resultant number should be  
    # greater than b and (a-b) should  
    # be divisible by resultant number 
   
    # count variable store the number  
    # of values possible 
    count = 0
    n = a - b 
    y = (int)(math.sqrt(a - b)) 
    for i in range(1, y+1) : 
        if (n % i == 0) : 
              
            # checking for both divisor  
            # and quotient whether they 
            # divide ( a-b ) completely 
            # and greater than b . 
            if (n / i > b) : 
                count = count + 1
            if (i > b) : 
                count = count  + 1
          
          
   
    # Here y is added twice in the  
    # last iteration so 1 y should be 
    # decremented to get correct 
    # solution 
    if (y * y == n and y > b) : 
        count = count - 1
   
    print (count) 
   
# Driver code 
a = 21
b = 5
modularEquation(a, b) 
  
# This code is contributed by Nikita Tiwari. 

