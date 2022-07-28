

# Python 3 program to find  
# the number of values of b 
# such that a = b + (a^b) 
  
# function to return the  
# number of solutions 
def countSolutions(a): 
  
    count = 0
  
    # check for every possible value 
    for i in range(a + 1): 
        if (a == (i + (a ^ i))): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
    a = 3
    print(countSolutions(a)) 
  
# This code is contributed 
# by ChitraNayal 

