

# Python 3 program to find the Nth term  
# of the series 14, 28, 20, 40, ….. 
  
# Function to find the N-th term 
def findNth(N):  
      
    # initializing the 1st number 
    b = 14
  
    # loop from 2nd term to nth term 
    for i in range (2, N + 1): 
      
        # if i is even, double the 
        # previous number 
        if (i % 2 == 0): 
            b = b * 2
              
        # if i is odd, subtract 8 from 
        # previous number 
        else: 
            b = b - 8
  
    return b 
  
# Driver Code 
N = 6
  
print(findNth(N)) 
  
# This code is contributed 
# by Akanksha Rai 

