

# A simple Python 3 program to find  
# index of given Fibonacci number. 
  
def findIndex(n) : 
      
    # if Fibonacci number is less than 2, 
    # its index will be same as number 
    if (n <= 1) : 
        return n 
   
    a = 0
    b = 1
    c = 1
    res = 1
   
    # iterate until generated fibonacci number  
    # is less than given fibonacci number 
    while (c < n) : 
        c = a + b 
           
        # res keeps track of number of   
        # generated fibonacci number 
        res = res + 1
        a = b 
        b = c 
          
    return res 
  
# Driver program to test above function 
result = findIndex(21) 
print(result) 
  
# this code is contributed by Nikita Tiwari 

