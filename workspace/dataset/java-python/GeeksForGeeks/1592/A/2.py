

# Python 3 program for finding  
# the Special Factorial Number  
  
# function for calculating factoial  
def fact( n): 
    num = 1
    for i in range(1, n + 1): 
        num = num * i 
    return num 
  
# function for check Special_Factorial_Number  
def Special_Factorial_Number(k): 
      
    for i in range(1, k + 1): 
          
        # call fact function and the  
        # Modulo with k and check  
        # if condition is TRUE then return i  
        if (fact(i) % k == 0): 
            return i 
    return 0
  
# Driver Code 
if __name__ == '__main__': 
      
    # taking input  
    k = 16
    print(Special_Factorial_Number(k)) 
  
# This code is contributed by Rajput-Ji 

