

# Python3 program for the above approach 
  
# Function to find the summ of series 
def printSeriessumm(N): 
    summ = 0
      
    for i in range(1,N+1): 
          
        # Generate the ith term and 
        # add it to the summ 
        summ += pow(i, i - 1) 
      
    # Prthe summ 
    print(summ) 
      
# Driver Code 
  
N = 5
printSeriessumm(N) 
  
# This code is contributed by shubhamsingh10 

