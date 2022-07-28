

# Python3 implementation of the approach  
  
# Function to return the length of the  
# longest sub-array having positive XOR  
def StrictlyPositiveXor(A, N) : 
  
    # To store the XOR  
    # of all the elements  
    allxor = 0;  
  
    # To check if all the  
    # elements of the array are 0s  
    checkallzero = True;  
  
    for i in range(N) : 
  
        # Take XOR of all the elements  
        allxor ^= A[i];  
  
        # If any positive value is found  
        # the make the checkallzero false  
        if (A[i] > 0) : 
            checkallzero = False;  
  
    # If complete array is the answer  
    if (allxor != 0) : 
        return N;  
  
    # If all elements are equal to zero  
    if (checkallzero) : 
        return -1;  
  
    # Initialize l and r  
    l = N; r = -1;  
  
    for i in range(N) :  
  
        # First positive value of the array  
        if (A[i] > 0) : 
            l = i + 1;  
            break;  
              
    for i in range(N - 1, -1, -1) : 
  
        # Last positive value of the array  
        if (A[i] > 0) : 
            r = i + 1;  
            break;  
  
    # Maximum length among  
    # these two subarrays  
    return max(N - l, r - 1);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    A= [ 1, 0, 0, 1 ]; 
    N = len(A); 
    print(StrictlyPositiveXor(A, N));  
  
    # This code is contributed by AnkitRai01 

