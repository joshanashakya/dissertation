

# Python3 implementation of the approach  
  
# Function to return the count  
# of possible subsets  
def cntSubsets(arr, n) :  
  
    a = [0] * n 
    b = [0] * n;  
  
    a[0] = b[0] = 1;  
  
    for i in range(1, n) : 
          
        # If previous element was 0 then 0  
        # as well as 1 can be appended  
        a[i] = a[i - 1] + b[i - 1];  
  
        # If previous element was 1 then  
        # only 0 can be appended  
        b[i] = a[i - 1];  
  
    # Store the count of all possible subsets  
    result = a[n - 1] + b[n - 1];  
  
    return result;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 5, 7 ];  
    n = len(arr);  
  
    print(cntSubsets(arr, n));  
  
# This code is contributed by AnkitRai01 

