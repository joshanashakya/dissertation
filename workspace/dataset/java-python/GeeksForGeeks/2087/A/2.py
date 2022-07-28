

# Python3 implementation of the above approach 
  
# Function to return the largest sum 
def largest_sum(arr, n): 
      
    # Variable to store the largest sum 
    maximum = -1
  
    # Map to store the frequencies 
    # of each element 
    m = dict() 
  
    # Store the Frequencies 
    for i in arr: 
        m[i] = m.get(i,0) + 1
  
    # Loop to combine duplicate elements 
    # and update the sum in the map 
    for j in list(m): 
  
        # If j is a duplicate element 
        if ((j in m) and m[j] > 1): 
  
            # Update the frequency of 2*j 
            x, y = 0, 0
            if 2*j in m: 
                m[2*j] = m[2 * j]+ m[j]// 2
            else: 
                m[2*j] = m[j]//2
  
            # If the new sum is greater than 
            # maximum value, Update the maximum 
            if (2 * j > maximum): 
                maximum = 2 * j 
  
    # Returns the largest sum 
    return maximum 
  
# Driver Code 
if __name__ == '__main__': 
    arr= [1, 1, 2, 4, 7, 8] 
    n = len(arr) 
  
    # Function Calling 
    print(largest_sum(arr, n)) 
  
# This code is contributed by mohit kumar 29     

