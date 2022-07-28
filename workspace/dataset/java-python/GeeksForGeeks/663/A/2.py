

# Python 3 program to print all the  
# numbers less than N which have at  
# most 2 unique digits 
st = set() 
  
# Function to generate all possible numbers 
def generateNumbers(n, num, a, b): 
      
    # If the number is less than n 
    if (num > 0 and num < n): 
        st.add(num) 
  
    # If the number exceeds 
    if (num >= n): 
        return
  
    # Check if it is not the same number 
    if (num * 10 + a > num): 
        generateNumbers(n, num * 10 + a, a, b) 
  
    generateNumbers(n, num * 10 + b, a, b) 
  
# Function to print all numbers 
def printNumbers(n): 
      
    # All combination of digits 
    for i in range(10): 
        for j in range(i + 1, 10, 1): 
            generateNumbers(n, 0, i, j) 
  
    print("The numbers are:", end = " ") 
      
    # Print all numbers 
    l = list(st) 
    for i in l: 
        print(i, end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 12
  
    printNumbers(n) 
  
# This code is contributed by 
# Shashank_Sharma 

