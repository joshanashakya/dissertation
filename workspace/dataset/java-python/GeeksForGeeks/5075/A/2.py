

# Python3 program to find pair whose  
# sum already exist in arrar 
  
# Function to find pair whose  
# sum sxists in arr[] 
def findPair(arr, n): 
      
    # hash to store all element of array 
    s = {i : 1 for i in arr} 
      
    found = False
      
    for i in range(n): 
        for j in range(i + 1, n): 
              
            # check if sum already exists or not 
            if arr[i] + arr[j] in s.keys(): 
                print(arr[i], arr[j]) 
                found = True
    if found == False: 
        print("Not exist") 
          
# Driver code 
arr = [10, 4, 8, 13, 5] 
  
n = len(arr) 
  
findPair(arr, n) 
      
# This code is contributed  
# by Mohit Kumar 

