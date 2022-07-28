

# Python3 implementation of above approach 
  
# function to find longest sub-array 
# whose elements gives same remainder 
#  when divided with K 
  
def LongestSubarray(arr,n,k): 
    count = 1
    max_lenght = 1
    prev_mod = arr[0]%k 
  
    # Iterate in the array 
    for i in range(1,n): 
        curr_mod = arr[i]%k 
  
       #  check if array element  
       # greater then X or not  
        if curr_mod==prev_mod: 
            count+=1
        else: 
            max_lenght = max(max_lenght,count) 
            count=1
            prev_mod = curr_mod 
  
  
    return max_lenght 
  
# Driver code 
arr = [4, 9, 7, 18, 29, 11] 
n = len(arr) 
k =11
print(LongestSubarray(arr,n,k)) 
  
  
  
# This code is contributed by Shrikant13 

