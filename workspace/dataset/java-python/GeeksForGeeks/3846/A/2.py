

# Python3 implementation of efficient algorithm  
# to find greater or same element on left side  
  
# Prints greater elements  
# on left side of every element  
def printPrevGreater(arr, n):  
  
    s = set() 
    for i in range(0, n):  
  
        # First search in set  
        it = [x for x in s if x >= arr[i]]  
        if len(it) == 0: # If no greater found  
            print("-1", end = " ")  
        else:                  
            print(min(it), end = " ")          
  
        # Then insert  
        s.add(arr[i])  
  
# Driver Code 
if __name__ == "__main__":  
  
    arr = [10, 5, 11, 10, 20, 12]  
    n = len(arr)  
    printPrevGreater(arr, n)  
      
# This code is contributed by Rituraj Jain 

