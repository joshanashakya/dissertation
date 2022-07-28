

# Python3 Program to print pyramid 
# pattern using numbers 
  
# Function to print pyramid pattern 
def printPattern(n): 
      
    # outer loop to print rows 
    for i in range(1, n + 1): 
  
        # inner loop to print spaces 
        for j in range(i, n): 
            print("\t", end = "") 
  
        # calculate initial value 
        t = i 
  
        # inner loop to print pattern 
        for k in range (1, i + 1): 
            print(t, "\t", "\t", end = "") 
            t = t + n - k 
          
        print() 
      
# Driver code 
n = 6
printPattern(n) 
      
# This code is contributed  
# by iAyushRaj 

