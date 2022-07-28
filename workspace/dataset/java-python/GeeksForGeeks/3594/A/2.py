

# Python3 implementation of the approach  
  
# Function that returns true if all  
# the array elements can be made equal  
# with the given operation  
def EqualNumbers(a, n):  
  
    for i in range(0, n):  
  
        # Divide number by 2  
        while a[i] % 2 == 0:  
            a[i] //= 2
  
        # Divide number by 3  
        while a[i] % 3 == 0:  
            a[i] //= 3
  
        if a[i] != a[0]:  
            return False
  
    return True
  
# Driver code  
if __name__ == "__main__": 
  
    a = [50, 75, 150]  
    n = len(a)  
  
    if EqualNumbers(a, n): 
        print("Yes") 
    else: 
        print("No")  
  
# This code is contributed by Rituraj Jain 

