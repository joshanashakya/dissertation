

# Python program to find 
# maximum value (arr[i]-i) 
# - (arr[j]-j) in an array. 
  
# Returns maximum value of 
# (arr[i]-i) - (arr[j]-j) 
def findMaxDiff(arr,n): 
  
    if (n < 2): 
      
        print("Invalid ") 
        return 0
      
   
    # Use two nested loops 
    # to find the result 
    res = -2147483648
    for i in range(n): 
        for j in range(n): 
            if ( res < (arr[i]-arr[j]-i+j) ): 
                res = (arr[i]-arr[j]-i+j) 
   
    return res 
  
# Driver code 
  
arr= [9, 15, 4, 12, 13] 
n = len(arr) 
  
print(findMaxDiff(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

