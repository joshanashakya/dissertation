

# Python 3 program to print the 
# product of the consecutive elements. 
  
# Function to print pairwise 
# consecutive product 
def pairwiseProduct( arr, n): 
  
    prod = 1
    for i in range(n - 1) : 
  
        # multiply the alternate numbers 
        prod = arr[i] * arr[i + 1] 
        print(prod, end = " ") 
      
# Driver Code 
if __name__=="__main__": 
  
    arr = [ 4, 10, 15, 5, 6 ] 
    n = len(arr) 
  
    pairwiseProduct(arr, n) 
  
# This code is contributed  
# by ChitraNayal 

