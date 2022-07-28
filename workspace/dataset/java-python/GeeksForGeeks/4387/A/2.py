

# Python3 code for printing the  
# Triangle Pattern using last term N  
from math import sqrt 
  
# Function to demonstrate printing pattern  
def triangle(n) :  
  
    # number of spaces  
    k = 2 * n - 2;  
  
    # character to be printed  
    ch = 1;  
  
    # outer loop to handle number of rows  
    # n in this case  
    for i in range(n) : 
  
        # inner loop to handle number spaces  
        # values changing acc. to requirement  
        for j in range(k) : 
            print(" ", end = "");  
  
        # decrementing k after each loop  
        k = k - 1;  
  
        # inner loop to handle number of columns  
        # values changing acc. to outer loop  
        for j in range(i + 1) : 
              
            # printing stars  
            print(ch, end = " ");  
            ch += 1; 
              
        # ending line after each row 
        print()  
  
# Function to find the max height  
# or the number of lines  
# in the triangle pattern  
def maxHeight(n) :  
    ans = (sqrt(1 + 8.0 * n) - 1) // 2; 
    return int(ans);  
  
# Driver Code 
if __name__ == "__main__" :  
  
    N = 9;  
    triangle(maxHeight(N));  
      
# This code is contributed by AnkitRai01 

