

# Python3 implementation of the approach  
  
# To store the count of  
# negative integers  
cnt_neg = 0;  
  
# Check if zero exists  
exists_zero = None;  
  
# Function to find the count of  
# negative integers and check  
# if zero exists in the array  
def preProcess(arr, n) :  
    global cnt_neg 
      
    for i in range(n) : 
        if (arr[i] < 0) : 
            cnt_neg += 1; 
          
        if (arr[i] == 0) : 
            exists_zero = True;  
  
# Function that returns true if array  
# elements can be made positive by  
# changing signs exactly k times  
def isPossible(k) :  
  
    if (not exists_zero) : 
        if (k >= cnt_neg and (k - cnt_neg) % 2 == 0) : 
            return True;  
        else : 
            return False;  
      
    else : 
        if (k >= cnt_neg) :  
            return True;  
        else : 
            return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ -1, 2, -3, 4, 5 ];  
    n = len(arr);  
  
    # Pre-processing  
    preProcess(arr, n);  
  
    queries = [ 1, 2, 3, 4 ];  
    q = len(queries);  
  
    # Perform queries  
    for i in range(q) : 
        if (isPossible(queries[i])) : 
            print("Yes");  
        else : 
            print("No");  
  
# This code is contributed by AnkitRai01 

