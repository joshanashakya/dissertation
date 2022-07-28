

# Python3 program for the above series 
  
# Function to find the sum of series 
def printSeriesSum(N) : 
  
    sum = 0; 
  
    a = 1; 
    cnt = 0; 
  
    # Flag to find the multiplicating 
    # factor.. i.e, by 2 or 3/2 
    flag = True; 
  
    # First term 
    sum += a; 
  
    while (cnt < N) : 
  
        nextElement = None; 
  
        # If flag is true, multiply by 2 
        if (flag) : 
            nextElement = a * 2; 
            sum += nextElement; 
            flag = not flag; 
  
        # If flag is false, multiply by 3/2 
        else : 
            nextElement = a * (3 / 2); 
            sum += nextElement; 
            flag = not flag; 
  
        # Update the previous element 
        # to nextElement 
        a = nextElement; 
        cnt += 1
  
    # Print the sum 
    print(sum); 
  
# Driver Code 
if __name__ == "__main__" : 
  
  
    N = 8; 
  
    printSeriesSum(N); 
      
    # This code is contributed by AnkitRai01 

