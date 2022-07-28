

# Python 3 program to find the count  
# of all possible N digit numbers which  
# are divisible by 5 formed from M digits 
  
# Function to find the count of all 
# possible N digit numbers which are 
# divisible by 5 formed from M digits 
def numbers(n, arr, m): 
  
    isZero = 0
    isFive = 0
    result = 0
  
    # If it is not possible to form 
    # n digit number from the given 
    # m digits without repetition 
    if (m < n) : 
        return -1
  
    for i in range(m) : 
        if (arr[i] == 0): 
            isZero = 1
  
        if (arr[i] == 5): 
            isFive = 1
  
    # If both zero and five exists 
    if (isZero and isFive) : 
        result = 2
  
        # Remaining N-1 iterations 
        for i in range( n - 1): 
            m -= 1
            result = result * (m) 
  
    elif (isZero or isFive) : 
        result = 1
  
        # Remaining N-1 iterations 
        for i in range(n - 1) : 
            m -= 1
            result = result * (m) 
    else: 
        result = -1
  
    return result 
  
# Driver code 
if __name__ == "__main__": 
    n = 3
    m = 6
  
    arr = [ 2, 3, 5, 6, 7, 9] 
  
    print(numbers(n, arr, m)) 
  
# This code is contributed by ChitraNayal 

