

# Python3 implementation of the approach  
from math import log2; 
  
# Function to return the number formed  
# by inverting bits the bits of num  
def invertBits(num) :  
      
    # Number of bits in num  
    x = log2(num) + 1;  
  
    # Inverting the bits one by one  
    for i in range(int(x)) :  
        num = (num ^ (1 << i));  
  
    return num;  
  
# Function to return the total valid pairs  
def totalPairs(arr1, arr2, n, m) :  
  
    # Set to store the elements of the arrays  
    s1, s2 = set(), set(); 
      
    # Insert all the elements of  
    # arr2[] in the set 
    for i in range(m) : 
        s2.add(arr2[i]); 
          
    # Initialize count variable to 0  
    count = 0; 
    for i in range(n) : 
          
        # Check if element of the first array  
        # is not in the first set 
        if arr1[i] not in s1 : 
              
            # Check if the element formed by  
            # inverting bits is in the second set  
            if invertBits(arr1[i]) in s2 : 
                  
                # Increment the count of valid pairs  
                # and insert the element in the first  
                # set so that it doesn't get counted again  
                count += 1; 
                s1.add(arr1[i]); 
      
    # Return the total number of pairs 
    return count; 
  
# Driver code  
if __name__ == "__main__" : 
  
    arr1 = [ 43, 7, 1, 99 ];  
    arr2 = [ 5, 1, 28, 20 ];  
    n = len(arr1); 
    m = len(arr2); 
  
    print(totalPairs(arr1, arr2, n, m));  
  
# This code is contributed by Ryuga 

