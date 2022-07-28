

# Python3 code to find the  
# maximum possible effort 
    
# Function to get no of  
# set bits in binary  
# representation of positive 
# integer n 
def countSetBits(n) : 
    count = 0
    while (n) : 
        count += n & 1
        n >>= 1
    return count 
    
# Driver code 
i = 3
print (countSetBits(i)) 
    
# This code is contributed by  
# Manish Shaw(manishshaw1) 

