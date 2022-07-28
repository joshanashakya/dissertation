

# Python3 program to make all array  
# element even  
  
# Function to count the total  
# number of operations needed to make  
# all array element even  
def countOperations(arr, n) : 
  
    count = 0;  
  
    # Traverse the given array  
    for i in range(n - 1) : 
  
        # If an odd element occurs  
        # then increment that element  
        # and next adjacent element  
        # by 1  
        if (arr[i] & 1) : 
            arr[i] += 1;  
            arr[i + 1] += 1;  
            count += 2;  
  
    # Traverse the array if any odd  
    # element occurs then return -1  
    for i in range(n) : 
        if (arr[i] & 1) : 
            return -1;  
  
    # Returns the count of operations  
    return count;  
  
if __name__ == "__main__" :  
  
    arr = [ 2, 3, 4, 5, 6 ];  
    n = len(arr);  
    print(countOperations(arr, n));  
      
    # This code is contributed by AnkitRai01 

