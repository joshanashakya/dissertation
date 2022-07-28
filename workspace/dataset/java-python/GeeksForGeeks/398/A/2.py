

# Python3 implementation of the approach  
  
# Function to find the required subsequence  
def findSubSeq(arr, n, sum) :  
  
    for i in range(n - 1, -1, -1) : 
  
        # Current element cannot be a part  
        # of the required subsequence  
        if (sum < arr[i]) : 
            arr[i] = -1;  
  
        # Include current element in  
        # the requried subsequence  
        # So update the sum  
        else : 
            sum -= arr[i];  
  
    # Print the elements of the  
    # required subsequence  
    for i in range(n) : 
  
        # If the current element was  
        # included in the subsequence  
        if (arr[i] != -1) : 
            print(arr[i], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 17, 25, 46, 94, 201, 400 ];  
    n = len(arr);  
    sum = 272;  
  
    findSubSeq(arr, n, sum);  
  
# This code is contributed by kanugargng 

