

# Python3 implementation of the approach  
  
# Function to print powerful integers  
def powerfulIntegers(x, y, bound) : 
  
    # Set is used to store distinct  
    # numbers in sorted order  
    s = set()  
    powersOfY = [] 
  
    # Store all the powers of y < bound  
    # in a vector to avoid calculating  
    # them again and again  
    powersOfY.append(1) 
    i = y 
    while i < bound : 
        powersOfY.append(i)  
        i *= y 
  
    i = 0
    while (True) : 
  
        # x^i  
        xPowI = pow(x, i) 
  
        # Adding any number to it  
        # will be out of bounds  
        if (xPowI >= bound) : 
            break
  
        for j in powersOfY :  
            num = xPowI + j 
  
            # If num is within limits  
            # insert it into the set  
            if (num <= bound) : 
                s.add(num) 
  
            # Break out of the inner loop  
            else : 
                break
  
        # Increment i  
        i += 1
  
    # Print the contents of the set  
    for itr in s :  
        print(itr, end = " ") 
  
# Driver code  
if __name__ == "__main__" :  
  
    x = 2
    y = 3
    bound = 10
  
    # Print powerful integers  
    powerfulIntegers(x, y, bound) 
  
# This code is contributed by Ryuga 

