

# Python3 program to find minimum range 
# increments to sort an array 
  
# Function to find minimum range 
# increments to sort an array 
def minMovesToSort(arr, n) : 
  
    moves = 0
  
    mn = arr[n - 1] 
      
    for i in range(n - 1, -1, -1) : 
  
        # If current element is found  
        # greater than last element 
        # Increment all terms in 
        # range i+1 to n-1 
        if (arr[i] > mn) : 
            moves += arr[i] - mn 
  
        mn = arr[i] # Minimum in range i to n-1 
      
    return moves 
  
# Driver Code 
if __name__ == "__main__" : 
  
    arr = [ 3, 5, 2, 8, 4 ] 
  
    n = len(arr) 
  
    print(minMovesToSort(arr, n)) 
  
# This code is contributed by Ryuga 

