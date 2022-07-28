

# Python 3 implementation  
# of above approach 
  
# Function to find the number of 
# solutions of n = n xor x 
def numberOfSolutions(n): 
  
    # Counter to store the number 
    # of solutions found 
    c = 0
  
    for x in range(n + 1): 
        if (n ==( x +( n ^ x))): 
            c += 1
  
    return c 
  
# Driver code 
if __name__ == "__main__": 
    n = 3
    print(numberOfSolutions(n)) 
  
# This code is contributed  
# by ChitraNayal 

