

# Python3 implementation of above approach 
  
# This function counts number of pairs  
# (x, y) that satisfy 
# the inequality x*x + y*y < n. 
def countSolutions(n): 
  
    res = 0
    x = 0
    while(x * x < n): 
        y = 0
        while(x * x + y * y < n): 
            res = res + 1
            y = y + 1
        x = x + 1
  
    return res 
  
# Driver program to test above function 
if __name__=='__main__': 
    print("Total Number of distinct Non-Negative pairs is ",  
         countSolutions(6)) 
  
# This code is contributed by 
# Sanjit_Prasad 

