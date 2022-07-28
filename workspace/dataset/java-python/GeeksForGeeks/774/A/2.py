

# Python 3 implementation of the approach 
from math import sqrt, gcd 
  
# Utility function to print 
# the contents of an array 
def printArr(arr, n): 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Function to find the required numbers 
def findNumbers(arr, n): 
      
    # Sort array in decreasing order 
    arr.sort(reverse = True) 
  
    freq = [0 for i in range(arr[0] + 1)] 
  
    # Count frequency of each element 
    for i in range(n): 
        freq[arr[i]] += 1
  
    # Size of the resultant array 
    size = int(sqrt(n)) 
    brr = [0 for i in range(len(arr))]  
    l = 0
  
    for i in range(n): 
        if (freq[arr[i]] > 0): 
              
            # Store the highest element in 
            # the resultant array 
            brr[l] = arr[i] 
  
            # Decrement the frequency of that element 
            freq[brr[l]] -= 1
            l += 1
            for j in range(l): 
                if (i != j): 
                      
                    # Compute GCD 
                    x = gcd(arr[i], brr[j]) 
  
                    # Decrement GCD value by 2 
                    freq[x] -= 2
  
    printArr(brr, size) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 1, 1, 1, 1, 1, 1, 1,  
           1, 1, 1, 1, 1, 1, 1, 1, 
           1, 5, 5, 5, 7, 10, 12, 2, 2] 
    n = len(arr) 
    findNumbers(arr, n) 
      
# This code is contributed by 
# Surendra_Gangwar 

