

# Python program to find the sum of elements 
# of an AP in the given range 
  
# Function to find sum in the given range 
def findSum(arr, n, left, right): 
  
    # Find the value of k 
    k = right - left; 
  
    # Find the common difference 
    d = arr[1] - arr[0]; 
  
    # Find the sum 
    ans = arr[left - 1] * (k + 1); 
    ans = ans + (d * (k * (k + 1))) // 2; 
  
    return ans; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 2, 4, 6, 8, 10, 12, 14, 16 ]; 
    queries = 3; 
    q = [[ 2, 4 ],[ 2, 6 ],[ 5, 6 ]]; 
    n = len(arr); 
  
    for i in range(queries): 
        print(findSum(arr, n, q[i][0], q[i][1])); 
  
# This code is contributed by sapnasingh4991 

