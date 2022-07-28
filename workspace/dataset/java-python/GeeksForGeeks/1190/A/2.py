

# Python3 implementation of the approach  
  
# Function to return the count of  
# minimum operations required  
def minOperations(a, n, K) : 
      
    map = dict.fromkeys(a,0) ;  
      
    for i in range(n) : 
  
        # Check if the initial array  
        # already contains an equal pair  
        if (map[a[i]]) : 
            return 0; 
              
        map[a[i]] = True; 
          
    # Create new array with OR operations 
    b = [0]*n;  
      
    for i in range(n) : 
        b[i] = a[i] | K;  
  
    # Clear the map  
    map.clear();  
  
    # Check if the solution  
    # is a single operation  
    for i in range(n) : 
  
        # If Bitwise OR operation between  
        # 'k' and a[i] gives  
        # a number other than a[i]  
        if (a[i] != b[i]) : 
            map[b[i]] = True;  
  
    # Check if any of the a[i]  
    # gets equal to any other element  
    # of the array after the operation  
    for i in range(n) : 
  
        # Single operation  
        # will be enough  
        if a[i] not in map : 
            pass
          
        elif (map[a[i]]) : 
            return 1;  
  
    # Clear the map  
    map.clear();  
  
    # Check if the solution  
    # is two operations  
    for i in range(n) : 
  
        # Check if the array 'b'  
        # contains duplicates  
        if (map[b[i]]) : 
            return 2;  
  
        map[b[i]] = true;  
  
    # Otherwise it is impossible to  
    # create such an array with  
    # Bitwise OR operations  
    return -1;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    K = 3;  
    a = [ 1, 9, 4, 3 ];  
    n = len(a);  
  
    # Function call to compute the result  
    print(minOperations(a, n, K));  
  
# This code is contributed by AnkitRai01 

