

# Python 3 program to count the integers 
# in a range [L, R] such that 
# their digit sum is Fibonacci 
# and divisible by K 
maxSize = 100005
isFib = [False]*(maxSize) 
prefix = [0]*maxSize 
  
# Function to return the 
# digit sum of a number 
def digitSum(num): 
    s = 0
    while (num != 0): 
        s = s + num % 10
        num = num // 10
      
    return s 
  
# Function to generate all the Fibonacci 
# numbers upto maxSize 
def generateFibonacci(): 
  
    global isFib 
  
    # Adding the first two Fibonacci 
    # numbers in the set 
    prev = 0
    curr = 1
    isFib[prev] = True
    isFib[curr] = True
  
    # Computing the remaining Fibonacci 
    # numbers based on the previous 
    # two Fibonacci numbers 
    while (curr < maxSize): 
        temp = curr + prev 
        if temp < maxSize: 
            isFib[temp] = True
        prev = curr 
        curr = temp 
  
# Pre-Computation till maxSize 
# and for a given K 
def precompute(k): 
  
    generateFibonacci() 
    global prefix 
      
    for i in range(1, maxSize): 
  
        # Getting the digit sum 
        sum = digitSum(i) 
  
        # Check if the digit sum 
        # is Fibonacci and divisible by k 
        if (isFib[sum] == True
            and sum % k == 0): 
            prefix[i] += 1
  
    # Taking Prefix Sum 
    for i in range(1, maxSize): 
        prefix[i] = prefix[i]+ prefix[i - 1] 
  
# Function to perform the queries 
def performQueries(k, q,query): 
      
    # Precompute the results 
    precompute(k) 
  
    # Iterating through the queries 
    for i in range(q): 
  
        l = query[i][0] 
        r = query[i][1] 
  
        # Getting count of range 
        # in range [L, R] 
        cnt = prefix[r]- prefix[l - 1] 
        print(cnt) 
  
# Driver code 
if __name__ == "__main__": 
    query = [ [ 1, 11 ], 
            [ 5, 15 ], 
            [ 2, 24 ] ] 
    k = 2
    q = len(query) 
  
    performQueries(k, q, query) 
  
# This code is contributed by chitranayal 

