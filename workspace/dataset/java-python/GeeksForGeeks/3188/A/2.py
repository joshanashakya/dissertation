

# Python3 code to calculate  
# average of array elements 
  
# Function that return  
# average of an array. 
def average( a , n ): 
  
    # Find sum of array element 
    sum = 0
    for i in range(n): 
        sum += a[i] 
      
    return sum/n; 
  
# Driver code 
arr = [10, 2, 3, 4, 5, 6, 7, 8, 9] 
n = len(arr) 
print(average(arr, n)) 
  
# This code is contrbuted by "Shard_Bhardwaj". 

