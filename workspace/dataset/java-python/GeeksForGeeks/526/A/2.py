

# Python program to 
# calculate minimum 
# product of a pair 
  
# Function to calculate 
# minimum product 
# of pair 
def printMinimumProduct(arr,n): 
  
    # Initialize first and second 
    # minimums. It is assumed that the 
    # array has at least two elements. 
    first_min = min(arr[0], arr[1]) 
    second_min = max(arr[0], arr[1]) 
   
    # Traverse remaining array and keep 
    # track of two minimum elements (Note 
    # that the two minimum elements may 
    # be same if minimum element appears 
    # more than once) 
    # more than once) 
    for i in range(2,n): 
      
         if (arr[i] < first_min): 
         
            second_min = first_min 
            first_min = arr[i] 
         
         elif (arr[i] < second_min): 
            second_min = arr[i] 
      
    return first_min * second_min 
  
# Driver code 
  
a= [ 11, 8 , 5 , 7 , 5 , 100 ] 
n = len(a) 
  
print(printMinimumProduct(a,n)) 
  
# This code is contributed 
# by Anant Agarwal. 

