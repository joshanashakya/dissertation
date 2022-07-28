

# Python3 code to find starting and ending 
# indexes of repeated numbers in an array 
  
# Function to find starting and end index 
def findIndex (a, n, key ): 
    start = -1
      
    # Traverse from beginning to find 
    # first occurrence 
    for i in range(n): 
        if a[i] == key: 
            start = i 
            break
  
    if start == -1: 
        print("Key not present in array") 
        return 0
      
    # Traverse from end to find last 
    # occurrence. 
    end = start 
    for i in range(n-1, start - 1, -1): 
        if a[i] == key: 
            end = i 
            break
    if start == end: 
        print("Only one key is present at index : ", start) 
    else: 
        print("Start index: ", start) 
        print("Last index: ", end) 
  
# Driver Code 
a = [1, 2, 7, 8, 8, 9, 8, 0, 0, 0, 8] 
n = len(a) 
  
# Key to find 
key = 8
  
# Calling function 
findIndex(a, n, key) 
  
# This code is contributed by "Sharad_Bhardwaj". 

