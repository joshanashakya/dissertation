

# Python3 program to print 
# Floyd's triangle 
def loydTriangle(n): 
  
    val = 1
    for i in range(1, n + 1): 
  
        for j in range(1, i + 1): 
            print(val, end = " ") 
            val += 1
          
        print("") 
  
loydTriangle(6) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

