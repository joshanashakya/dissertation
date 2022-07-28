

# Python Program to find weighted mean of 
# natural numbers. 
  
# Function to calculate weighted mean. 
def weightedMean(X,W,n) : 
    sum = 0
    numWeight = 0
    i = 0
    while  i < n : 
          
        numWeight = numWeight + X[i] * W[i] 
        sum = sum + W[i] 
        i = i + 1
   
    return (float)(numWeight / sum) 
  
   
# Driver program to test the function. 
  
# Take num array and corresponding weight   
# array and initialize it. 
X = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
W = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
  
# Calculate the size of array. 
n = len(X) 
m = len(W) 
   
# Check the size of both array is equal or not. 
if (n == m) : 
    print weightedMean(X, W, n) 
else : 
    print "-1"
      
# This coe is contributed by Nikita Tiwari. 

