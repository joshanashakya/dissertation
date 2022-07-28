

# Python3 Program to find Lexicographically Kth  
# smallest way to reach given coordinate from origin  
  
# Return (a+b)!/a!b!  
def factorial(a, b):  
  
    res = 1
  
    # finding (a+b)!  
    for i in range(1, a + b + 1):  
        res = res * i  
  
    # finding (a+b)!/a!  
    for i in range(1, a + 1):  
        res = res // i  
  
    # finding (a+b)!/b!  
    for i in range(1, b + 1):  
        res = res // i  
  
    return res  
  
# Return the Kth smallest way to reach 
# given coordinate from origin  
def Ksmallest(x, y, k):  
  
    # if at origin  
    if x == 0 and y == 0:  
        return
  
    # if on y-axis  
    elif x == 0: 
        # decrement y.  
        y -= 1
  
        # Move vertical  
        print("V", end = "")  
  
        # recursive call to take next step.  
        Ksmallest(x, y, k)  
      
    # If on x-axis  
    elif y == 0: 
          
        # decrement x.  
        x -= 1
  
        # Move horizontal.  
        print("H", end = "")  
  
        # recursive call to take next step.  
        Ksmallest(x, y, k)  
      
    else: 
          
        # If x + y C x is greater than K  
        if factorial(x - 1, y) > k:  
              
            # Move Horizontal  
            print("H", end = "") 
  
            # recursive call to take next step.  
            Ksmallest(x - 1, y, k)  
          
        else: 
              
            # Move vertical  
            print("V", end = "")  
  
            # recursive call to take next step.  
            Ksmallest(x, y - 1, k - factorial(x - 1, y))  
          
# Driver Code 
if __name__ == "__main__":  
  
    x, y, k = 2, 2, 2
    Ksmallest(x, y, k)  
  
# This code is contributed by Rituraj Jain 

