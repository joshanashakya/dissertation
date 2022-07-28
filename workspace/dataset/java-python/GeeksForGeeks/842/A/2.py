

# Python3 implementation of  
# above approach  
  
# Function to calculate the time  
def Time(arr, n, Emptypipe) : 
  
    fill = 0
    for i in range(0,n) : 
        fill += (1 / arr[i])  
  
    fill = fill - (1 / float(Emptypipe))  
  
    return int(1 / fill)  
  
  
# Driver Code  
if __name__=='__main__': 
    arr = [ 12, 14 ]  
    Emptypipe = 30
    n = len(arr)  
    print((Time(arr, n, Emptypipe))  
          , "Hours") 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

