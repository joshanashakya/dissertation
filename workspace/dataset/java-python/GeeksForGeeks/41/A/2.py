

# Python3 program to find 9's  
# complement of a number. 
  
def complement(number): 
  
    for i in range(0, len(number)): 
        if(number[i] != '.'): 
            a = 9 - int(number[i]) 
            number = (number[:i] + 
                     str(a) + number[i + 1:]) 
  
    print("9's complement is : ", number) 
  
  
# Driver code 
if __name__=='__main__': 
    number = "345.45"
    complement(number) 
  
# This code is contributed by 
# Sanjit_Prasad 

