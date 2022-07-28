

# python program for above implementation 
  
# Function to count numbers to be added 
def countNum(arr, n):  
      
    count = 0
  
    # Sort the array 
    arr.sort() 
  
    # Check if elements are consecutive 
    # or not. If not, update count 
    for i in range(0, n-1): 
        if (arr[i] != arr[i+1] and
            arr[i] != arr[i + 1] - 1): 
            count += arr[i + 1] - arr[i] - 1; 
  
    return count 
  
# Drivers code 
arr = [ 3, 5, 8, 6 ] 
n = len(arr) 
print(countNum(arr, n)) 
  
# This code is contributed by Sam007 

