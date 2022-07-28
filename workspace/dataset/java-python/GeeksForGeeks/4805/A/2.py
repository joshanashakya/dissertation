

# Python3 program to find Maximum modulo value  
  
def maxModValue(arr, n):  
  
    ans = 0
      
    # Sort the array[] by using inbuilt 
    # sort function  
    arr = sorted(arr)  
  
    for j in range(n - 2, -1, -1):  
          
        # Break loop if answer is greater or equals to  
        # the arr[j] as any number modulo with arr[j]  
        # can only give maximum value up-to arr[j]-1  
        if (ans >= arr[j]): 
            break
  
        # If both elements are same then skip the next  
        # loop as it would be worthless to repeat the  
        # rest process for same value  
        if (arr[j] == arr[j + 1]) : 
            continue
        i = 2 * arr[j] 
        while(i <= arr[n - 1] + arr[j]): 
              
            # Fetch the index which is greater than or  
            # equals to arr[i] by using binary search  
            # inbuilt lower_bound() function of C++  
            ind = 0
            for k in arr: 
                if k >= i: 
                    ind = arr.index(k) 
  
            # Update the answer  
            ans = max(ans, arr[ind - 1] % arr[j]) 
            i += arr[j] 
  
    return ans  
  
# Driver Code 
arr = [3, 4, 5, 9, 11 ] 
n = 5
print(maxModValue(arr, n)) 
  
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

