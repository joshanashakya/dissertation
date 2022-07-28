

# Python3 implementation of the approach  
  
# Function to print A and B all of whose  
# divisors are present in the given array  
def printNumbers(arr, n):  
  
    # Sort the array  
    arr.sort()  
  
    # A is the largest element from the array  
    A, B = arr[n - 1], -1
  
    # Iterate from the second largest element  
    for i in range(n - 2, -1, -1):  
  
        # If current element is not a divisor  
        # of A then it must be B  
        if A % arr[i] != 0:  
            B = arr[i]  
            break
  
        # If current element occurs more than once  
        if i - 1 >= 0 and arr[i] == arr[i - 1]:  
            B = arr[i]  
            break
  
    # Print A and B  
    print("A =", A, ", B =", B)  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [1, 2, 4, 8, 16, 1, 2, 4]  
    n = len(arr)  
    printNumbers(arr, n) 
  
# This code is contributed by Rituraj Jain 

