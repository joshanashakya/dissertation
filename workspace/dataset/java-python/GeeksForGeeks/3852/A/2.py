

# Python3 implementation of the approach  
  
def findIndices(arr, n) : 
    leftMin, rightMin = 0, 0
    leftMax, rightMax = 0, 0
  
    min_element = arr[0] 
    max_element = arr[0] 
    for i in range(n) : 
  
        # If found new minimum  
        if (arr[i] < min_element) : 
            leftMin = rightMin = i  
            min_element = arr[i] 
      
        # If arr[i] = min then rightmost  
        # index for min will change  
        elif (arr[i] == min_element) : 
            rightMin = i  
  
        # If found new maximum  
        if (arr[i] > max_element) :  
            leftMax = rightMax = i  
            max_element = arr[i] 
          
        # If arr[i] = max then rightmost  
        # index for max will change  
        elif (arr[i] == max_element) :  
            rightMax = i 
    print("Minimum left : ", leftMin)  
    print("Minimum right : ", rightMin)  
    print("Maximum left : ", leftMax )  
    print("Maximum right : ", rightMax) 
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 2, 1, 1, 2, 1, 5, 6, 5 ]  
    n = len(arr) 
  
    findIndices(arr, n)  
  
# This code is contributed by Ryuga  

