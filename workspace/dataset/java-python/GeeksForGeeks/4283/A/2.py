

# Python3 implementation of the approach 
  
# Function to check if sum of the 
# three angles is 180 or not 
def Valid(a, b, c): 
  
    # Check condition 
    if ((a + b + c == 180) and a != 0 and b != 0 and c != 0): 
        return True
    else: 
        return False
  
# Driver code 
if __name__ == "__main__": 
    a = 60
    b = 40
    c = 80
    if (Valid(a, b, c)): 
        print("Valid") 
    else: 
        print("Invalid") 
  
# This code is contributed by 
# sanjeev2552 

