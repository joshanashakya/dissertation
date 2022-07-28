

# Python3 program to check if a number is  
# pandigital in given base.  
  
# Return true if n is pandigit else return false.  
def checkPandigital(b, n):  
  
    # Checking length is less than base  
    if (len(n) < b):  
        return 0;  
  
    hash = [0] * b; 
      
    # Traversing each digit of the number.  
    for i in range(len(n)):  
          
        # If digit is integer  
        if (n[i] >= '0' and n[i] <= '9'):  
            hash[ord(n[i]) - ord('0')] = 1;  
  
        # If digit is alphabet  
        elif (ord(n[i]) - ord('A') <= b - 11):  
            hash[ord(n[i]) - ord('A') + 10] = 1;  
  
    # Checking hash array, if any index is  
    # unmarked.  
    for i in range(b):  
        if (hash[i] == 0):  
            return 0;  
  
    return 1; 
  
# Driver Code 
b = 13;  
n = "1298450376ABC";  
  
if(checkPandigital(b, n)):  
    print("Yes");  
else: 
    print("No");  
                  
# This code is contributed by mits 

