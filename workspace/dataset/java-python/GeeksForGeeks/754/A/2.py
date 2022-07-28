

# Python 3 program to print the absolute 
# difference of the consecutive elements 
  
# Function to print pairwise absolute 
# difference of consecutive elements 
def pairwiseDifference(arr, n): 
      
    for i in range(n - 1) : 
  
        # absolute difference between 
        # consecutive numbers 
        diff = abs(arr[i] - arr[i + 1]) 
        print(diff , end = " ") 
  
# Driver Code 
if __name__=="__main__": 
    arr = [ 4, 10, 15, 5, 6 ] 
    n = len(arr) 
  
    pairwiseDifference(arr, n) 
  
# This code is contributed  
# by ChitraNayal 

