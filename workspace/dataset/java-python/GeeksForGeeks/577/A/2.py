

# Python 3 program to find 
# the probability of rain  
# on n+1-th day when previous  
# day's data is given  
  
# Function to find the probability  
def rainDayProbability(a, n) : 
  
    # count occurence of 1 
    count = a.count(1) 
  
    # find probability 
    m = count / n 
      
    return m 
  
# Driver code 
if __name__ == "__main__" : 
  
    a = [ 1, 0, 1, 0, 1, 1, 1, 1] 
    n = len(a) 
  
    # function calling 
    print(rainDayProbability(a, n)) 
  
# This code is contributed 
# by ANKITRAI1 

