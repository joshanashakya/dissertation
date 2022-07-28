

# Python3 implementation of the approach  
  
# Function to return the count of 
# required sub-arrays  
def countSubArrays(arr, n, K) : 
      
    count = 0;  
    for i in range(n) : 
        for j in range(i, n) : 
  
            bitwise_or = 0
  
            # Traverse sub-array [i..j]  
            for k in range(i, j + 1) : 
                bitwise_or = bitwise_or | arr[k]  
              
            if (bitwise_or >= K) : 
                count += 1
                  
    return count  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 3, 4, 5 ] 
    n = len(arr) 
    k = 6
      
    print(countSubArrays(arr, n, k)) 
  
# This code is contributed by Ryuga 

