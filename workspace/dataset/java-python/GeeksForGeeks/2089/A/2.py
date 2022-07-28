

# Python3 implementation of the approach 
  
# Utility function to print 
# the contents of an array 
def printArr(arr, n) : 
    for i in range(n) : 
        print(arr[i], end = " "); 
  
# Function to sort elements 
# in between multiples of k 
def sortArr(arr, n, k) : 
      
    # To store the index of 
    # previous multiple of k 
    prev = -1; 
    for i in range(n) : 
        if (arr[i] % k == 0) : 
              
            # If it is not the first 
            # multiple of k 
            if (prev != -1) : 
                  
                # Sort the elements in between  
                #the previous and the current  
                # multiple of k 
                temp = arr[prev + 1:i]; 
                temp.sort(); 
                arr = arr[ : prev + 1] + temp + arr[i : ]; 
                  
            # Update previous to be current 
            prev = i; 
  
    # Print the updated array 
    printArr(arr, n); 
  
# Driver code 
if __name__ == "__main__" : 
      
    arr = [ 2, 1, 13, 3, 7, 8, 21, 13, 12 ]; 
    n = len(arr); 
    k = 2; 
      
    sortArr(arr, n, k); 
  
# This code is contributed by Ryuga 

