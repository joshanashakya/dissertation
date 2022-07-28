

# Python 3 implementation of the approach  
  
# Function to return the element from the array  
# which has the maximum set bits  
def maxBitElement(arr, n): 
      
    # To store the required element and  
    # the maximum set bits so far  
    num = 0
    max = -1
  
    for i in range(n): 
          
        # Count of set bits in  
        # the current element  
        cnt = bin(arr[i]).count('1') 
  
        # Update the max  
        if (cnt > max): 
            max = cnt 
            num = arr[i] 
    return num 
  
# Driver code  
if __name__ == '__main__': 
    arr = [3, 2, 4, 7, 1,  
          10, 5, 8, 9, 6]  
    n = len(arr) 
      
    print(maxBitElement(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

