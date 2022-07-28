

# Python 3 Program to find an element  
# such that sum of right side element  
# is equal to sum of left side 
  
# Function to compute partition 
def findElement(arr, size) : 
  
    right_sum, left_sum = 0, 0
  
    # Computing right_sum 
    for i in range(1, size) : 
        right_sum += arr[i] 
  
    i, j = 0, 1
  
    # Checking the point of partition  
    # i.e. left_Sum == right_sum  
    while j < size : 
        right_sum -= arr[j] 
        left_sum += arr[i] 
  
        if left_sum == right_sum : 
            return arr[i + 1] 
  
        j += 1
        i += 1
  
    return -1
  
# Driver Code 
if __name__ == "__main__" : 
      
    arr = [ 2, 3, 4, 1, 4, 5] 
    n = len(arr) 
    print(findElement(arr, n)) 
  
# This code is contributed by ANKITRAI1 

