

# Python implementation of the approach 
  
# Size of the array (MAX) 
N = int(2e5) + 10
  
# To store the sum of 
# the array elements 
bit = [0] * N 
  
# To keep track of how many type 3 
# queries have been performed before 
# a particular index 
idx = [0] * N 
  
# Function to perform the point 
# update in Fenwick tree 
def update(index: int, val: int, bitt: list): 
    while index < N: 
        bitt[index] += val 
        index += index & -index 
  
# Function to return the sum 
# of the elements A[1...idx] 
# from BIT 
def summation(index: int, bitt: list) -> int: 
    res = 0
    while index > 0: 
        res += bitt[index] 
        index -= index & -index 
    return res 
  
# Function to perform the queries and 
# return the answer vector 
def performQueries(A: list, B: list) -> list: 
    global bit, idx 
  
    # For 1 bases indexing 
    # insert 0 in the vector 
    A.insert(0, 0) 
  
    # Updated size of the vector 
    n = len(A) 
  
    # Updating the bit tree 
    for i in range(1, n): 
        update(i, A[i], bit) 
  
    # Vector to store the answers 
    # of range sum 
    ans = [] 
  
    # Iterating in the query 
    # vector 
    for i in B: 
        type = i[0] 
        x = i[1] 
        v = i[2] 
  
        # If the query is of 
        # type 1 
        if type == 1: 
  
            # Updating the tree 
            # with x in the last 
            update(n, x, bit) 
  
            # Pushing back the value 
            # in the original vector 
            A.append(x) 
  
            # Incrementing the size 
            # of the vector by 1 
            n += 1
  
        # If the query is of type 2 
        elif type == 2: 
  
            # Getting the updated index 
            # in case of any query of 
            # type 3 occured before it 
            id = x + summation(x, idx) 
  
            # Making the effect to that 
            # value to 0 by subtracting 
            # same vaule from the tree 
            update(id, -A[id], bit) 
  
            # Updating the A[id] to v 
            A[id] = v 
  
            # Now update the 
            # bit by v at x 
            update(id, v, bit) 
  
        # If the query is of type 3 
        elif type == 3: 
  
            # Get the current index 
            id = x + summation(x, idx) 
  
            # Remove the effect of that 
            # index from the bit tree 
            update(id, -A[id], bit) 
  
            # Update the idx tree 
            # because one element has 
            # been deleted 
            update(x, 1, idx) 
  
            # Update the idx val to 0 
            A[id] = 0
  
        # If the query is of type 4 
        else: 
  
            # Get the updated range 
            xx = x + summation(x, idx) 
            vv = v + summation(v, idx) 
  
            # Push_back the value 
            ans.append(summation(vv, bit) - summation(xx - 1, bit)) 
    return ans 
  
  
# Driver Code 
if __name__ == "__main__": 
    A = [1, 2, 5, 3, 4] 
  
    # Queries 
    B = [[4, 2, 4], [3, 3, 0], [1, 6, 0], [4, 3, 5]] 
  
    # Get the answer array 
    ans = performQueries(A, B) 
  
    # printing the answer 
    for i in ans: 
        print(i) 
  
# This code is contributed by 
# sanjeev2552 

