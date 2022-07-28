

# Python3 implementation of the approach  
  
# Function to return the required length  
def findLen(arr, n, m) :  
  
    # To store the filtered numbers  
    filter = [];  
  
    # Filtering the numbers  
    for i in range(n) :  
        if ((arr[i] & m) == m) : 
            filter.append(arr[i]);  
  
    # If there are no elements to check  
    if (len(filter) == 0) : 
        return 0;  
  
    # Find the OR of all the  
    # filtered elements  
    c_and = filter[0];  
    for i in range(1, len(filter)) : 
        c_and &= filter[i];  
  
    # Check if the OR is equal to m  
    if (c_and == m) : 
        return len(filter);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 7, 3, 3, 1, 3 ];  
    n = len(arr);  
    m = 3;  
  
    print(findLen(arr, n, m));  
      
# This code is contributed by AnkitRai01 

