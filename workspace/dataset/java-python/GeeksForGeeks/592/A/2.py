

# Python 3 implementation of the approach  
  
# Function to return the count  
# of unvisited indices starting  
# from the index 0  
def countUnvisited(n, m): 
      
    # Largest index that  
    # cannot be visited  
    i = 0
    X = (m * n) - m - n 
  
    # Push the index to the queue  
    queue = [] 
  
    queue.append(X) 
  
    # To store the required count  
    count = 0
    while (len(queue) > 0): 
          
        # Current index that cannot be visited  
        curr = queue[0]  
        queue.remove(queue[0]) 
  
        # Increment the count for  
        # the current index  
        count += 1
  
        # (curr - m) and (curr - n) are also  
        # unreachable if they are valid indices  
        if (curr - m > 0): 
            queue.append(curr - m)  
        if (curr - n > 0): 
            queue.append(curr - n)  
  
    # Return the required count  
    return count 
  
# Driver code  
if __name__ == '__main__': 
    n = 2
    m = 5
  
    print(countUnvisited(n, m)) 
      
# This code is contributed by Surendra_Gangwar 

