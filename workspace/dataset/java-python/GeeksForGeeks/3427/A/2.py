

# Python3 implementation of the approach 
  
# Function to return the count  
# of minimum coins required 
def findCount(N): 
      
    # To store the required sequence 
    list = [] 
    sum = 0
      
    # Creating list of the sum of all  
    # previous bit values including  
    # that bit value 
    for i in range(0, 20): 
        sum += 2**i 
        list.append(sum) 
          
    for value in list: 
        if(value>N): 
            return (list.index(value) + 1) 
          
# Driver code 
N = 10
print(findCount(N))  

