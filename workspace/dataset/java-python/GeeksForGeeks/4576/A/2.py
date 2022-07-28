

# Python 3 implementation of the approach 
  
# Utility function to print the  
# contents of the array 
def printArray(arr, n): 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Function to find the required array 
def findArray(q, n): 
    arr = [None] * n 
    k = 0
    for j in range(int(n / 4)): 
        ans = q[k] ^ q[k + 3] 
        arr[k + 1] = q[k + 1] ^ ans 
        arr[k + 2] = q[k + 2] ^ ans 
        arr[k] = q[k] ^ ((arr[k + 1]) ^  
                         (arr[k + 2])) 
        arr[k + 3] = q[k + 3] ^ (arr[k + 1] ^ 
                                 arr[k + 2]) 
        k += 4
  
    # Print the array 
    printArray(arr, n) 
  
# Driver code 
if __name__ == '__main__': 
    q = [4, 1, 7, 0] 
    n = len(q) 
    findArray(q, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

