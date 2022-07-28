

# Python3 implementation of  
# above approach  
  
# Function to calculate the time  
def calTime(arr, n):  
  
    work = 0
    for i in range(n): 
        work += 1 / arr[i] 
  
    return 1 / work 
      
# Driver Code  
arr = [ 6.0, 3.0, 4.0 ]  
n = len(arr) 
  
print(calTime(arr, n), "Hours") 
  
# This code is contributed 
# by Sanjit_Prasad 

