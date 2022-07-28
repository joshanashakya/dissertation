

# Python 3 implementation of the approach 
  
# Function to return the count of 
# rectangles when n is odd 
def countOdd(n): 
    coun = 0
    i = n - 2
    while (i >= 1): 
        if (i & 1): 
            # Calculating number of dots 
            # in vertical level 
            m = int((n - i) / 2) 
  
            # Calculating number of ways 
            # to select two points in the 
            # horizontal level i 
            j = int((i * (i + 1)) / 2) 
  
            # Multiply both to obtain the number of 
            # rectangles formed at that level 
            coun += j * m 
        else: 
            # Calculating number of dots 
            # in vertical level 
            m = int(((n - 1) - i) / 2) 
  
            # Calculating number of ways 
            # to select two points in the 
            # horizontal level i 
            j = int((i * (i + 1)) / 2) 
  
            # Multiply both to obtain the number of 
            # rectangles formed at that level 
            coun += j * m 
  
        i -= 1
          
    return coun 
  
# Function to return the count of 
# rectangles when n is even 
def countEven(n): 
    coun = 0
    i = n - 2
    while(i >= 1): 
        if (i & 1): 
            m = int(((n - 1) - i) / 2) 
            j = int((i * (i + 1)) / 2) 
            coun += j * m 
          
        else: 
            m = int((n - i) / 2) 
            j = (i * (i + 1)) // 2
            coun += j * m 
        
    return coun 
  
# Driver code 
if __name__ == '__main__': 
    n = 5
  
    # If n is odd 
    if (n & 1): 
        print(countOdd(n)) 
    else: 
        print(countEven(n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

