

# Python3 program to split a number into three parts such  
# than none of them is divisible by 3.  
  
def printThreeParts(N) : 
  
    # Print x = 1, y = 1 and z = N - 2  
    if (N % 3 == 0) :  
        print(" x = 1, y = 1, z = ",N - 2)  
  
    # Otherwise, print x = 1, y = 2 and z = N - 3  
    else : 
        print(" x = 1, y = 2, z = ",N - 3)  
   
  
# Driver code  
if __name__ == "__main__" :  
   
    N = 10 
    printThreeParts(N) 
  
# This code is contributed by Ryuga 

