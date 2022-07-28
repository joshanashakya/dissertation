

# Python3 program to find the Minimum size Subarray  
# with maximum sum in non-increasing order  
  
# Function to find the Minimum size Subarray  
def minSet(nums) : 
  
    A = [] 
  
    # sort numbers in descending order  
    nums.sort() 
  
    # get total sum of the given array.  
    sum = 0
    for i in range(0,len(nums)):  
        sum += nums[i] 
  
    temp = 0
  
    # Loop until the sum of numbers  
    # is greater than sum/2  
    for i in range(len(nums)-1, -1, -1): 
        if(temp > sum / 2): 
            break
        A.append(nums[i]) 
        temp += nums[i] 
  
    # Print the Minimum size Subarray  
    for i in range(0, len(A)): 
        print(A[i], end = ' ') 
  
# Driver code  
vec = [ 7, 6, 13, 13, 12, 11 ] 
  
minSet(vec);  
  
# This code is contributed by Sanjit_Prasad 

