

# Python3 implementation to find 
# N’th stepping natural Number 
  
# Function to find the 
# Nth stepping natural number 
def NthSmallest(K): 
    # Declare the queue 
    Q = [] 
  
    # Enqueue 1, 2, ..., 9 in this order 
    for i in range(1,10): 
        Q.append(i) 
  
    # Perform K operation on queue 
    for i in range(1,K+1): 
        # Get the ith Stepping number 
        x = Q[0] 
  
        # Perform Dequeue from the Queue 
        Q.remove(Q[0]) 
  
        # If x mod 10 is not equal to 0 
        if (x % 10 != 0): 
            # then Enqueue 10x + (x mod 10) - 1 
            Q.append(x * 10 + x % 10 - 1) 
  
        # Enqueue 10x + (x mod 10) 
        Q.append(x * 10 + x % 10) 
  
        # If x mod 10 is not equal to 9 
        if (x % 10 != 9): 
            # then Enqueue 10x + (x mod 10) + 1 
            Q.append(x * 10 + x % 10 + 1) 
  
    # Return the dequeued number of the K-th 
    # operation as the Nth stepping number 
    return x 
  
# Driver Code 
if __name__ == '__main__': 
    # initialise K 
    N = 16
  
    print(NthSmallest(N)) 
  
# This code is contributed by Surendra_Gangwar 

