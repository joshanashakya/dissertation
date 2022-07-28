

# Python 3 implementation of the approach 
MAX = 100000
  
# Function to print the subsequence elements 
def prints(g1, a, g2, b): 
      
    # Prints elements of the 1st subarray 
    for i in range(a): 
        print(g1[i], end = " ") 
      
    print("and ", end = "") 
  
    # Prints elements of the 2nd subarray 
    for i in range(b): 
        print(g2[i], end = " ") 
      
    print("\n", end = "") 
  
# Function that returns true if the sum of the 
# elements of arrays g1[] and g2[] is equal 
def checksum(g1, a, g2, b): 
      
    # Adding elements of the 1st array 
    x = 0
    for i in range(0, a, 1): 
        x += g1[i] 
  
    # Subtracting elements of the 2nd array 
    for i in range(b): 
        x -= g2[i] 
  
    # If x is 0 then the sum of elements 
    # in both the arrays is equal 
    return (x == 0) 
  
# Function to find all valid subsequences 
def formgroups(arr, x, g1, a, g2, b, n): 
      
    # Base Case 
    if (x == n): 
          
        # If sum of the two subsequences 
        # is equal then print the elements 
        if (checksum(g1, a, g2, b)): 
              
            # Print the subsequences 
            prints(g1, a, g2, b) 
  
        return
  
    # Recursive Case 
  
    # Choose current element to be a 
    # part of the first subsequence 
    g1[a] = arr[x] 
    formgroups(arr, x + 1, g1, a + 1, g2, b, n) 
  
    # Choose current element to be a 
    # part of the second subsequence 
    g2[b] = arr[x] 
    formgroups(arr, x + 1, g1, a, g2, b + 1, n) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 9, 4, 5] 
    n = len(arr) 
    g1 = [0 for i in range(MAX)] 
    g2 = [0 for i in range(MAX)] 
    formgroups(arr, 0, g1, 0, g2, 0, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

