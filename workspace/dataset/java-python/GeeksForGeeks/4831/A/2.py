

# Python3 implementation of the 
# above approach  
def printPermutation(n, k):  
  
    mx = n  
    for i in range(1, k + 1): # Decreasing part  
        print(mx, end = " ")  
        mx -= 1
      
    for i in range(1, mx + 1): # Increasing part  
        print(i, end = " ")  
  
# Driver Code  
if __name__ == "__main__": 
  
    N, K = 5, 3
  
    if K >= N - 1:  
        print("Not Possible")  
  
    else: 
        printPermutation(N, K)  
  
# This code is contributed 
# by Rituraj Jain 

