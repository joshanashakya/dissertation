

# Python3 program to check  
# if any Subarray of size  
# K has a given Sum 
  
# Function to check if 
# any Subarray of size  
# K, has a given Sum 
def checkSubarraySum(arr, n, k, sum): 
      
    # Consider all blocks 
    # starting with i. 
    for i in range (n - k + 1):  
  
        current_sum = 0; 
  
        # Consider each subarray 
        # of size k 
        for j in range(k): 
            current_sum = (current_sum + 
                            arr[i + j]); 
  
        if (current_sum == sum): 
            return True;      
    return False; 
  
# Driver code 
arr = [1, 4, 2, 10, 2, 
          3, 1, 0, 20]; 
k = 4; 
sum = 18; 
  
n = len(arr); 
  
if (checkSubarraySum(arr, n, k, sum)): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed by mits 

