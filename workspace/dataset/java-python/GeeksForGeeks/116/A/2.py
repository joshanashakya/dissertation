

# Python Program to answer queries  
# on sum of sum of odd number 
# digits of all the factors  
# of a number 
N = 100
digitSum = [0] * N 
factorDigitSum = [0] * N 
  
# finding sum of odd digit  
# number in each integer. 
def sumOddDigit() : 
    global N,digitSum,factorDigitSum 
      
    # for each number 
    for i in range(1, N) :  
          
        # using previous number 
        # sum, finding the current  
        # number num of odd digit 
        # also, adding last digit  
        # if it is odd. 
        digitSum[i] = (digitSum[int(i / 10)] 
                    + int(i & 1) * (i % 10)) 
  
# finding sum of sum of  
# odd digit of all the 
# factors of a number. 
def sumFactor() : 
    global N,digitSum,factorDigitSum  
    j = 0
      
    # for each possible factor 
    for i in range(1, N) :  
        j = i 
        while (j < N) : 
              
            # adding the contribution. 
            factorDigitSum[j] = (factorDigitSum[j] 
                                   + digitSum[i]) 
            j = j + i 
  
# Wrapper def 
def wrapper(q, n) : 
  
    global N,digitSum,factorDigitSum 
      
    for i in range(0, N) :      
        digitSum[i] = 0
        factorDigitSum[i] = 0
      
    sumOddDigit() 
    sumFactor() 
  
    for i in range(0, q) :  
        print ("{} ". 
        format(factorDigitSum[n[i]]), end = "") 
  
# Driver Code 
q = 2
n = [ 10, 36 ] 
wrapper(q, n) 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

