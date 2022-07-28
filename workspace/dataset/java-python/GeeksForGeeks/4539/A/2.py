

# Python program to Range query for 
# Count number of set bits 
  
# 2-D array that will stored the count 
# of bits set in element of array 
BitCount = [0] * 10000
  
# Function store the set bit 
# count in BitCount Array 
def fillSetBitsmatrix(arr: list, n: int): 
    global BitCount 
  
    # traverse over all bits 
    for i in range(32): 
  
        # mark elements with i'th bit set 
        for j in range(n): 
  
            # Check whether the current bit is 
            # set or not if it's set then mark it. 
            temp = arr[j] >> i 
            if temp % 2 != 0: 
                BitCount[j] += 1
  
    # store cumulative sum of bits 
    for i in range(1, n): 
        BitCount[i] += BitCount[i - 1] 
  
# Function to process queries 
def Query(Q: list, q: int): 
    for i in range(q): 
        print(BitCount[Q[i][1]] - BitCount[Q[i][0] - 1]) 
  
# Driver Code 
if __name__ == "__main__": 
  
    Arr = [1, 5, 6, 10, 9, 4, 67] 
    n = len(Arr) 
  
    fillSetBitsmatrix(Arr, n) 
  
    q = 2
    Q = [(1, 5), (2, 6)] 
    Query(Q, q) 
  
# This code is contributed by 
# sanjeev2552 

