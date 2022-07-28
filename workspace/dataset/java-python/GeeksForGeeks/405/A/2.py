

# Python3 program to find maximum circular  
# subarray sum of size k  
  
# Function to calculate  
# maximum sum  
def maxCircularSum(arr, n, k) : 
  
    # k must be greater  
    if (n < k) : 
        print("Invalid");  
        return;  
  
    sum = 0; start = 0; end = k - 1;  
  
    # calculate the sum of first k elements.  
    for i in range(k) : 
        sum += arr[i];  
  
    ans = sum;  
  
    for i in range(k, n + k) : 
  
        # add current element to sum  
        # and subtract the first element  
        # of the previous window.  
        sum += arr[i % n] - arr[(i - k) % n];  
  
        if (sum > ans) : 
            ans = sum;  
            start = (i - k + 1) % n;  
            end = i % n;  
  
    print("max circular sum = ",ans);  
    print("start index = ", start,  
          "\nend index = ", end);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [ 18, 4, 3, 4, 5, 6, 7, 8, 2, 10 ];  
    n = len(arr);  
    k = 3;  
  
    maxCircularSum(arr, n, k);  
  
# This code is contributed by AnkitRai01 

