

   
# Python3 program to print a consecutive 
# sequence to express N if possible. 
  
# Print consecutive numbers  
# from last to first 
def printConsecutive(last, first): 
    print (first, end = "") 
    first += 1
    for x in range(first, last + 1): 
        print (" +", x, end = "") 
  
def findConsecutive(N): 
    for last in range(1, N): 
          
        for first in range(0, last): 
              
            if 2 * N == (last - first) * (last + first + 1): 
                print (N, "= ", end = "") 
                printConsecutive(last, first + 1) 
                return
    print ("-1") 
  
# Driver code 
n = 12
findConsecutive(n) 
  
# This code is contributed by Shreyanshi Arun. 

