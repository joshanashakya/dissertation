

# Python3 program to find the lower insertion 
# point of an element in a sorted array  
  
# Function to return the lower insertion  
# point of an element in a sorted array  
def LowerInsertionPoint(arr, n, X) : 
  
    # Base cases  
    if (X < arr[0]) : 
        return 0;  
    elif (X > arr[n - 1]) : 
        return n 
  
    lowerPnt = 0
    i = 1
  
    while (i < n and arr[i] < X) : 
        lowerPnt = i  
        i = i * 2
  
    # Final check for the remaining elements  
    # which are < X  
    while (lowerPnt < n and arr[lowerPnt] < X) : 
        lowerPnt += 1
  
    return lowerPnt 
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 3, 4, 4, 5, 6, 7, 9 ] 
    n = len(arr) 
    X = 4
    print(LowerInsertionPoint(arr, n, X)) 
  
# This code is contributed by Ryuga 

