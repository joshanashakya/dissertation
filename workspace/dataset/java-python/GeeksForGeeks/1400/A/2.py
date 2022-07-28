

# Python3 implementation of the approach  
  
# Utility function to print the  
# contents of an array  
def printArr(arr, n) :  
  
    for i in range(n) :  
        print(arr[i], end= " ");  
  
# Function to generate and print  
# the required array  
def findArray(n, k, s) : 
  
    # Initially all the positions are empty  
    vis = [0] * n;  
  
    # To store the count of positions  
    # i such that arr[i] = s  
    cnt = 0;  
  
    # To store the final array elements  
    arr = [0] * n; 
    i = 0; 
      
    while (i < n and cnt < k) : 
          
        # Set arr[i] = s and the gap between  
        # them is exactly 2 so in for loop  
        # we use i += 2  
        arr[i] = s;  
  
        # Mark the i'th position as visited  
        # as we put arr[i] = s  
        vis[i] = 1;  
  
        # Increment the count  
        cnt += 1; 
        i += 2; 
    val = s;  
      
    # Finding the next odd number after s  
    if (s % 2 == 0) : 
        val += 1;  
    else : 
        val = val + 2;  
  
    for i in range(n) : 
        if (vis[i] == 0) : 
  
            # If the i'th position is not visited  
            # it means we did not put any value  
            # at position i so we put 1 now  
            arr[i] = val;  
  
    # Print the final array  
    printArr(arr, n);  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 8; k = 3; s = 12;  
  
    findArray(n, k, s);  
  
# This code is contributed by AnkitRai01 

