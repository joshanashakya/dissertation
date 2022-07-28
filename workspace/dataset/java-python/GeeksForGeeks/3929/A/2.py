

# Python3 program for minimizing graph  
  
# Utility function for finding min of a row  
def minFn(arr):  
  
    minimum = float('inf')  
      
    for i in range(0, 4):  
        if minimum > arr[i]:  
            minimum = arr[i]  
    return minimum 
  
# Utility function for minimizing graph  
def minimizeGraph(arr):  
  
    # Set empty edges to INT_MAX  
    for i in range(0, 4):  
        for j in range(0, 4):  
            if arr[i][j] == 0:  
                arr[i][j] = float('inf')  
  
    # Finding minimum of each row  
    # and deleting rest of edges  
    for i in range(0, 4):  
          
        # Find minimum element of row  
        minimum = minFn(arr[i])  
          
        for j in range(0, 4): 
              
            # If edge value is not min  
            # set it to zero, also  
            # edge value INT_MAX denotes that  
            # initially edge value was zero  
            if ((not(arr[i][j] == minimum)) or 
                    (arr[i][j] == float('inf'))):  
                arr[i][j] = 0
            else: 
                minimum = 0
          
    # Print result  
    for i in range(0, 4):  
        for j in range(0, 4):  
            print(arr[i][j], end = " ")  
        print()  
  
# Driver Code  
if __name__ == "__main__":  
      
    # Input Graph  
    arr = [[1, 2, 4, 0],  
           [0, 0, 0, 5],  
           [0, 2, 0, 3],  
           [0, 0, 0, 0]]  
      
    minimizeGraph(arr)  
      
# This code is contributed by  
# Rituraj Jain 

