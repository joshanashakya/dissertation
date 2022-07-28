

# Python 3 Program to print single line  
# command to find the GCD of n integers  
  
# Function to print single line command  
# to find GCD of n elements.  
def recursiveFun(n):  
      
    # base case  
    if (n == 1):  
        return "int"
  
    # Recursive Step  
    return "gcd(int, " + recursiveFun(n - 1) + ")"
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    print(recursiveFun(n))  
  
# This code is contributed  
# by PrinciRaj1992 

