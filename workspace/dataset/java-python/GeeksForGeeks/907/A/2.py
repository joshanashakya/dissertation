

# Python3 code to check if a number 
# can be written as sum of three  
# consecutive integers. 
  
# function to check if a number  
# can be written as sum of three 
# consecutive integer. 
def checksum(n): 
  
    # if n is 0 
    if n == 0: 
        print("-1 0 1") 
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
      
    # Running loop from 0 to n - 2 
    for i in range(0, n-1, inc): 
      
        # check if sum of three consecutive 
        # integer is equal to n. 
        if i + i + 1 + i + 2 == n: 
            print(i ," ",i + 1, " ", i + 2) 
            return 0
              
    print("-1") 
      
# Driver Code  
n = 6
checksum(n) 
  
# This code is contributed by "Sharad_Bhardwaj". 

