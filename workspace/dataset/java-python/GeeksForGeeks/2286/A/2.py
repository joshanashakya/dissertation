

# Python3 program to generate  
# Gould's Sequence  
  
# Utility function to count odd numbers  
# in ith row of Pascals's triangle  
def countOddNumber(row_num):  
  
    # Count set bits in row_num  
    # Initialize count as zero  
    count = 0
    while row_num != 0:  
        count += row_num & 1
        row_num >>= 1
  
    # Return 2^count  
    return (1 << count)  
  
# Function to generate gould's Sequence  
def gouldSequence(n):  
  
    # loop to generate gould's 
    # Sequence up to n  
    for row_num in range(0, n):  
        print(countOddNumber(row_num), end = " ")  
  
# Driver code  
if __name__ == "__main__": 
  
    # Get n  
    n = 16
  
    # Function call  
    gouldSequence(n)  
  
# This code is contributed 
# by Rituraj Jain 

