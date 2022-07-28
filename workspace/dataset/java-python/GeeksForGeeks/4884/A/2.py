

# Python3 implementation of the approach  
  
# Function to check the type of the array  
def checkType(arr, n):  
  
    # If the first two and the last two elements  
    # of the array are in increasing order  
    if (arr[0] <= arr[1] and 
        arr[n - 2] <= arr[n - 1]) : 
        print("Increasing");  
  
    # If the first two and the last two elements  
    # of the array are in decreasing order  
    elif (arr[0] >= arr[1] and 
          arr[n - 2] >= arr[n - 1]) : 
        print("Decreasing");  
  
    # If the first two elements of the array are in  
    # increasing order and the last two elements  
    # of the array are in decreasing order  
    elif (arr[0] <= arr[1] and 
          arr[n - 2] >= arr[n - 1]) :  
        print("Increasing then decreasing");  
  
    # If the first two elements of the array are in  
    # decreasing order and the last two elements  
    # of the array are in increasing order  
    else : 
        print("Decreasing then increasing");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4 ];  
    n = len(arr);  
  
    checkType(arr, n);  
  
# This code is contributed by AnkitRai01 

