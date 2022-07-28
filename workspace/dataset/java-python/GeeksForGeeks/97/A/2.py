

# Python3 program to check for even or odd  
# using Bitwise XOR operator  
  
# Returns true if n is even, else odd  
def isEven( n) :  
  
    # n^1 is n+1, then even, else odd  
    if (n ^ 1 == n + 1) : 
        return True;  
    else : 
        return False;  
  
# Driver code  
if __name__ == "__main__" :  
    n = 100;  
    print("Even") if isEven(n) else print( "Odd");  
  
# This code is contributed by AnkitRai01 

