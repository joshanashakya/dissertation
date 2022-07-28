

# Python3 implementation of the  
# above approach  
  
# Function to find average  
def average(arr, n, k) : 
    total = 0
  
    # base case if 2*k>=n  
    # means all element get removed  
    if (2 * k >= n) : 
        return 0
  
    # first sort all elements  
    arr.sort() 
      
    start , end = k , n - k - 1
  
    # sum of req number  
    for i in range(start, end + 1) : 
        total += arr[i]  
  
    # find average  
    return (total / (n - 2 * k)) 
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 4, 4, 5, 6 ]  
    n = len(arr) 
    k = 2
  
    print(average(arr, n, k))  
  
# This code is contributed by Ryuga 

