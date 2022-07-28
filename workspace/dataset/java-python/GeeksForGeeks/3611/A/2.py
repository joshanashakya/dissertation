

# Python3 implementation of the approach 
MAX = 1000;  
  
# Function that returns true if  
# the required line exists  
def lineExists(x, y, v, n) : 
  
    # To handle negative values from x[]  
    size = (2 * MAX) + 1;  
    arr = [0] * size ;  
  
    # Update arr[] such that arr[i] contains  
    # the sum of all v[j] such that x[j] = i  
    # for all valid values of j  
    for i in range(n) : 
        arr[x[i] + MAX] += v[i];  
  
    # Update arr[i] such that arr[i] contains  
    # the sum of the subarray arr[0...i]  
    # from the original array  
    for i in range(1, size) : 
        arr[i] += arr[i - 1];  
  
    # If all the points add to 0 then  
    # the line can be drawn anywhere  
    if (arr[size - 1] == 0) : 
        return True;  
  
    # If the line is drawn touching the  
    # leftmost possible points  
    if (arr[size - 1] - arr[0] == 0) : 
        return True;  
  
    for i in range(1, size - 1) :  
  
        # If the line is drawn just before  
        # the current point  
        if (arr[i - 1] == arr[size - 1] - arr[i - 1]) : 
            return True;  
  
        # If the line is drawn touching  
        # the current point  
        if (arr[i - 1] == arr[size - 1] - arr[i]) : 
            return True;  
  
        # If the line is drawn just after  
        # the current point  
        if (arr[i] == arr[size - 1] - arr[i]) : 
            return True;  
  
    # If the line is drawn touching the  
    # rightmost possible points  
    if (arr[size - 2] == 0) : 
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" : 
  
    x = [ -3, 5, 8 ];  
    y = [ 8, 7, 9 ];  
    v = [ 8, 2, 10 ];  
    n = len(x);  
  
    if (lineExists(x, y, v, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

