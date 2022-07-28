

# Python3 program to find the maximum possible 
# value of last element of the array 
  
# Function to find the maximum possible 
# value of last element of the array 
def maxValue(arr, n, moves): 
  
    # Traverse for all element 
    for i in range(n - 2, -1, -1): 
        if (arr[i] > 0): 
              
            # Find the distance 
            distance = n - 1 - i 
  
            # If moves less than distance then 
            # we can not move this number to end 
            if (moves < distance): 
                break
  
            # How many number we can move to end 
            can_take = moves // distance 
  
            # Take the minimum of both of them 
            take = min(arr[i], can_take) 
  
            # Increment in the end 
            arr[n - 1] += take 
  
            # Remove taken moves 
            moves -= take * distance 
  
    # Return the last element 
    return arr[n - 1] 
  
# Driver code 
if __name__ == '__main__': 
    arr= [2, 3, 0, 1] 
    M = 5
    N = len(arr) 
  
    # Function call 
    print(maxValue(arr, N, M)) 
      
# This code is contributed by mohit kumar 29 

