

# Python 3 program to count number of  
# sub-arrays in which number of occurrence  
# of x is equal to that of y using brute force  
def sameOccurrence(arr, n, x, y): 
    result = 0
  
    # Check for each subarray for  
    # the required condition 
    for i in range(n): 
        ctX = 0
        ctY = 0
        for j in range(i, n, 1): 
            if (arr[j] == x): 
                ctX += 1; 
            elif (arr[j] == y): 
                ctY += 1
            if (ctX == ctY): 
                result += 1
  
    return (result) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 2, 3, 4, 1] 
    n = len(arr) 
    x = 2
    y = 3
    print(sameOccurrence(arr, n, x, y)) 
  
# This code is contributed by 
# Surendra_Gangwar 

