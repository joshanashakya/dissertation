

# Function to check the array for  
# elements in given range  
def check_elements(arr, n, A, B) : 
      
    # Range is the no. of elements  
    # that are to be checked  
    rangeV = B - A  
      
    # Traversing the array  
    for i in range(0, n):  
      
        # If an element is in range  
        if (abs(arr[i]) >= A and 
            abs(arr[i]) <= B) :  
      
            # Negating at index ‘element – A’  
            z = abs(arr[i]) - A  
            if (arr[z] > 0) :  
                arr[z] = arr[z] * -1
              
    # Checking whether elements in  
    # range 0-range are negative  
    count = 0
    for i in range(0, rangeV + 1):  
        if i >= n: 
            break
              
        # Element from range is 
        # missing from array 
        if (arr[i] > 0):  
            return False
        else: 
            count = count + 1
      
    if(count != (rangeV + 1)):  
        return False
          
    # All range elements are present  
    return True
  
# Driver code  
  
# Defining Array and size  
arr = [ 1, 4, 5, 2, 7, 8, 3 ]  
n = len(arr)  
      
# A is lower limit and B is  
# the upper limit of range  
A = 2
B = 5
      
# True denotes all elements  
# were present  
if (check_elements(arr, n, A, B)) : 
    print("Yes")  
      
# False denotes any element  
# was not present  
else: 
    print("No")  
  
# This code is contributed  
# by Yatin Gupta 

