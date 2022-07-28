

# Python3 program to equally divide n elements 
# into two sets such that second set has 
# maximum distinct elements. 
def distribution(arr, n): 
    resources = set() 
      
    # Insert all the resources in the set 
    # There will be unique resources in the set 
    for i in range(n): 
        resources.add(arr[i]); 
  
        # return minimum of distinct resources 
        # and n/2 
    return min(len(resources), n // 2); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 1, 1, 2, 1, 3, 4 ]; 
    n = len(arr); 
    print(distribution(arr, n), ""); 
      
# This code is contributed by PrinciRaj1992 

