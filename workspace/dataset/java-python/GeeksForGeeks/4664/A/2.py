

# Python3 program to find sum of  
# Bitwise-OR of all submatrices  
  
# Function to find prefix-count for  
# each row from right to left  
def findPrefixCount(p_arr, set_bit):  
  
    for i in range(0, n): 
        for j in range(n - 1, -1, -1):  
  
            if set_bit[i][j]:  
                continue
            if j != n - 1:  
                p_arr[i][j] += p_arr[i][j + 1]  
  
            p_arr[i][j] += int(not set_bit[i][j])  
  
# Function to create a boolean matrix  
# set_bit which stores ‘1’ at an index  
# (R, C) if ith bit of arr[R][C] is set.  
def matrixOrValueOne(arr):  
  
    # Array to store prefix count of zeros  
    # from right to left for boolean array  
    p_arr = [[0 for i in range(n)]  
                for j in range(n)]  
  
    findPrefixCount(p_arr, arr)  
  
    # Variable to store the count of  
    # submatrices with OR value 0  
    count_zero_submatrices = 0
  
    # Loop to evaluate each column of  
    # the prefix matrix uniquely.  
    # For each index of a column we will try  
    # to determine the number of sub-matrices  
    # starting from that index and has all 1s  
    for j in range(0, n):  
  
        i = n - 1
          
        # stack to store elements and the  
        # count of the numbers they popped  
  
        # First part of pair will be the  
        # value of inserted element.  
        # Second part will be the count  
        # of the number of elements pushed  
        # before with a greater value  
        q = []  
  
        # Variable to store the number  
        # of submatrices with all 0s  
        to_sum = 0
          
        while i >= 0:  
  
            c = 0
            while (len(q) != 0 and 
                   q[-1][0] > p_arr[i][j]):  
  
                to_sum -= ((q[-1][1] + 1) *
                           (q[-1][0] - p_arr[i][j]))  
  
                c += q.pop()[1] + 1
  
            to_sum += p_arr[i][j]  
            count_zero_submatrices += to_sum  
  
            q.append((p_arr[i][j], c))  
            i -= 1
  
    # Return the final answer  
    return ((n * (n + 1) * n * (n + 1)) //
             4 - count_zero_submatrices)  
  
# Function to find sum of  
# Bitwise-OR of all submatrices  
def sumOrMatrix(arr):  
  
    Sum, mul = 0, 1
    for i in range(0, 30):  
      
        # matrix to store the status  
        # of ith bit of each element  
        # of matrix arr  
        set_bit = [[False for i in range(n)]  
                          for j in range(n)] 
  
        for R in range(0, n):  
            for C in range(0, n):  
                set_bit[R][C] = ((arr[R][C] &  
                                 (1 << i)) != 0)  
  
        Sum += (mul * matrixOrValueOne(set_bit))  
        mul *= 2
  
    return Sum
  
# Driver Code  
if __name__ == "__main__": 
      
    n = 3
    arr = [[9, 7, 4],  
        [8, 9, 2],  
        [11, 11, 5]]  
  
    print(sumOrMatrix(arr))  
  
# This code is contributed by Rituraj Jain 

