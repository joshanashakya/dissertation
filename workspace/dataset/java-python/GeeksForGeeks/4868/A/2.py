

# Python 3 implementation of the approach 
  
# Function to sort all the multiples of x  
# from the array in ascending order 
def sortMultiples(arr, n, x): 
    v = [] 
  
    # Insert all multiples of 5 to a vector 
    for i in range(0, n, 1): 
        if (arr[i] % x == 0): 
            v.append(arr[i]) 
  
    # Sort the vector 
    v.sort(reverse=False) 
  
    j = 0
  
    # update the array elements 
    for i in range(0, n, 1): 
        if (arr[i] % x == 0): 
            arr[i] = v[j] 
            j += 1
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 125, 3, 15, 6, 100, 5]  
    x = 5
    n = len(arr) 
  
    sortMultiples(arr, n, x) 
  
    # Print the result 
    for i in range(0, n, 1): 
        print(arr[i], end = " ") 
  
# This code is contributed by  
# Surendra _Gangwar 

