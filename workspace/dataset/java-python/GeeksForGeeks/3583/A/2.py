

# Python 3 program to count maximum 
# contiguous even numbers 
  
# Function to count maximum 
# contiguous even numbers 
def countMaxContiguous(arr, n): 
  
    current_max = 0
    max_so_far = 0
  
    for i in range(n) : 
  
        # If current element is not 
        # even reset current_max 
        if (arr[i] % 2 != 0): 
            current_max = 0
  
        # If even element is found, 
        # increment current_max and  
        # update result if count  
        # becomes more 
        else : 
            current_max += 1 # increase count 
            max_so_far = max(current_max,  
                             max_so_far) 
  
    return max_so_far 
  
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 1, 0, 2, 4, 3, 8, 9 ] 
  
    n = len(arr) 
  
    print(countMaxContiguous(arr, n)) 
  
# This code is contributed 
# by ChitraNayal 

