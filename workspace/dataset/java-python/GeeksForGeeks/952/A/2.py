

# Python3 program to count number of  
# sub-arrays in which number of occurrence  
# of x is equal to that of y using efficient  
# approach in terms of time */ 
def sameOccurrence( arr, n, x, y): 
  
    countX = [0 for i in range(n)] 
    countY = [0 for i in range(n)] 
  
    # To store counts of same diffs 
    m = dict()  
  
    # Count occurrences of x and y 
    for i in range(n): 
        if (arr[i] == x): 
            if (i != 0): 
                countX[i] = countX[i - 1] + 1
            else: 
                countX[i] = 1
        else: 
            if (i != 0): 
                countX[i] = countX[i - 1] 
            else: 
                countX[i] = 0
  
        if (arr[i] == y): 
            if (i != 0): 
                countY[i] = countY[i - 1] + 1
            else: 
                countY[i] = 1
        else: 
            if (i != 0): 
                countY[i] = countY[i - 1] 
            else: 
                countY[i] = 0
          
        # Increment count of current 
        m[countX[i] - countY[i]] = m.get(countX[i] - 
                                         countY[i], 0) + 1
      
    # Traverse map and commute result.  
    result = m[0] 
    for j in m: 
        result += (m[j] * (m[j] - 1)) // 2
      
    return result 
  
# Driver code 
arr = [1, 2, 2, 3, 4, 1] 
n = len(arr) 
x, y = 2, 3
print(sameOccurrence(arr, n, x, y)) 
   
# This code is contributed 
# by mohit kumar 

