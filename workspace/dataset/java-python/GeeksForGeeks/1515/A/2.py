

# Python3 implementation of the approach  
import sys 
  
# Function to return the minimum  
# deletions to get minimum OR  
def findMinDel(arr, n) :  
  
    # To store the minimum element  
    min_num = sys.maxsize;  
  
    # Find the minimum element  
    # from the array  
    for i in range(n) : 
        min_num = min(arr[i], min_num);  
  
    # To store the frequency of  
    # the minimum element  
    cnt = 0;  
  
    # Find the frequency of the  
    # minimum element  
    for i in range(n) :  
        if (arr[i] == min_num) : 
            cnt += 1;  
  
    # Return the final answer  
    return n - cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 3, 2 ]; 
    n = len(arr); 
      
    print(findMinDel(arr, n));  
  
# This code is contributed by AnkitRai01 

