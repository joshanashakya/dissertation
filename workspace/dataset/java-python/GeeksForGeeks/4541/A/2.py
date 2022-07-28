

# Python program to print 
# the pyramid pattern 
  
# Print the pattern upto n 
def printPattern(n): 
  
    # Printing upper part 
    for i in range(n+1):  
      
        for j in range(1,i+1): 
            print(i,end="")         
        print("") 
      
    # printing lower part 
    for i in range(n - 1,0,-1):  
      
        for j in range(i,0,-1):  
            print(i,end="")         
        print("") 
  
# driver code 
n = 8
printPattern(n) 
  
# This code is contributed 
# by Anant Agarwal. 

