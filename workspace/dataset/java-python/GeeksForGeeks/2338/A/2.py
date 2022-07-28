

# Python 3 program to print a number such that the 
# frequency of each digit in the new number is  
# is equal to its frequency in the given number  
# multiplied by the digit itself. 
  
# Function to print such a number 
def printNumber(n): 
  
    # initializing a hash array 
    count = [0]*10
  
    # counting frequency of the digits 
    while (n) : 
        count[n % 10] += 1
        n //= 10
  
    # printing the new number 
    for i in range(1,10) : 
        for j in range(count[i] * i): 
            print(i,end="") 
  
# Driver code 
if __name__ == "__main__": 
    n = 3225
  
    printNumber(n) 
      
# This code is contributed by 
# ChitraNayal 

