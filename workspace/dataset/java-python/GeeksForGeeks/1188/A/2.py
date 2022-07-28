

# Python3 implementation to find if it's 
# possible to make all elements of an 
# array equal by using two operations. 
  
# Function to find if it's possible 
# to make all array elements equal 
def canMakeEqual( a, n) : 
  
    # Iterate over all numbers 
    for i in range(n) : 
  
        # If a number has a power of 5 
        # remove it 
        while (a[i] % 5 == 0) : 
            a[i] //= 5; 
          
        # If a number has a power of 3 
        # remove it 
        while (a[i] % 3 == 0) : 
            a[i] //= 3; 
  
    last = a[0]; 
  
    # Check if all elements are equal 
    # in the final array 
    for i in range(1,n) : 
        if (a[i] != last) : 
            return False; 
  
    return True; 
  
# Driver's Code 
if __name__ == "__main__" : 
  
    arr = [ 18, 30, 54, 90, 162 ]; 
  
    n = len(arr); 
  
    # Function call to check if all 
    # element in the array can be equal 
    # or not. 
    if (canMakeEqual(arr, n)) : 
        print("YES"); 
      
    else : 
        print("NO"); 
  
# This code is contributed by AnkitRai01 

