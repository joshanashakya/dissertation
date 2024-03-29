

# Python3 program to find the sum  
# of all armstrong  numbers  
# in the given range  
  
# pref[] array to precompute  
# the sum of all armstrong   
# number  
pref =[0]*100001
  
# Function that return number  
# num if num is armstrong   
# else return 0  
def checkArmstrong(x):  
    n = len(str(x)) 
    sum1 = 0  
    temp = x   
    while temp > 0:  
        digit = temp % 10
        sum1 += digit **n  
        temp //= 10
    if sum1 == x: 
        return x 
    return 0
  
# Function to precompute the  
# sum of all armstrong  numbers  
# upto 100000  
def preCompute():  
    for i in range(1, 100001):  
        # checkarmstrong ()  
        # return the number i  
        # if i is armstrong   
        # else return 0  
        pref[i] = pref[i - 1]+ checkArmstrong(i)  
  
  
# Function to prthe sum  
# for each query  
def printSum(L, R):  
    print(pref[R] - pref[L - 1])  
  
# Function to prsum of all  
# armstrong  numbers between  
# [L, R]  
def printSumarmstrong (arr, Q):  
      
    # Function that pre computes  
    # the sum of all armstrong   
    # numbers  
    preCompute()  
      
    # Iterate over all Queries  
    # to prthe sum  
    for i in range(Q):  
        printSum(arr[i][0], arr[i][1])  
      
# Driver code  
  
# Queries  
Q = 2
arr = [[1, 13 ], [ 121, 211 ]]  
  
# Function that prthe  
# the sum of all armstrong   
# number in Range [L, R]  
printSumarmstrong (arr, Q)  

