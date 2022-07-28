

# Python3 implementation to find the 
# minimum number of operations in 
# which the array A can be converted 
# to another array B 
  
# Function to find the minimum 
# number of operations in which 
# array A can be converted to array B 
def checkArray(a, b, n) : 
  
    operations = 0; 
    i = 0; 
      
    # Loop to iterate over the array 
    while (i < n) : 
          
        # if both elements are equal 
        # then move to next element 
        if (a[i] - b[i] == 0) : 
            i += 1; 
            continue; 
  
        # Calculate the difference 
        # between two elements 
        diff = a[i] - b[i]; 
        i += 1; 
  
        # loop while the next pair of 
        # elements have same difference 
        while (i < n and a[i] - b[i] == diff) : 
            i += 1; 
  
        # Increase the number of 
        # operations by 1 
        operations += 1; 
      
    # Print the number of 
    # operations required 
    print(operations); 
  
# Driver Code 
if __name__ == "__main__" : 
  
    a = [ 3, 7, 1, 4, 1, 2 ]; 
    b = [ 3, 7, 3, 6, 3, 2 ]; 
    size = len(a); 
  
    checkArray(a, b, size); 
  
# This code is contributed by AnkitRai01 

