

# Python 3 program to find sum of the series 
# 1.2.3 + 2.3.4 + 3.4.5 + ... 
  
def sumofseries(n): 
  
    res = 0
    for i in range(1, n+1):  
        res += (i) * (i + 1) * (i + 2)  
    return res 
  
# Driver Program 
print(sumofseries(3))  
  
# This code is contributed 
# by Smitha Dinesh Semwal 

