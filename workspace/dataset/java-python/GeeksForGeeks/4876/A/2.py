

# Python3 implementation of the approach  
  
# Function to sort all the  
# multiples of x from the  
# array in decreasing order  
def sortMultiples(arr, n, x) : 
    v = []  
  
    # Insert all multiples of x  
    # to a vector  
    for i in range(n) :  
        if (arr[i] % x == 0) : 
            v.append(arr[i])  
  
    # Sort the vector in descending  
    v.sort(reverse = True) 
    j = 0
  
    # update the array elements  
    for i in range(n) :  
        if (arr[i] % x == 0) : 
            arr[i] = v[j] 
            j += 1
              
# Utility function to print the array  
def printArray(arr, N) : 
  
    # Print the array  
    for i in range(N) :  
        print(arr[i], end = " ") 
  
# Driver code  
if __name__ == "__main__" : 
  
    arr= [ 125, 3, 15, 6, 100, 5 ]  
    x = 5
    n = len(arr) 
      
    sortMultiples(arr, n, x) 
  
    printArray(arr, n)  
  
# This code is contributed by Ryuga 

