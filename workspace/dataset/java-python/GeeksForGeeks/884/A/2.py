

# Python3 Program to find the distinct 
# elements in a range 
  
# Function to perform queries in a range 
def query(start, end, left,  
          right, node, seg): 
      
    # No overlap 
    if (end < left or start > right): 
        return 0
  
    # Totally Overlap 
    elif (start >= left and 
            end <= right): 
        return seg[node] 
  
    # Parital Overlap 
    else: 
        mid = (start + end) // 2
  
        # Finding the Answer 
        # for the left Child 
        leftChild = query(start, mid, left,  
                          right, 2 * node, seg) 
  
        # Finding the Answer 
        # for the right Child 
        rightChild = query(mid + 1, end, left, 
                           right, 2 * node + 1, seg) 
  
        # Combining the BitMasks 
        return (leftChild | rightChild) 
  
# Function to perform update operation 
# in the Segment seg 
def update(left, right, index,  
           Value, node, ar, seg): 
    if (left == right): 
        ar[index] = Value 
  
        # Forming the BitMask 
        seg[node] = (1 << Value) 
        return
  
    mid = (left + right) // 2
    if (index > mid): 
  
        # Updating the left Child 
        update(mid + 1, right, index,  
               Value, 2 * node + 1, ar, seg) 
    else: 
  
        # Updating the right Child 
        update(left, mid, index, 
               Value, 2 * node, ar, seg) 
  
    # Updating the BitMask 
    seg[node] = (seg[2 * node] |  
                 seg[2 * node + 1]) 
  
# Building the Segment Tree 
def build(left, right, node, ar, eg): 
  
    if (left == right): 
  
        # Building the Initial BitMask 
        seg[node] = (1 << ar[left]) 
  
        return
  
    mid = (left + right) // 2
  
    # Building the left seg tree 
    build(left, mid, 2 * node, ar, seg) 
  
    # Building the right seg tree 
    build(mid + 1, right,  
                2 * node + 1, ar, seg) 
  
    # Forming the BitMask 
    seg[node] = (seg[2 * node] |  
                 seg[2 * node + 1]) 
  
# Utility Function to answer the queries 
def getDistinctCount(queries, ar, seg, n): 
  
    for i in range(len(queries)): 
  
        op = queries[i][0] 
  
        if (op == 2): 
  
            l = queries[i][1] 
            r = queries[i][2] 
  
            tempMask = query(0, n - 1, l - 1, 
                             r - 1, 1, seg) 
  
            countOfBits = 0
  
            # Counting the set bits which denote  
            # the distinct elements 
            for i in range(63, -1, -1): 
  
                if (tempMask & (1 << i)): 
  
                    countOfBits += 1
  
            print(countOfBits) 
        else: 
  
            index = queries[i][1] 
            val = queries[i][2] 
  
            # Updating the value 
            update(0, n - 1, index - 1,  
                       val, 1, ar, seg) 
  
# Driver Code 
if __name__ == '__main__': 
    n = 7
    ar = [1, 2, 1, 3, 1, 2, 1] 
  
    seg = [0] * 4 * n 
    build(0, n - 1, 1, ar, seg) 
  
    q = 5
    queries = [[ 2, 1, 4 ], 
               [ 1, 4, 2 ], 
               [ 1, 5, 2 ], 
               [ 2, 4, 6 ], 
               [ 2, 1, 7 ]] 
  
    getDistinctCount(queries, ar, seg, n) 
  
# This code is contributed by Mohit Kumar 

