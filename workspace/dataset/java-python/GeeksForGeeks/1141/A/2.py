

# Python3 program to find the real and  
# imaginary parts of a Complex Number  
  
# Function to find real and imaginary  
# parts of a complex number  
def findRealAndImag(s) : 
  
    # string length stored in variable l  
    l = len(s)  
  
    # variable for the index of the separator  
    i = 0 
  
    # Storing the index of '+'  
    if (s.find('+') != -1):  
        i = s.find('+') 
    # else storing the index of '-'  
    else: 
        i = s.find('-');  
  
    # Finding the real part  
    # of the complex number  
    real = s[:i] 
  
    # Finding the imaginary part  
    # of the complex number  
    imaginary = s[i + 1:l  - 1] 
  
    print("Real part:", real) 
    print("Imaginary part:", imaginary) 
  
# Driver code  
s = "3+4i";  
  
findRealAndImag(s);  
  
# This code is contributed by Sanjit_Prasad 

