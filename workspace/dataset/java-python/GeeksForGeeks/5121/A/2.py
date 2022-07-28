

# Python3 implementation of the approach  
  
# Function to find the valid indices  
def find_idx(arr, n):  
  
    # List to store the indices  
    answer=[]  
  
    # Initialise sum with 0  
    _sum = 0
  
    # Starting from the last element  
    for i in range(n - 1, -1, -1): 
  
        # If sum till now is equal to  
        # the current element  
        if (_sum == arr[i]) :  
            answer.append(i)  
  
        # Add current element to the sum  
        _sum += arr[i]  
  
    if (len(answer) == 0) :  
        print(-1)  
        return
  
    for i in range(len(answer) - 1, -1, -1):  
        print(answer[i], end = " ")  
  
# Driver code  
arr = [ 36, 2, 17, 6, 6, 5 ]  
n = len(arr)  
  
find_idx(arr, n) 
  
# This code is contributed by 
# divyamohan123 

