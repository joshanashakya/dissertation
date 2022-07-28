

# Python3 code to find minimum number of 
# elements such that their sum is greater 
# than sum of remaining elements of the array. 
  
# function to find minimum elements needed. 
def minElements(arr , n): 
  
    # calculating HALF of array sum 
    halfSum = 0
    for i in range(n): 
        halfSum = halfSum + arr[i] 
      
    halfSum = int(halfSum / 2) 
      
    # sort the array in descending order. 
    arr.sort(reverse = True) 
      
    res = 0
    curr_sum = 0
    for i in range(n): 
          
        curr_sum += arr[i] 
        res += 1
  
        # current sum greater than sum 
        if curr_sum > halfSum: 
            return res 
      
    return res 
      
# driver code 
arr = [3, 1, 7, 1] 
n = len(arr) 
print(minElements(arr, n) ) 
  
# This code is contributed by "Sharad_Bhardwaj". 

