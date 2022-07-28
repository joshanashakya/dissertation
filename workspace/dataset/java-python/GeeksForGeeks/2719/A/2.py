

# Python3 program to find the maximum sum  
# after rearranging the array for K queries  
  
# Function to find maximum sum after  
# rearranging array elements  
def maxSumArrangement( A,  R,  N,  M): 
  
    # Auxilary array to find the  
    # count of each selected elements  
    # Initialize with 0  
    count = [0 for i in range(N)] 
  
    # Finding count of every element  
    # to be selected  
    for i in range(M): 
  
        l = R[i][0] 
        r = R[i][1] + 1
  
        # Making it to 0-indexing  
        l = l - 1 
        r = r - 1
  
        # Prefix sum array concept is used  
        # to obtain the count array  
        count[l] = count[l] + 1 
  
        if (r < N): 
            count[r] = count[r] - 1 
  
    # Iterating over the count array  
    # to get the final array  
    for i in range(1, N):  
        count[i] = count[i] + count[i - 1] 
  
    # Variable to store the maximum sum  
    ans = 0
  
    # Sorting both the arrays  
    count.sort() 
    A.sort() 
  
    # Loop to find the maximum sum  
    for i in range(N - 1, -1, -1):  
        ans = ans + A[i] * count[i] 
  
    return ans 
  
# Driver code  
A = [ 2, 6, 10, 1, 5, 6 ] 
R = [ [ 1, 3 ], [ 4, 6 ], [ 3, 4 ] ]  
  
N = len(A) 
M = len(R) 
  
print(maxSumArrangement(A, R, N, M)) 
  
# This code is contributed by Sanjit_Prasad 

