

# Python3 Program to find triplet with minimum sum 
import sys 
  
# Function to find triplet with minimum sum 
def getMinimumSum(arr, n): 
    ans = sys.maxsize; 
  
    # Generate all possible triplets 
    for i in range(n - 2): 
        for j in range(i + 1, n - 1): 
            for k in range(j + 1, n): 
                  
                # Calculate sum of each triplet 
                # and update minimum 
                ans = min(ans, arr[i] + arr[j] + arr[k]); 
    return ans; 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [ 1, 2, 3, 4, 5, -1, 5, -2 ]; 
    n = len(arr); 
  
    print(getMinimumSum(arr, n)); 
      
# This code is contributed by PrinciRaj1992 

