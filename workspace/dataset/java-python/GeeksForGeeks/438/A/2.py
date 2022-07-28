

# Python3 implementation of the approach  
  
# Function to return the count of required pairs  
def count(arr, n, k) : 
  
    # Sort the given array  
    arr.sort();  
  
    # To store the required count  
    cnt = 0;  
    i = 0; j = 1;  
  
    while (i < n and j < n) : 
  
        # Update j such that it is always > i  
        if j <= i : 
            j = i + 1
        else : 
            j = j 
  
        # Find the first element arr[j] such that  
        # (arr[j] - arr[i]) >= K  
        # This is because after this element, all  
        # the elements will have absolute differecne  
        # with arr[i] >= k and the count of  
        # valid pairs will be (n - j)  
        while (j < n and (arr[j] - arr[i]) < k) : 
            j += 1;  
  
        # Update the count of valid pairs  
        cnt += (n - j);  
  
        # Get to the next element to repeat the steps  
        i += 1;  
  
    # Return the count  
    return cnt;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4 ];  
    n = len(arr);  
    k = 2;  
  
    print(count(arr, n, k));  
      
# This code is contributed by AnkitRai01 

