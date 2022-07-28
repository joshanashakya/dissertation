

# Python3 program to find triplets in a given 
# array whose Sum is equal to given sum. 
import math as mt 
  
# function to print triplets with given sum 
def findTriplets(arr, n, Sum): 
  
    for i in range(n - 1): 
          
        # Find all pairs with Sum equals 
        # to "Sum-arr[i]" 
        s = dict() 
        for j in range(i + 1, n): 
            x = Sum - (arr[i] + arr[j]) 
            if x in s.keys(): 
                print(x, arr[i], arr[j]) 
            else: 
                s[arr[j]] = 1
          
# Driver code 
arr = [ 0, -1, 2, -3, 1 ] 
Sum = -2
n = len(arr) 
findTriplets(arr, n, Sum) 
  
# This code is contributed  
# by mohit kumar 29 

