

# Python program to make an array decreasing 
  
# Function to count minimum no of operation 
def min_noOf_operation(arr, n, k): 
  
    res = 0
    for i in range(1,n): 
        noOfSubtraction = 0
  
        if (arr[i] > arr[i - 1]): 
  
            # Count how many times we have to subtract. 
            noOfSubtraction = (arr[i] - arr[i - 1]) / k; 
  
            # Check an additional subtraction is  
            # required or not. 
            if ((arr[i] - arr[i - 1]) % k != 0): 
                noOfSubtraction+=1
  
            # Modify the value of arr[i]. 
            arr[i] = arr[i] - k * noOfSubtraction 
          
  
        # Count total no of operation/subtraction . 
        res = res + noOfSubtraction 
      
  
    return int(res) 
  
  
# Driver Code 
arr = [ 1, 1, 2, 3 ] 
N = len(arr) 
k = 5
print(min_noOf_operation(arr, N, k)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

