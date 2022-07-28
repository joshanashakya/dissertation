

# Python3 implementation of the  
# above approach 
  
# Returns the gcd after all  
# updates in the array  
def gcd(a, b):  
      
    if a == 0:  
        return b  
  
    return gcd(b % a, a)  
  
def print_gcd_online(n, m, query, arr):  
  
    # Stores the gcd of the initial  
    # array elements  
    max_gcd = 0
  
    for i in range(0, n): # calculates the gcd  
        max_gcd = gcd(max_gcd, arr[i])  
  
    # performing online queries  
    for i in range(0, m):  
  
        query[i][0] -= 1 # index is 1 based  
  
        # divide the array element  
        arr[query[i][0]] //= query[i][1]  
      
        # calculates the current gcd  
        max_gcd = gcd(arr[query[i][0]], max_gcd)  
  
        # Print the gcd after each step  
        print(max_gcd)  
  
# Driver code  
if __name__ == "__main__": 
      
    n, m = 3, 3
    query = [[1,3], [3,12], [2,4]]  
    arr = [36, 24, 72]  
          
    print_gcd_online(n, m, query, arr)  
      
# This code is contributed by Rituraj Jain 

