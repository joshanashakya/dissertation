

# Python3 Program to find triplet with a minimum sum 
import sys 
  
# Function to find triplet with minimum sum 
def getMinimumSum(arr, n): 
  
    # fMin: First minimum 
    # sMin: Second minimum 
    # tMin: Third minimum 
    fMin = sys.maxsize;  
    sMin = sys.maxsize; 
    tMin = sys.maxsize; 
  
    for i in range(n): 
  
        # Update the first, second and third minimum 
        if (arr[i] < fMin): 
            tMin = sMin; 
            sMin = fMin; 
            fMin = arr[i]; 
          
        # update second and third minimum 
        elif(arr[i] < sMin): 
            tMin = sMin; 
            sMin = arr[i]; 
        elif(arr[i] < tMin): 
            tMin = arr[i]; 
          
    return (fMin + sMin + tMin); 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [ 1, 2, 3, 4, 5, -1, 5, -2]; 
    n = len(arr); 
  
    print(getMinimumSum(arr, n)); 
  
# This code is contributed by 29AjayKumar 

