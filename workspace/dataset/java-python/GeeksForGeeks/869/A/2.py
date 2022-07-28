

# Python3 code to check if a number 
# can be expressed as sum of five  
# consecutive integers. 
   
# function to check if a number  
# can be expressed as sum of five 
# consecutive integer. 
def checksum(n): 
   
    # if n is 0 
    if n == 0: 
        print("-2 -1 0 1 2") 
        return 0
           
    inc = 0
   
    # if n is positive, 
    # increment loop by 1. 
    if n > 0: 
        inc = 1
       
    # if n is negative, 
    # decrement loop by 1. 
    else: 
        inc = -1
       
    # Running loop from 0 to n - 4 
    for i in range(0, n-3, inc): 
       
        # check if sum of five consecutive 
        # integer is equal to n. 
        if i + i + 1 + i + 2 + i + 3 + i + 4 == n: 
            print(i, " ", i + 1, " ", i + 2, " ", i + 3, " ", i + 4) 
            return 0
               
    print("-1") 
       
# Driver Code  
n = 15
checksum(n) 

