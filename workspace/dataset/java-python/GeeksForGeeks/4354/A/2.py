

# Python3 implrmrntation of the approach 
  
# Function to return the frequency of x 
# in the subarray arr[low...high] 
def count(arr, low, high, x): 
  
    # If the subarray is invalid or the 
    # element is not found 
    if ((low > high) or (low == high and arr[low] != x)): 
        return 0; 
  
    # If there's only a single element 
    # which is equal to x 
    if (low == high and arr[low] == x): 
        return 1; 
  
    # Divide the array into two parts and 
    # then find the count of occurrences 
    # of x in both the parts 
    return count(arr, low, (low + high) // 2, x) +\ 
    count(arr, 1 + (low + high) // 2, high, x); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 30, 1, 42, 5, 56, 3, 56, 9]; 
    n = len(arr); 
    x = 56; 
    print(count(arr, 0, n - 1, x)); 
  
# This code is contributed by PrinciRaj1992 

