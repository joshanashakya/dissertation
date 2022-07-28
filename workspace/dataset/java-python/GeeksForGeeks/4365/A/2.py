

# Python3 program to print reverse of  
# floyd's triangle 
def printReverseFloyd(n): 
  
    curr_val = int(n*(n + 1)/2) 
    for i in range(n + 1, 1, -1): 
        for j in range(i, 1, -1): 
            print(curr_val, end ="  ") 
            curr_val -= 1
          
        print("") 
          
# Driver code 
n = 7
printReverseFloyd(n) 

