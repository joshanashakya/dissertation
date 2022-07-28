

# Python3 implementation of the  
# above approach  
  
# Function to find minimum removals  
def findCount(arr, n) : 
      
    # Count odd numbers  
    countOdd = 0;  
    for i in range(n) :  
        if (arr[i] % 2 == 1) : 
            countOdd += 1;  
  
    # If the counter is odd return 0  
    # otherwise return 1  
    if (countOdd % 2 == 0) :  
        return 1;  
    else : 
        return 0;  
  
# Driver Code  
if __name__ == "__main__" :  
    arr = [ 1, 2, 3, 5, 1 ];  
    n = len(arr) ; 
  
    print(findCount(arr, n));  
  
# This code is contributed by Ryuga 

