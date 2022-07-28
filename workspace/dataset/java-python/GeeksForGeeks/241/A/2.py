

# python program to 
# count subarrays with 
# same sum and product. 
  
# returns required 
# number of subarrays 
def numOfsubarrays(arr,n): 
  
    count = 0 # Initialize result 
   
    # checking each subarray 
    for i in range(n): 
      
        product = arr[i] 
        sum = arr[i] 
        for j in range(i+1,n): 
          
            # checking if product is equal 
            # to sum or not 
            if (product==sum): 
                count+=1
   
            product *= arr[j] 
            sum += arr[j] 
          
   
        if (product==sum): 
            count+=1
      
    return count 
  
# Driver code 
  
arr = [1,3,2] 
n =len(arr) 
print(numOfsubarrays(arr , n)) 
  
# This code is contributed 
# by Anant Agarwal. 

