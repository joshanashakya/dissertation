

# A naive method to find maximum of  
# minimum of all windows of different sizes  
INT_MIN = -1000000
def printMaxOfMin(arr, n):  
      
    # Consider all windows of different  
    # sizes starting from size 1  
    for k in range(1, n + 1):  
          
        # Initialize max of min for 
        # current window size k  
        maxOfMin = INT_MIN;  
  
        # Traverse through all windows  
        # of current size k  
        for i in range(n - k + 1):  
              
            # Find minimum of current window  
            min = arr[i]  
            for j in range(k):  
                if (arr[i + j] < min):  
                    min = arr[i + j] 
  
            # Update maxOfMin if required  
            if (min > maxOfMin):  
                maxOfMin = min
                  
        # Print max of min for current window size  
        print(maxOfMin, end = " ") 
  
# Driver Code 
arr = [10, 20, 30, 50, 10, 70, 30]  
n = len(arr) 
printMaxOfMin(arr, n) 
  
# This code is contributed by sahilshelangia 

