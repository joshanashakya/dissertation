

# Python3 program to split an array into Two 
# equal sum subarrays 
   
# Returns split point. If not possible, then 
# return -1. 
def findSplitPoint(arr, n) : 
   
    leftSum = 0 
    
    # traverse array element 
    for i in range(0, n) : 
       
        # add current element to left Sum 
        leftSum += arr[i]  
    
        # find sum of rest array elements (rightSum) 
        rightSum = 0 
        for j in range(i+1, n) : 
            rightSum += arr[j]  
    
        # split poindex 
        if (leftSum == rightSum) : 
            return i+1 
       
    
    # if it is not possible to split array into 
    # two parts 
    return -1
   
    
# Prints two parts after finding split pousing 
# findSplitPoint() 
def printTwoParts(arr, n) : 
   
    splitPo = findSplitPoint(arr, n) 
    
    if (splitPo == -1 or splitPo == n ) : 
        print ("Not Possible") 
        return
       
    for i in range(0, n) : 
        if(splitPo == i) : 
            print ("") 
        print (str(arr[i]) + ' ',end='') 
   
# driver program 
arr = [1 , 2 , 3 , 4 , 5 , 5] 
n = len(arr) 
printTwoParts(arr, n) 
  
# This code is contributed by Manish Shaw 
# (manishshaw1) 

