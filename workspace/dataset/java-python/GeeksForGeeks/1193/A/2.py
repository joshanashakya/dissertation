

# Python3 program to Print 
# numbers from 1 to n  
  
def printNos(n): 
    if n > 0: 
        printNos(n - 1) 
        print(n, end = ' ') 
  
# Driver code  
printNos(100) 
  
# This code is contributed by Smitha Dinesh Semwal 

