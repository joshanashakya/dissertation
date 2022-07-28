

# Python 3 implementation of the approach 
  
# Function that generates the 
# array b[] when n is even 
def solveEven(n, arr, b): 
    left = n - 1
  
    # Fill the first half of the final array 
    # with reversed sequence 
    for i in range((n // 2)): 
        b[i] = arr[left] 
        left = left - 2
        if (left < 0): 
            break
  
    # Fill the second half 
    right = 0
    for i in range(n // 2, n, 1): 
        b[i] = arr[right] 
        right = right + 2
        if (right > n - 2): 
            break
  
# Function that generates the 
# array b[] when n is odd 
def solveOdd(n, arr, b): 
      
    # Fill the first half of the final array 
    # with reversed sequence 
    left = n - 1
    for i in range(n // 2 + 1): 
        b[i] = arr[left] 
        left = left - 2
        if (left < 0): 
            break
  
    # Fill the second half 
    right = 1
    for i in range(n // 2 + 1, n, 1): 
        b[i] = arr[right] 
        right = right + 2
        if (right > n - 2): 
            break
  
# Function to find the final array b[] 
# after n operations of given type 
def solve(n, arr): 
      
    # Create the array b 
    b = [0 for i in range(n)] 
  
    # If the array size is even 
    if (n % 2 == 0): 
        solveEven(n, arr, b) 
    else: 
        solveOdd(n, arr, b) 
  
    # Print the final array elements 
    for i in range(n): 
        print(b[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4] 
    n = len(arr) 
  
    solve(n, arr) 
  
# This code is contributed by 
# Surendra_Gangwar 

