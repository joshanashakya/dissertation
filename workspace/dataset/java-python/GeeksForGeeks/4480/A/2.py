

# Python 3 Program to find the 
# hidden number 
  
# Driver Code 
if __name__ == "__main__": 
      
    # Getting the size of array 
    n = 3
  
    # Getting the array of size n 
    a = [ 1, 2, 3 ] 
  
    # Solution 
    i = 0
  
    # Finding sum of the . 
    # array elements 
    sum = 0
    for i in range(n): 
        sum += a[i] 
  
    # Dividing sum by size n 
    x = sum // n 
  
    # Print x, if found 
    if (x * n == sum): 
        print(x) 
    else: 
        print("-1") 
  
# This code is contributed  
# by ChitraNayal 

