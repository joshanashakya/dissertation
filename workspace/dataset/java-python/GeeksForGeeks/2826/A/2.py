

# Python3 program for string  
# matching with * 
  
def doMatch(A, B): 
      
    for i in range(len(A)): 
          
        # if the string don't have * 
        # then character t that position 
        # must be same. 
        if A[i] != '*' and B[i] != '*': 
            if A[i] != B[i]: 
                return False
    return True
  
#Driver code 
if __name__=='__main__': 
    A = "gee*sforgeeks"
    B = "geeksforgeeks"
    print(int(doMatch(A, B))) 
  
# this code is contributed by  
# Shashank_Sharma 

