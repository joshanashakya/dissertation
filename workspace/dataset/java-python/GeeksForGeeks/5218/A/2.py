

# Python3 program to print a, b and c 
# such that a+b+c=N 
  
# Function to print a, b and c 
def printCombination(n): 
    print("1 ",end=""); 
  
    # check if n-2 is divisible 
    # by 3 or not 
    if ((n - 2) % 3 == 0): 
        print("2",n - 3,end=""); 
    else: 
        print("1",(n - 2),end=""); 
  
# Driver code 
if __name__=='__main__': 
    n = 233; 
  
    printCombination(n); 
  
# This code is contributed by mits 

