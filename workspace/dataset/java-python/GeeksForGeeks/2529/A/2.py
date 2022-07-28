

# Python implementation to find  
# Autobiographical numbers with length N  
  
from math import pow
  
# Function to return if the  
# number is autobiographical or not  
def isAutoBio(num): 
      
    # Converting the integer  
    # number to string  
    autoStr = str(num) 
  
    for i in range(0, len(autoStr)): 
          
  
        # Extracting each character  
        # from each index one by one  
        # and converting into an integer  
        index = int(autoStr[i]) 
  
        # Initialize count as 0 
        cnt = 0
  
        for j in range(0, len(autoStr)): 
          
            number = int(autoStr[j]) 
  
            # Check if it is equal to the  
            # index i if true then  
            # increment the count  
            if number == i: 
  
                # It is an  
                # Autobiographical  
                # number  
                cnt += 1
  
        # Return false if the count and  
        # the index number are not equal  
        if cnt != index: 
  
            return False
      
    return True
  
# Function to print autobiographical number  
# with given number of digits  
def findAutoBios(n): 
  
    # Left boundary of interval  
    low = int(pow(10, n-1)) 
  
    # Right boundary of interval  
    high = int(pow(10, n) - 1) 
  
    flag = 0
  
    for i in range(low, high + 1): 
        if isAutoBio(i): 
            flag = 1
            print(i, end =', ') 
  
    # Flag = 0 implies that the number  
    # is not an autobiographical no.  
    if flag == 0: 
        print("There is no Autobiographical Number with "+ str(n) + " digits") 
  
# Driver Code 
if __name__ == "__main__": 
  
    N = 0
    findAutoBios(N) 
  
    N = 4
    findAutoBios(N) 

