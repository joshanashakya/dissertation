

# python program to count subarrays 
# having sum less than k. 
  
# Function to find number of subarrays  
# having sum less than k. 
def countSubarray(arr, n, k): 
    count = 0
  
    for i in range(0, n): 
        sum = 0; 
        for j in range(i, n): 
              
            # If sum is less than k 
            # then update sum and  
            # increment count 
            if (sum + arr[j] < k): 
                sum = arr[j] + sum
                count+= 1
            else: 
                break
    return count; 
  
  
# Driver Code 
array = [1, 11, 2, 3, 15] 
k = 10
size = len(array) 
count = countSubarray(array, size, k); 
print(count) 
  
# This code is contributed by Sam007 

