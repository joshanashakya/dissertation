

# Python3 code to find sum of k-th group  
# of positive odd integers. 
  
# Return the sum of k-th group of  
# positive odd integers. 
def kthgroupsum( k ): 
      
    # Finding first element of kth group. 
    cur = int((k * (k - 1)) + 1) 
    sum = 0
      
    # Finding the sum. 
    while k: 
        sum += cur 
        cur += 2
        k=k-1
      
    return sum
      
# Driver code 
k = 3
print(kthgroupsum(k)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

