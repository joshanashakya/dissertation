

# Python 3 implementation of above approach 
  
# Function to count the elements 
# with maximum number of divisors 
def MaximumDivisors(X, Y): 
  
    # to store number of divisors 
    # initialise with zero 
    arr = [0] * (Y - X + 1) 
  
    # to store the maximum  
    # number of divisors 
    mx = 0
  
    # to store required answer 
    cnt = 0
  
    i = 1
    while i * i <= Y : 
        sq = i * i 
  
        # Find the first divisible number 
        if ((X // i) * i >= X) : 
            first_divisible = (X // i) * i 
        else: 
            first_divisible = (X // i + 1) * i 
  
        # Count number of divisors 
        for j in range(first_divisible, Y + 1, i): 
            if j < sq : 
                continue
            elif j == sq : 
                arr[j - X] += 1
            else: 
                arr[j - X] += 2
        i += 1
  
    # Find number of elements with 
    # maximum number of divisors 
    for i in range(X, Y + 1): 
        if arr[i - X] > mx : 
            cnt = 1
            mx = arr[i - X] 
  
        elif arr[i - X] == mx : 
            cnt += 1
  
    return cnt 
  
# Driver code 
if __name__ == "__main__": 
    X = 1
    Y = 10
    print(MaximumDivisors(X, Y)) 
  
# This code is contributed  
# by ChitraNayal 

