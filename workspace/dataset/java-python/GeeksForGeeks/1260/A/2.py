

# Python3 implementation of the approach  
  
# Function that returns true if the  
# number formed by the last digits of  
# all the elements is divisible by 10  
def isDivisible(arr, n) :  
  
    # Last digit of the last element  
    lastDigit = arr[n - 1] % 10;  
  
    # Number formed will be divisible by 10  
    if (lastDigit == 0) :  
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 12, 65, 46, 37, 99 ];  
    n = len(arr);  
  
    if (isDivisible(arr, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

