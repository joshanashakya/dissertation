

# Python3 implementation of the approach  
  
# Function to return the minimized sum  
def minSum(arr, n, x):  
  
    Sum = 0
  
    # To store the largest element  
    # from the array which is  
    # divisible by x  
    largestDivisible, minimum = -1, arr[0]  
    for i in range(0, n):  
  
        # Sum of array elements before  
        # performing any operation  
        Sum += arr[i]  
  
        # If current element is divisible by x  
        # and it is maximum so far  
        if(arr[i] % x == 0 and 
           largestDivisible < arr[i]):  
            largestDivisible = arr[i]  
  
        # Update the minimum element  
        if arr[i] < minimum: 
            minimum = arr[i]  
  
    # If no element can be reduced then there's  
    # no point in performing the operation as 
    # we will end up increasing the sum when an  
    # element is multiplied by x  
    if largestDivisible == -1:  
        return Sum
  
    # Subtract the chosen elements from the 
    # sum and then add their updated values  
    sumAfterOperation = (Sum - minimum - largestDivisible + 
                        (x * minimum) + (largestDivisible // x))  
  
    # Return the minimized sum  
    return min(Sum, sumAfterOperation)  
  
# Driver code  
if __name__ == "__main__":  
  
    arr = [5, 5, 5, 5, 6]  
    n = len(arr) 
    x = 3
    print(minSum(arr, n, x))  
  
# This code is contributed by Rituraj Jain 

