

# Python3 implementation of the approach  
from collections import defaultdict 
  
# Function to count the minimum  
# operations required.  
def minOperations(a, n, K):  
  
    Map = defaultdict(lambda:False) 
    for i in range(0, n):  
  
        # check if the initial array  
        # already contains an equal pair  
        if Map[a[i]] == True:  
            return 0
        Map[a[i]] = True
      
    # create new array with AND operations  
    b = []  
    for i in range(0, n):  
        b.append(a[i] & K)  
  
    # clear the map  
    Map.clear()  
  
    # Check if the solution  
    # is a single operation  
    for i in range(0, n):  
      
        # If Bitwise operation between  
        #'k' and a[i] gives  
        # a number other than a[i]  
        if a[i] != b[i]: 
            Map[b[i]] = True
  
    # Check if any of the a[i]  
    # gets equal to any other element  
    # of the array after the operation.  
    for i in range(0, n):  
  
        # Single operation  
        # will be enough  
        if Map[a[i]] == True: 
            return 1
  
    # clear the map  
    Map.clear()  
  
    # Check if the solution  
    # is two operations  
    for i in range(0, n):  
      
        # Check if the array 'b'  
        # contains duplicates  
        if Map[b[i]] == True:  
            return 2
  
        Map[b[i]] = True
      
    # otherwise it is impossible to  
    # create such an array with  
    # Bitwise AND operations  
    return -1
  
# Driver code  
if __name__ == "__main__":  
  
    K = 3
    a = [1, 2, 3, 7]  
    n = len(a)  
  
    # Function call to compute the result  
    print(minOperations(a, n, K))  
  
# This code is contributed by Rituraj Jain 

