

# Python3 Implementation of above approach 
  
# function to Count pairs in an array whose 
# absolute difference is divisible by k 
def countPair(arr, n, k): 
  
    # intialize the count 
    cnt = 0; 
  
    # making every element of arr in 
    # range 0 to k - 1 
    for i in range(n): 
        arr[i] = (arr[i] + k) % k; 
  
    # create an array hash 
    hash = [0]*k; 
  
    # store to count of element of arr 
    # in hash 
    for i in range(n): 
        hash[arr[i]] += 1; 
  
    # count the pair whose absolute 
    # difference is divisible by k 
    for i in range(k): 
        cnt += (hash[i] * (hash[i] - 1)) / 2; 
  
    # prthe value of count 
    print(int(cnt)); 
  
# Driver Code 
if __name__ == '__main__': 
  
    # input array 
    arr = [1, 2, 3, 4]; 
    k = 2; 
  
    # calculate the size of array 
    n = len(arr); 
    countPair(arr, n, k); 
  
# This code is contributed by 29AjayKumar 

