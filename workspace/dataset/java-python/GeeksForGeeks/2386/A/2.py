

# Python 3 implementation of the approach 
  
# Function that returns true if the number 
# represented by arr[] is even in base r 
def isEven(arr, n, r): 
      
    # If the base is even, then 
    # the last digit is checked 
    if (r % 2 == 0): 
        if (arr[n - 1] % 2 == 0): 
            return True
  
    # If base is odd, then the 
    # number of odd digits are checked 
    else: 
        # To store the count of odd digits 
        oddCount = 0
        for i in range(n): 
            if (arr[i] % 2 != 0): 
                oddCount += 1
        if (oddCount % 2 == 0): 
            return True
  
    # Number is odd 
    return False
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 0] 
    n = len(arr) 
    r = 2
  
    if (isEven(arr, n, r)): 
        print("Even") 
    else: 
        print("Odd") 
  
# This code is contributed by 
# Surendra_Gangwar 

