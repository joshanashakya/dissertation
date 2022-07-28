

# Python 3 program to count numbers 
# with N digits which consists of  
# odd number of 0's 
  
# Function to count Numbers with  
# N digits which consists of odd 
# number of 0's 
def countNumbers( N): 
  
    return (pow(10, N) - pow(8, N)) // 2
  
# Driver code 
if __name__ == "__main__": 
  
    n = 5
  
    print (countNumbers(n)) 
  
# This code is contributed  
# by ChitraNayal 

