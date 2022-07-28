

# Python3 implementation of the approach  
  
# Function to return the maximum  
# possible pairs of gloves  
def cntgloves(arr, n) :  
  
    # To store the required count  
    count = 0;  
  
    # Sort the original array  
    arr.sort(); 
    i = 0; 
    while i < (n-1) :  
  
        # A valid pair is found  
        if (arr[i] == arr[i + 1]) : 
            count += 1;  
  
            # Skip the elements of  
            # the current pair  
            i = i + 2;  
  
        # Current elements doesn't make  
        # a valid pair with any other element  
        else : 
            i += 1;  
  
    return count;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 6, 5, 2, 3, 5, 2, 2, 1 ]; 
    n = len(arr);  
  
    print(cntgloves(arr, n));  
  
    # This code is contributed by AnkitRai01 

