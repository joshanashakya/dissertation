

# Python3 implementation of the approach  
  
# Function to return the maximum count  
# of required elements  
def findMax(arr, n) :  
  
    # divisible[i] will store true  
    # if arr[i] is divisible by  
    # any element on its right  
    divisible = [ False ] * n;  
  
    # To store the maximum required count  
    res = 0;  
  
    # For every element of the array  
    for i in range(n - 1, -1, -1) :  
  
        # If the current element is  
        # divisible by any element  
        # on its right  
        if (divisible[i]) : 
            continue;  
  
        # Find the count of element  
        # on the left which are divisible  
        # by the current element  
        cnt = 0;  
        for j in range(i) : 
  
            # If arr[j] is divisible then  
            # set divisible[j] to true  
            if ((arr[j] % arr[i]) == 0) : 
                divisible[j] = True;  
                cnt += 1;  
  
        # Update the maximum required count  
        res = max(res, cnt);  
  
    return res;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 8, 1, 28, 4, 2, 6, 7 ];  
    n = len(arr);  
  
    print(findMax(arr, n));  
  
# This code is contributed by kanugargng 

