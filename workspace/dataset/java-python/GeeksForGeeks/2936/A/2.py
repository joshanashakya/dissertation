

# Python3 program to find highest power  
# of 2 that divides n.  
  
def highestPowerOf2(n):  
  
    return (n & (~(n - 1)))  
  
  
#Driver code 
if __name__=='__main__': 
    n = 48
    print(highestPowerOf2(n))  
  
# this code is contributed  
# by ash264 

