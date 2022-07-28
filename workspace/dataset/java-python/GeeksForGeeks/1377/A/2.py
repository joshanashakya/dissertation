

# Python3 implementation of the approach  
  
# Function to return the count  
# of all valid subsequences  
def countSubSeq(arr, n, k) : 
  
    # To store the count of elements  
    # which are divisible by k  
    count = 0;  
  
    for i in range(n) :  
  
        # If current element is divisible by  
        # k then increment the count  
        if (arr[i] % k == 0) : 
            count += 1;  
  
    # Total (2^n - 1) non-empty subsequences  
    # are possible with n element  
    return (2 ** count - 1);  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 6 ];  
    n = len(arr);  
    k = 3;  
  
    print(countSubSeq(arr, n, k));  
  
# This code is contributed by AnkitRai01 

