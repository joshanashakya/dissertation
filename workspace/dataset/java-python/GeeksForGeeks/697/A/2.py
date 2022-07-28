

# Python3 implementation of the approach  
  
# Utility function to print  
# the contenets of an array  
def printArr(arr, n) :  
  
    for i in range(n) : 
        print(arr[i],end=" ")  
  
  
# Function that pushes all the zeros  
# to the start and ones to the end of an array  
def pushBinaryToBorder(arr, n) :  
  
    # To store the count of elements  
    # which are not equal to 1  
    count1 = 0
      
    # Traverse the array and calculate  
    # count of elements which are not 1  
    for i in range(n) : 
        if (arr[i] != 1) : 
            arr[count1] = arr[i] 
            count1 += 1
  
    # Now all non-ones elements have been shifted to  
    # front and 'count1' is set as index of first 1.  
    # Make all elements 1 from count to end.  
    while (count1 < n) : 
        arr[count1] = 1
        count1 += 1
  
    # Initialize lastNonBinary position to zero  
    lastNonOne = 0
  
    # Traverse the array and pull non-zero  
    # elements to the required indices  
    for i in range(n - 1, -1, -1) : 
  
        # Ignore the 1's  
        if (arr[i] == 1) :  
            continue
              
        if (not lastNonOne) : 
  
            # Mark the position Of  
            # last NonBinary integer  
            lastNonOne = i 
  
        # Place non-zero element to  
        # their required indices  
        if (arr[i] != 0) : 
            arr[lastNonOne] = arr[i] 
            lastNonOne -= 1
  
    # Put zeros to start of array  
    while (lastNonOne >= 0) : 
        arr[lastNonOne] = 0
        lastNonOne -= 1
  
# Driver code  
if __name__ == "__main__" : 
      
    arr = [ 1, 2, 0, 0, 0, 3, 6 ];  
    n = len(arr);  
    pushBinaryToBorder(arr, n)  
    printArr(arr, n) 
  
# This code is contributed by Ryuga 

