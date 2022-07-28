

# Python3 program to Find m-th number  
# whose sum of digits of a number 
# until sum becomes single digit is N  
  
# Function to find the M-th  
# number whosesum till one digit is N 
def findNumber(n, m) : 
      
    num = (m - 1) * 9 + n;  
    return num;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 2 ; 
    m = 5 ;  
    print(findNumber(n, m)) 
      
# This code is contributed by Ryuga 

