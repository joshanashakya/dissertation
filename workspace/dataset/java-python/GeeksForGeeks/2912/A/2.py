

# Python3 implementation of the approach 
  
# Function to return the resultant digit 
# after performing the given operations 
def RSF(n): 
    while (n >= 10): 
  
        # Creating an extra copy of n 
        x = n; 
        l = 0; 
  
        # Counting the number of digits in n 
        while (n > 0): 
            n = n // 10; 
            l += 1; 
  
        # Now n is 0 
        # Creating an array of length l 
        a = [0] * l; 
  
        # Initializing i with the last index of array 
        i = l - 1; 
        while (x > 0): 
  
            # Filling array from right to left 
            a[i] = x % 10; 
            x = x // 10; 
            i -= 1; 
  
        # Calculating the absolute  
        # consecutive difference 
        for j in range(0, l - 1): 
  
            # Updating the value of n in every loop 
            n = n * 10 + abs(a[j] - a[j + 1]); 
              
    # While loop ends here and we have found 
    # the RSF value of N 
    return n; 
  
# Driver code 
if __name__ == '__main__': 
    n = 614; 
  
    # Passing n to RSF function  
    # and getting answer 
    ans = RSF(n); 
  
    # Printing the value stored in ans 
    print(ans); 
  
# This code is contributed by Rajput-Ji 

