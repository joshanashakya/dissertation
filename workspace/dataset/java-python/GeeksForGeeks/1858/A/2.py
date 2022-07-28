

# Python3 implementation of the approach 
  
# Function to return the xor of  
# elements having odd frequency  
def xorOdd(arr, n) :  
  
    # To store the frequency  
    # of all the elements  
    m = dict.fromkeys(arr, 0);  
  
    # Update the map with the  
    # frequency of the elements  
    for i in range(n) : 
        m[arr[i]] += 1;  
  
    # To store the XOR of the elements  
    # appearing odd number of  
    # times in the array  
    xorArr = 0;  
  
    # Traverse the map using an iterator  
    for key,value in m.items() : 
  
        # Check for odd frequency  
        # and update the xor  
        if (value & 1) : 
            xorArr ^= key;  
  
    return xorArr;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 1, 3, 3, 4, 2, 3, 1 ];  
    n = len(arr);  
  
    print(xorOdd(arr, n));  
  
# This code is contributed by AnkitRai01 

