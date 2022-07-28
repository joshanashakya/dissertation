

# Python3 program to check for even or odd 
# using Bitwise AND operator 
  
# Returns true if n is even, else odd  
def isEven(n) :  
  
    # n&1 is 1, then odd, else even  
    return (not(n & 1));  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 101;  
    if isEven(n) : 
        print("Even") 
    else: 
        print("Odd");  
  
# This code is contributed by AnkitRai01 

