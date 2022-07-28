

# Python 3 Program to implement  
# standard error of mean. 
import math 
  
  
# Function to find sample mean. 
def mean(arr, n) : 
  
    # loop to calculate  
    # sum of array elements. 
    sm = 0
    for i in range(0,n) : 
        sm = sm + arr[i] 
       
    return sm / n 
  
  
# Function to calculate sample 
# standard deviation. 
def SSD(arr, n) : 
    sm = 0
    for i in range(0,n) : 
        sm = sm + (arr[i] - mean(arr, n)) * (arr[i] - mean(arr, n)) 
   
    return (math.sqrt(sm / (n - 1))) 
   
   
# Function to calculate sample error. 
def sampleError(arr, n) : 
  
    # Formula to find sample error. 
    return SSD(arr, n) / (math.sqrt(n)) 
  
   
# Driver function 
arr = [ 78.53, 79.62, 80.25, 81.05, 83.21, 83.46] 
n = len(arr) 
print(sampleError(arr, n)) 
      
    
# This code is contributed 
# by Nikita Tiwari. 

