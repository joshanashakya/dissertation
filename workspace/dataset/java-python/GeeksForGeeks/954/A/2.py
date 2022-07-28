

# Python3 program to count all distinct 
# elements in a given array 
  
def countDistinct(arr, n): 
  
    # First sort the array so that all 
    # occurrences become consecutive 
    arr.sort(); 
  
    # Traverse the sorted array 
    res = 0; 
    i = 0; 
    while(i < n): 
  
        # Move the index ahead while 
        # there are duplicates 
        while (i < n - 1 and 
               arr[i] == arr[i + 1]): 
            i += 1; 
  
        res += 1; 
        i += 1; 
  
    return res; 
  
# Driver Code 
arr = [ 6, 10, 5, 4, 9, 120, 4, 6, 10 ]; 
n = len(arr); 
print(countDistinct(arr, n)); 
  
# This code is contributed by mits 

