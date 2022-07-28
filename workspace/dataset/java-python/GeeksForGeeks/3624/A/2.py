

# Python3 program to find probability that  
# a rope of length L when broken into  
# n parts form a polygon.  
  
  
  
def printProbability(L, n):  
  
    p = (1 << (n-1))  
    return 1.0 - (float(n) / float(p) ) 
  
if __name__=='__main__': 
    n = 3
    L = 5
    print(printProbability(L, n)) 
  
# this code is contributed by ash264 

