

# Python3 code to find  
# Largest number in  
# [2, 3, .. n] which is  
# co-prime with  
# numbers in [2, 3, .. m] 
import math 
  
# Returns true if i is  
# co-prime with numbers  
# in set [2, 3, ... m] 
def isValid(i,m) : 
      
    # Running the loop  
    # till square root of n  
    # to reduce the time  
    # complexity from n 
    sq_i = math.sqrt(i) 
  
    # Find the minimum of  
    # square root of n 
    # and m to run the loop 
    # until the smaller  
    # one 
    sq = min(m, sq_i) 
  
    # Check from 2 to 
    # min(m, sqrt(n)) 
    for j in range(2, sq + 1) : 
        if (i % j == 0) : 
            return False
      
    return True
  
# def to find the  
# largest number less  
# than n which is Co-prime   
# with all numbers from  
# 2 to m 
def findLargestNum(n, m) : 
      
    # Iterating from n to m+1 
    # to find the number 
    for i in range(n, m, -1) : 
  
        # checking every number for  
        # the given conditions 
        if (isValid(i, m)) : 
          
            # The first number 
            # which satisfy the  
            # conditions is the 
            # answer 
            print ("{}\n".format(i)); 
            return
  
    # If there is no number  
    # which satisfy the  
    # conditions, then print 
    # number does not exist. 
    print ("Number Doesn't Exists\n") 
  
# Driver Code 
n = 16
m = 3
findLargestNum(n, m) 
      
# This code is contributed by  
# Manish Shaw(manishshaw1) 

