

# Python3 implementation of the approach  
  
# Utility function to print  
# the elements of an array  
def printArr(arr, n) : 
  
    for i in range(n) : 
        print(arr[i], end = " ");  
  
# Function to find the required arrangement  
def findArrangement(arr, n) :  
  
    # There has to be atleast 2 elements  
    if (n < 2) : 
        print("-1", end = "");  
        return;  
  
    # Minimum element from the array  
    minVal = min(arr);  
  
    # Swap any occurrence of the minimum  
    # element with the last element  
    for i in range(n) : 
        if (arr[i] == minVal) : 
            arr[i], arr[n - 1] = arr[n - 1], arr[i];  
            break;  
              
    # Find the bitwise AND of the  
    # first (n - 1) elements  
    andVal = arr[0];  
    for i in range(1, n - 1) : 
        andVal &= arr[i];  
  
    # If the bitwise AND is equal  
    # to the last element then  
    # print the arrangement  
    if (andVal == arr[n - 1]) : 
        printArr(arr, n);  
    else : 
        print("-1");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 5, 3, 3 ];  
    n = len(arr);  
  
    findArrangement(arr, n);  
  
# This code is contributed by AnkitRai01 

