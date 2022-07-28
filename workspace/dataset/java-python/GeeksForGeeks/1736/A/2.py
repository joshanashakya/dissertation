

# Python3 implementation find the minimum 
# difference in the number D such that 
# D is inside of every range 
  
# Function to find the minimum 
# difference in the number D such that 
# D is inside of every range 
def findMinimumOperation(n, d,arrays): 
    cnt = 0
    first = -10**9
    end = 10**9
  
    # Loop to find the common range out 
    # of the given array of ranges. 
    while (n): 
  
        # Storing the start and end index 
        arr = [arrays[cnt][0],arrays[cnt][1]] 
  
        # Sorting the range 
        arr = sorted(arr) 
  
        # Finding the maximum starting 
        # value of common segment 
        first = max(first, arr[0]) 
  
        # Finding the minimum ending 
        # value of common segment 
        end = min(end, arr[1]) 
        cnt += 1
        n -= 1
  
    # If there is no common segment 
    if (first > end): 
        print("-1",end="") 
  
    else: 
  
        # If the given number is between 
        # the computed common range. 
        if (d >= first and d <= end): 
            print("0",end="") 
  
        # Finding the minimum distance 
        else: 
            print(min(abs(first - d),abs(d - end)),end="") 
  
# Driver Code 
if __name__ == '__main__': 
    n = 3
    d = 3
  
    # Given array of ranges 
    arrays=[[0, 7], 
            [2, 14], 
            [4, 6] ] 
  
    findMinimumOperation(n, d, arrays) 
  
# This code is contributed by mohit kumar 29     

