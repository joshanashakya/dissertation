

# Python3 implementation to find the 
# Largest element before every element 
# of an array such that 
# it is less than the element 
  
# Function to find the 
# Largest element before 
# every element of an array 
def findMaximumBefore(arr, n): 
  
    # Loop to iterate over every 
    # element of the array 
    for i in range(n): 
  
        currAns = -1
  
        # Loop to find the maximum smallest 
        # number before the element arr[i] 
        for j in range(i-1,-1,-1): 
            if (arr[j] > currAns and
                arr[j] < arr[i]): 
                currAns = arr[j] 
  
        print(currAns,end=" ") 
  
# Driver Code 
if __name__ == '__main__': 
  
    arr=[4, 7, 6, 8, 5 ] 
  
    n = len(arr) 
  
    # Function Call 
    findMaximumBefore(arr, n) 
  
# This code is contributed by mohit kumar 29 

