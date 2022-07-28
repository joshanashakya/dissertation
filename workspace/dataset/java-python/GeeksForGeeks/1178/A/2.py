

# Python implementation of the approach  
MAXN = 1000005; 
even = [0] * MAXN; 
odd = [0] * MAXN; 
  
# Function to precompute the count 
# of even and odd numbers 
def precompute(arr, n): 
  
    for i in range(n): 
  
        # If the current element is odd 
        # then put 1 at odd[i] 
        if (arr[i] % 2 == 1): 
            odd[i] = 1; 
  
        # If the current element is even 
        # then put 1 at even[i] 
        if (arr[i] % 2 == 0): 
            even[i] = 1; 
      
    # Taking the prefix sums of these two arrays 
    # so we can get the count of even and odd 
    # numbers in a range [L, R] in O(1) 
    for i in range(1, n): 
        even[i] = even[i] + even[i - 1]; 
        odd[i] = odd[i] + odd[i - 1]; 
      
# Function that returns True if the bitwise 
# AND of the subarray a[L...R] is odd 
def isOdd(L, R): 
  
    # cnt will store the count of odd 
    # numbers in the range [L, R] 
    cnt = odd[R]; 
    if (L > 0): 
        cnt -= odd[L - 1]; 
  
    # Check if all the numbers in 
    # the range are odd or not 
    if (cnt == R - L + 1): 
        return True; 
  
    return False; 
  
# Function to perform the queries 
def performQueries(a, n, q, m): 
    precompute(a, n); 
  
    # Perform queries 
    for i in range(m): 
        L = q[i][0]; 
        R = q[i][1]; 
        if (isOdd(L, R)): 
            print("Odd"); 
        else: 
            print("Even"); 
      
# Driver code 
if __name__ == '__main__': 
    a = [ 2, 1, 5, 7, 6, 8, 9 ]; 
    n = len(a); 
  
    # Queries 
    q = [[ 0, 2 ],[ 1, 2 ],[ 2, 3 ],[ 3, 6 ]]; 
    m = len(q); 
  
    performQueries(a, n, q, m); 
      
# This code is contributed by PrinciRaj1992 

