

# Python3 Code implementaton of the above approach 
  
# function to count pairs in an array  
# whose absolute difference is  
# divisible by k  
def countPairs(arr, n, k) : 
  
    # initilize count as zero.  
    cnt = 0;  
  
    # loop to count the valid pair  
    for i in range(n - 1) : 
        for j in range(i + 1, n) : 
            if ((arr[i] - arr[j] + k) % k == 0) : 
                cnt += 1;  
      
    print(cnt) ;  
  
# Driver code  
if __name__ == "__main__" : 
  
    # input array  
    arr = [3, 3, 3];  
    k = 3;  
  
    # calculate the size of array  
    n = len(arr);  
  
    # function to count the valid pair  
    countPairs(arr, n, k);  
      
# This code is contributed by AnkitRai01 

