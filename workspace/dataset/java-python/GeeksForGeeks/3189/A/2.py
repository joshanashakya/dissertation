

# Python3 code to calculate 
# average of array elements 
  
# Recursively computes average of a[] 
def avgRec( a , i , n ): 
      
    # Last element 
    if i == n-1: 
        return a[i] 
      
    # When index is 0, divide sum 
    # computed so far by n. 
    if i == 0: 
        return ((a[i] + avgRec(a, i+1, n)) / n) 
      
    # Compute sum 
    return (a[i] + avgRec(a, i+1, n)) 
  
# Function that return  
# average of an array. 
def average(a, n): 
    return avgRec(a, 0, n) 
  
# Driver code 
arr = [10, 2, 3, 4, 5, 6, 7, 8, 9] 
n = len(arr) 
print(average(arr, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

