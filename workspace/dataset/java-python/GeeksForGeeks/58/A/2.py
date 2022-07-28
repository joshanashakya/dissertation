

# Python3 program to find Sum 
# of GCD over all subarrays 
from math import gcd as __gcd,log,floor 
SparseTable = [ [0 for i in range(51)] for i in range(100001)] 
  
# Build Sparse Table 
def buildSparseTable(a, n): 
    for i in range(n): 
        SparseTable[i][0] = a[i] 
  
    # Building the Sparse Table for GCD[L, R] Queries 
    for j in range(1,20): 
        for i in range(n - (1 << j)+1): 
            SparseTable[i][j] = __gcd(SparseTable[i][j - 1], 
                                SparseTable[i + (1 << (j - 1))][j - 1]) 
  
# Utility Function to calculate GCD in range [L,R] 
def queryForGCD(L, R): 
  
    # Calculating where the answer is 
    # stored in our Sparse Table 
    j = floor(log(R - L + 1, 2)) 
  
    returnValue = __gcd(SparseTable[L][j], 
                SparseTable[R - (1 << j) + 1][j]) 
  
    return returnValue 
  
  
# Utility Function to find next-farther 
# position where gcd is same 
def nextPosition(tempGCD, startPointer,prevEndPointer, n): 
    high = n - 1
    low = prevEndPointer 
    mid = prevEndPointer 
    nextPos = prevEndPointer 
  
    # BinarySearch for Next Position 
    # for EndPointer 
    while (high >= low): 
  
        mid = ((high + low) >> 1) 
  
        if (queryForGCD(startPointer, mid) == tempGCD): 
            nextPos = mid 
            low = mid + 1
        else: 
            high = mid - 1
  
    return nextPos + 1
  
# Utility function to calculate 
# sum of gcd 
def calculateSum(a, n): 
    buildSparseTable(a, n) 
  
    tempAns = 0
  
    for i in range(n): 
          
        # Initialising all the values 
        endPointer = i 
        startPointer = i 
        prevEndPointer = i 
        tempGCD = a[i] 
        while (endPointer < n): 
  
            # Finding the next position for endPointer 
            endPointer = nextPosition(tempGCD,  
                        startPointer,prevEndPointer, n) 
  
            # Adding the suitable sum to our answer 
            tempAns += ((endPointer - prevEndPointer) * tempGCD) 
  
            # Changing prevEndPointer 
            prevEndPointer = endPointer 
  
            if (endPointer < n): 
                  
                # Recalculating tempGCD 
                tempGCD = __gcd(tempGCD, a[endPointer]) 
  
    return tempAns 
  
# Driver code 
if __name__ == '__main__': 
    n = 6
  
    a = [2, 2, 2, 3, 5, 5] 
  
    print(calculateSum(a, n)) 
  
# This code is contributed by mohit kumar 29 

