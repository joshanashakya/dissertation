

# Python3 program to find maximum length  
# of decreasing sequence by removing  
# at most one element  
  
# Function to find the maximum length  
def maxLength(a, n) : 
  
    # Intialise maximum length to 1  
    maximum = 1;  
  
    # Intialise left[] to find the  
    # length of decreasing sequence  
    # from left to right  
    left = [0]*n;  
  
    # Intialise right[] to find the  
    # length of decreasing sequence  
    # from right to left  
    right = [0]*n;  
  
    # Initially store 1 at each index of  
    # left and right array  
    for i in range(n) : 
        left[i] = 1;  
        right[i] = 1;  
  
    # Iterate over the array arr[] to  
    # store length of decreasing  
    # sequence that can be obtained  
    # at every index in the right array  
    for i in range(n - 2, -1, -1) : 
  
        if (a[i] > a[i + 1]) : 
            right[i] = right[i + 1] + 1;  
  
        # Store the length of longest  
        # continuous decreasing  
        # sequence in maximum  
        maximum = max(maximum, right[i]);  
  
    # Iterate over the array arr[] to  
    # store length of decreasing  
    # sequence that can be obtained  
    # at every index in the left array  
    for i in range(1, n) : 
        if (a[i] < a[i - 1]) : 
            left[i] = left[i - 1] + 1;  
  
    if (n > 2) : 
        # Check if we can obtain a  
        # longer decreasing sequence  
        # after removal of any element  
        # from the array arr[] with  
        # the help of left[] & right[]  
        for i in range(1, n -1) : 
            if (a[i - 1] > a[i + 1]) : 
                maximum = max(maximum, left[i - 1] + right[i + 1]); 
  
    # Return maximum length of sequence  
    return maximum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 8, 7, 3, 5, 2, 9 ];  
    n = len(arr);  
  
    # Function calling  
    print(maxLength(arr, n));  
  
# This code is contributed by AnkitRai01 

