

# Python 3 program to find the smallest 
# positive missing number 
  
# Function to find the smallest 
# positive missing number 
def findMissingPositive(arr, n): 
      
    # Default smallest Positive Integer 
    m = 1
  
    # Store values in set which are 
    # greater than variable m 
    x = [] 
    for i in range(n): 
          
        # Store value when m is less than 
        # current index of given array 
        if (m < arr[i]): 
            x.append(arr[i]) 
      
        elif (m == arr[i]): 
              
            # Increment m when it is equal 
            # to current element 
            m = m + 1
  
            while (x.count(m)): 
                x.remove(m) 
  
                # Increment m when it is one of the 
                # element of the set 
                m = m + 1
  
    # Return the required answer 
    return m 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, -7, 6, 8, 1, -10, 15] 
  
    n = len(arr) 
  
    # Function call 
    print(findMissingPositive(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

