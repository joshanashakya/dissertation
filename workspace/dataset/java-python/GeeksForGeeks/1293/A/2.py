

# Python3 program to find n-th number  
# with prime digits 2, 3 and 7  
def nthprimedigitsnumber(number): 
  
    num = "";  
    while (number > 0):  
          
        # remainder for check element position  
        rem = number % 4;  
          
        # if number is 1st position in tree 
        if (rem == 1): 
            num += '2';  
  
        # if number is 2nd position in tree  
        if (rem == 2):  
            num += '3';  
  
        # if number is 3rd position in tree  
        if (rem == 3):  
            num += '5';  
  
        # if number is 4th position in tree  
        if (rem == 0):  
            num += '7';  
  
        if (number % 4 == 0): 
            number = number - 1
  
        number = number // 4;  
  
    return num[::-1];  
  
# Driver code  
number = 21;  
print(nthprimedigitsnumber(10));  
print(nthprimedigitsnumber(number));  
  
# This code is contributed by mits 

