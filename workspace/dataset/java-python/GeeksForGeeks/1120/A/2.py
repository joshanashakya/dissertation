

# Python3 program to find the array  
# elements using xor of consecutive elements 
  
# Function to find the array elements 
# using XOR of consecutive elements 
  
def getElements(a, arr, n): 
      
    # array to store the original elements 
    elements = [1 for i in range(n + 1)] 
      
    # first elements a i.e elements[0]=a 
    elements[0] = a 
      
    for i in range(n): 
          
        # To get the next elements we have to  
        # calculate xor of previous elements  
        # with given xor of 2 consecutive elements. 
        # e.g. if a^b=k1 so to get b xor a both side. 
        # b = k1^a  
        elements[i + 1] = arr[i] ^ elements[i] 
              
    # Printing the original array elements 
    for i in range(n + 1): 
        print(elements[i], end = " ") 
  
# Driver code 
arr = [13, 2, 6, 1] 
n = len(arr) 
a = 5
getElements(a, arr, n) 
  
# This code is contributed by Mohit Kumar 

