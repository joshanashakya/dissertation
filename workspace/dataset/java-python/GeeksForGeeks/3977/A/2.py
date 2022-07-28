

def constructLowerArray (arr, countSmaller, n): 
  
    # initialize all the counts in countSmaller array as 0  
    for i in range(n):  
        countSmaller[i] = 0;  
  
    for i in range(n): 
        for j in range(i + 1,n): 
            if (arr[j] < arr[i]): 
                countSmaller[i] += 1
  
# Utility function that prints out an array on a line 
def printArray(arr, size): 
    for i in range(size): 
        print(arr[i],end=" ") 
    print()  
  
# Driver code  
arr = [12, 10, 5, 4, 2, 20, 6, 1, 0, 2] 
n = len(arr) 
low = [0]*n 
constructLowerArray(arr, low, n) 
printArray(low, n) 
  
# This code is contributed by ApurvaRaj 

