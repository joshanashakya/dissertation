

# Python3 program to find minimum  
# (or maximum) element  
# in an array.  
def getMin(arr,n): 
    return min(arr) 
  
def getMax(arr,n): 
    return max(arr) 
  
# Driver Code 
if __name__=='__main__': 
    arr = [12,1234,45,67,1] 
    n = len(arr) 
    print("Minimum element of array: " 
          ,getMin(arr, n)) 
    print("Maximum element of array: " 
          ,getMax(arr, n)) 
  
# This code is contributed by  
# Shrikant13 

