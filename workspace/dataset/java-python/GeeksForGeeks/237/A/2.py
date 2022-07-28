

# Python program to find an element which divides 
# the array in two sub-arrays with equal product. 
  
# Function to compute partition 
def findElement(arr, size): 
  
    right_mul = 1; 
    left_mul = 1; 
  
    # Computing right_sum 
    for i in range(1,size): 
        right_mul = right_mul *arr[i]; 
    # Checking the point of partition 
    # i.e. left_Sum == right_sum 
    for i, j in zip(range(0,size), range(1, size, 1)):     
        right_mul =right_mul / arr[j]; 
        left_mul = left_mul * arr[i]; 
  
        if (left_mul == right_mul): 
            return arr[i + 1]; 
      
  
    return -1; 
  
# Driver Code 
  
arr = [ 2, 3, 4, 1, 4, 6,]; 
size = len(arr) ; 
print(findElement(arr, size)); 
      
#This code is contributed by Shivi_Aggarwal 

