

# Python3 code to calculate maximum unique 
# element of every segment of array 
def find_max(A, N, K): 
      
    # Storing counts of first K-1 elements 
    # Also storing distinct elements. 
    Count = dict() 
    for i in range(K - 1): 
        Count[A[i]] = Count.get(A[i], 0) + 1
  
    Myset = dict() 
    for x in Count: 
        if (Count[x] == 1): 
            Myset[x] = 1
  
    # Before every iteration of this loop, 
    # we maintain that K-1 elements of current 
    # window are processed. 
    for i in range(K - 1, N): 
  
        # Process K-th element of current window 
        Count[A[i]] = Count.get(A[i], 0) + 1
  
        if (Count[A[i]] == 1): 
            Myset[A[i]] = 1
        else: 
            del Myset[A[i]] 
  
        # If there are no distinct 
        # elements in current window 
        if (len(Myset) == 0): 
            print("Nothing") 
  
        # Set is ordered and last element 
        # of set gives us maximum element. 
        else: 
            maxm = -10**9
            for i in Myset: 
                maxm = max(i, maxm) 
            print(maxm) 
  
        # Remove first element of current 
        # window before next iteration. 
        x = A[i - K + 1] 
        if x in Count.keys(): 
            Count[x] -= 1
            if (Count[x] == 1): 
                Myset[x] = 1
            if (Count[x] == 0): 
                del Myset[x] 
  
# Driver code 
a = [1, 2, 2, 3, 3 ] 
n = len(a) 
k = 3
find_max(a, n, k) 
  
# This code is contributed  
# by mohit kumar 

