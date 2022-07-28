

# Python3 implementation of the above approach 
M = 3;N = 3; 
  
# Function to reverse 
# the given 2D arr[][] 
def reverseArray(arr) : 
  
    # Traverse each row of arr[][] 
    for i in range(M) : 
  
        # Initialise start and end index 
        start = 0; 
        end = N - 1; 
  
        # Till start < end, swap the element 
        # at start and end index 
        while (start < end) : 
  
            # Swap the element 
            arr[i][start], arr[i][end] = arr[i][end], arr[i][start]; 
  
            # Increment start and decrement 
            # end for next pair of swapping 
            start += 1; 
            end -= 1; 
  
    # Print the arr[][] after 
    # reversing every row 
    for i in  range(M) : 
        for j in range(N) : 
            print(arr[i][j],end= ' '); 
      
        print(); 
   
# Driver Code 
if __name__ ==  "__main__" : 
  
    arr = [ [ 1, 2, 3 ], 
            [ 4, 5, 6 ], 
            [ 7, 8, 9 ] ]; 
  
    # Function call 
    reverseArray(arr); 
     
# This code is contributed by AnkitRai01 

