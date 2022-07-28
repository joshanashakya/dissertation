

# Python3 program to find the sum 
# of all palindrome numbers 
# in the given range 
  
# pref[] array to precompute 
# the sum of all palindromic 
# number 
pref=[0]*100001
  
# Function that return number 
# num if num is palindromic 
# else return 0 
def checkPalindrome(num): 
      
    # Convert num to string 
    strr = str(num) 
    l = 0
    r = len(strr)- 1
    while (l < r): 
        if (strr[l] != strr[r]): 
            return 0
              
        l+=1
        r-=1
      
    return num 
  
  
# Function to precompute the 
# sum of all palindrome numbers 
# upto 100000 
def preCompute(): 
    for i in range(1,100001): 
        # checkPalindrome() 
        # return the number i 
        # if i is palindromic 
        # else return 0 
        pref[i] = pref[i - 1]+ checkPalindrome(i) 
      
  
  
# Function to prthe sum 
# for each query 
def printSum(L, R): 
    print(pref[R] - pref[L - 1]) 
  
  
# Function to prsum of all 
# palindromic numbers between 
# [L, R] 
def printSumPalindromic(arr,Q): 
      
    # Function that pre computes 
    # the sum of all palindromic 
    # numbers 
    preCompute() 
      
    # Iterate over all Queries 
    # to prthe sum 
    for i in range(Q): 
        printSum(arr[i][0], arr[i][1]) 
      
  
  
# Driver code 
  
# Queries 
Q = 2
arr= [[10, 13 ],[ 12, 21 ]] 
  
# Function that prthe 
# the sum of all palindromic 
# number in Range [L, R] 
printSumPalindromic(arr, Q) 
  
# This code is contributed by shivanisinghss2110 

