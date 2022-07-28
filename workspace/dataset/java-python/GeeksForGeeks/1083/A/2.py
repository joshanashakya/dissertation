

# Python3 program to find sum of  
# all the elements in an array 
# divisible by a given number K  
  
# Function to find sum of all  
# the elements in an array  
# divisible by a given number K 
def findSum(arr, n, k) : 
  
    sum = 0
  
    # Traverse the array  
    for i in range(n) : 
  
        # If current element is divisible  
        # by k add it to sum  
        if arr[i] % k == 0 : 
  
            sum += arr[i] 
  
    # Return calculated sum  
    return sum
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [ 15, 16, 10, 9, 6, 7, 17] 
    n = len(arr) 
    k = 3
  
    print(findSum(arr, n, k)) 
  
# This code is contributed by ANKITRAI1 

