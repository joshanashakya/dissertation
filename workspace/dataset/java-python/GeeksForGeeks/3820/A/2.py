

# Python 3 implementation of the approach 
  
# Function to return the number 
# of set bits in n 
def setBits(n): 
    count = 0
  
    while (n): 
        n = n & (n - 1) 
        count += 1
  
    return count 
  
# Function to return the count 
# of required pairs 
def countPairs(a, n): 
    count = 0
  
    for i in range(0, n - 1, 1): 
          
        # Set bits for first element  
        # of the pair 
        setbits_x = setBits(a[i]) 
  
        for j in range(i + 1, n, 1): 
              
            # Set bits for second element  
            # of the pair 
            setbits_y = setBits(a[j]) 
  
            # Set bits of the resultant number 
            # which is the XOR of both the  
            # elements of the pair 
            setbits_xor_xy = setBits(a[i] ^ a[j]); 
  
            # If the condition is satisfied 
            if (setbits_x + 
                setbits_y == setbits_xor_xy): 
                  
                # Increment the count 
                count += 1
  
    # Return the total count 
    return count 
  
# Driver code 
if __name__ == '__main__': 
    a = [2, 3, 4, 5, 6] 
  
    n = len(a) 
    print(countPairs(a, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

