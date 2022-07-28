

# Python 3 implementation to find  
# slope of a number 
  
# function to find slope of a number 
def slopeOfNum(num, n): 
  
    # to store slope of the given 
    # number 'num' 
    slope = 0
  
    # loop from the 2nd digit up  
    # to the 2nd last digit 
    # of the given number 'num' 
    for i in range(1, n - 1) : 
  
        # if the digit is a maxima 
        if (num[i] > num[i - 1] and 
            num[i] > num[i + 1]): 
            slope += 1
  
        # if the digit is a minima 
        elif (num[i] < num[i - 1] and
              num[i] < num[i + 1]): 
            slope += 1
  
    # required slope 
    return slope 
  
# Driver Code 
if __name__ == "__main__": 
      
    num = "1213321"
    n = len(num) 
    print("Slpoe =", slopeOfNum(num, n)) 
  
# This code is contributed by ita_c 

