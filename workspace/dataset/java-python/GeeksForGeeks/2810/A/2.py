

# Python3 program to find all good  
# indices in the given array  
from collections import defaultdict 
  
# Function to find all good indices  
# in the given array  
def niceIndices(A, n):  
  
    Sum = 0
  
    # hash to store frequency  
    # of each element  
    m = defaultdict(lambda:0) 
  
    # Storing frequency of each element  
    # and calculating sum simultaneously  
    for i in range(n):  
        m[A[i]] += 1
        Sum += A[i]  
  
    for i in range(n):  
        k = Sum - A[i]  
          
        if k % 2 == 0: 
              
            k = k >> 1
  
            # check if array is good after  
            # removing i-th index element  
            if k in m:  
  
                if ((A[i] == k and m[k] > 1) or 
                    (A[i] != k)):  
                      
                    # print good indices  
                    print((i + 1), end = " ") 
  
# Driver Code     
if __name__ == "__main__": 
  
    A = [8, 3, 5, 2]  
    n = len(A) 
  
    niceIndices(A, n)  
  
# This code is contributed by Rituraj Jain 

