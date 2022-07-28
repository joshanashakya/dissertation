

# Python3 implementation of the approach 
  
# Function to print the pair (n, r) 
# such that nPr is maximum possible 
def findPair(arr, n): 
      
    # There should be atleast 2 elements 
    if (n < 2): 
        print("-1") 
        return
  
    i = 0
    first = -1
    second = -1
  
    # Findex the largest 2 elements 
    for i in range(n): 
        if (arr[i] > first): 
            second = first 
            first = arr[i] 
        elif (arr[i] > second): 
            second = arr[i] 
  
    print("n =", first, "and r =", second) 
  
# Driver code 
arr = [0, 2, 3, 4, 1, 6, 8, 9] 
n = len(arr) 
  
findPair(arr, n) 
  
# This code is contributed by mohit kumar 

