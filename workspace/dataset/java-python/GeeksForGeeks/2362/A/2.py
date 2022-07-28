

# Python3 implementation to count  
# subarrays with equal number  
# of 1's and 0's 
  
# function to count subarrays with 
# equal number of 1's and 0's 
def countSubarrWithEqualZeroAndOne (arr, n): 
  
    # 'um' implemented as hash table  
    # to store frequency of values 
    # obtained through cumulative sum 
    um = dict() 
    curr_sum = 0
      
    # Traverse original array and compute  
    # cumulative sum and increase count 
    # by 1 for this sum in 'um'. 
    # Adds '-1' when arr[i] == 0 
    for i in range(n): 
        curr_sum += (-1 if (arr[i] == 0) else arr[i]) 
        if um.get(curr_sum): 
            um[curr_sum]+=1
        else: 
            um[curr_sum]=1
      
    count = 0
      
    # traverse the hash table 'um' 
    for itr in um: 
          
        # If there are more than one  
        # prefix subarrays with a  
        # particular sum 
        if um[itr] > 1: 
            count += ((um[itr] * int(um[itr] - 1)) / 2) 
      
    # add the subarrays starting from  
    # 1st element and have equal  
    # number of 1's and 0's 
    if um.get(0): 
        count += um[0] 
      
    # required count of subarrays 
    return int(count) 
      
# Driver code to test above 
arr = [ 1, 0, 0, 1, 0, 1, 1 ] 
n = len(arr)  
print("Count =", 
    countSubarrWithEqualZeroAndOne(arr, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

