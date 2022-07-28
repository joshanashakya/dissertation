

# Python 3 program to find  
# floor and ceiling in an 
# unsorted array. 
  
import sys 
  
# Function to floor and 
# ceiling of x in arr[] 
def floorAndCeil(arr, n, x): 
  
    # Distances of current 
    # floor and ceiling 
    fDist = sys.maxsize 
    cDist = sys.maxsize 
  
    for i in range(n): 
      
        # If current element is closer  
        # than previous ceiling. 
        if (arr[i] >= x and 
            cDist > (arr[i] - x)): 
          
            cInd = i 
            cDist = arr[i] - x 
  
        # If current element is closer  
        # than previous floor. 
        if (arr[i] <= x and fDist > (x - arr[i])): 
          
            fInd = i 
            fDist = x - arr[i] 
  
    if (fDist == sys.maxsize): 
        print("Floor doesn't exist ") 
    else: 
        print("Floor is " + str(arr[fInd]))  
  
    if (cDist == sys.maxsize): 
        print( "Ceil doesn't exist ") 
    else: 
        print("Ceil is " + str(arr[cInd])) 
  
# Driver code 
if __name__ == "__main__": 
    arr = [5, 6, 8, 9, 6, 5, 5, 6] 
    n = len(arr) 
    x = 7
    floorAndCeil(arr, n, x) 
  
# This code is contributed  
# by ChitraNayal 

