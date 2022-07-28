

# Python3 program to compute  
# sum of subarray elements 
  
# Computes sum all sub-array 
def SubArraySum(arr, n): 
    temp,result = 0,0
  
    # Pick starting point 
    for i in range(0, n): 
  
        # Pick ending point 
        temp=0; 
        for j in range(i, n): 
  
            # sum subarray between  
            # current starting and  
            # ending points 
            temp+=arr[j] 
            result += temp  
    return result  
  
# driver program  
arr = [1, 2, 3] 
n = len(arr) 
print ("Sum of SubArray :" 
       ,SubArraySum(arr, n)) 
  
# This code is contributed by  
# TheGameOf256. 

