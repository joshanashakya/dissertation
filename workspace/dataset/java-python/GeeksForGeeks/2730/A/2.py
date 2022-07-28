

# Python3 implementation of the approach  
  
# Function that returns false if the  
# number passed as argument contains  
# digit(s) other than '0' or '1'  
def isBinary(n):  
  
    while n != 0:  
        temp = n % 10
        if temp != 0 and temp != 1:  
            return False
          
        n = n // 10
      
    return True
  
# Function that checks whether the  
# binary string can be formed or not  
def formBinaryStr(n, a): 
  
    flag = True
  
    # Empty string for storing  
    # the binary number  
    s = ""  
    for i in range(0, n):  
  
        # check if a[i] can be a  
        # part of the binary string  
        if isBinary(a[i]) == True:  
              
            # Conversion of int into string  
            s += str(a[i])  
          
        else:  
            # if a[i] can't be a part  
            # then break the loop  
            flag = False
            break
  
    # possible to create binary string  
    if flag == True: 
        print(s)  
  
    # impossible to create binary string  
    else: 
        cout << "-1\n"
  
# Driver code  
if __name__ == "__main__":  
  
    a = [10, 1, 0, 11, 10]  
    N = len(a)  
  
    formBinaryStr(N, a)  
  
# This code is contributed by Rituraj Jain  

