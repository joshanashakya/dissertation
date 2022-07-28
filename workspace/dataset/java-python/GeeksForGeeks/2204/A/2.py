

# Python3 Program to find the 
# smallest number that divides 
# all numbers in an array 
  
# Function to find the smallest element 
def min_element(a) : 
      
    m = 10000000
      
    for i in range(0, len(a)) : 
          
        if (a[i] < m) : 
            m = a[i] 
      
    return m 
  
# Function to find smallest num 
def findSmallest(a, n) : 
      
    # Find the smallest element 
    smallest = min_element(a) 
      
    # Check if all array elements 
    # are divisible by smallest. 
    for i in range(1, n) : 
          
        if (a[i] % smallest >= 1) : 
            return -1
  
    return smallest 
  
  
# Driver code 
  
a = [ 25, 20, 5, 10, 100 ] 
n = len(a) 
print(findSmallest(a, n)) 
  
  
# This code is contributed by Nikita Tiwari. 

