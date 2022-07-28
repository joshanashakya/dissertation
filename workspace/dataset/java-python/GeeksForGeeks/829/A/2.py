

# Python3 implementation of the approach  
  
# Function that returns true if the  
# array contains a crest in  
# the index range [L, R]  
def hasCrest(arr, n, L, R) :  
  
    # To keep track of elements  
    # which satisfy the Property  
    present = [0] * n ;  
  
    for i in range(1, n - 2 + 1) : 
  
        # Property is satisfied for  
        # the current element  
        if ((arr[i] <= arr[i + 1]) and 
            (arr[i] <= arr[i - 1])) : 
            present[i] = 1;  
  
    # Cumulative Sum  
    for i in range(1, n) : 
        present[i] += present[i - 1];  
  
    # If a crest is present in  
    # the given index range  
    if (present[L] == present[R - 1]) : 
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 1, 3, 5, 12, 11, 7, 9 ];  
    N = len(arr);  
    L = 2;  
    R = 6;  
  
    if (hasCrest(arr, N, L, R)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

