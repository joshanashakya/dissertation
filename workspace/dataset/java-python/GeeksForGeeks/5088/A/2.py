

# Python3 program to check if the  
# given number is Ore number  
arr = []  
  
# Function that returns harmonic mean  
def generateDivisors(n):  
  
    # Note that this loop runs till square root  
    for i in range(1, int(n**(0.5)) + 1):  
        if n % i == 0: 
  
            # If divisors are equal, store 'i'  
            if n // i == i:  
                arr.append(i)  
              
            # Otherwise store 'i' and 'n/i' both 
            else:  
                arr.append(i)  
                arr.append(n // i)  
          
# Utility function to calculate harmonic  
# mean of the divisors  
def harmonicMean(n):  
  
    generateDivisors(n)  
  
    # Declare sum variables and initialize  
    # with zero.  
    Sum = 0
    length = len(arr)  
  
    # calculate denominator  
    for i in range(0, length):  
        Sum = Sum + (n / arr[i])  
  
    Sum = Sum / n  
  
    # Calculate harmonic mean and return  
    return length / Sum
  
# Function to check if a number 
# is ore number  
def isOreNumber(n):  
  
    # Calculate Harmonic mean of  
    # divisors of n  
    mean = harmonicMean(n)  
  
    # Check if harmonic mean is an  
    # integer or not  
    if mean - int(mean) == 0:  
        return True
    else: 
        return False
  
# Driver Code  
if __name__ == "__main__":  
  
    n = 28
  
    if isOreNumber(n) == True:  
        print("YES")  
    else: 
        print("NO")  
  
# This code is contributed 
# by Rituraj Jain 

