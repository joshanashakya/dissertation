

# Python3 program to convert 
# Octal number to Binary 
  
# defining a function that returns 
# binary equivalent of the number 
def OctToBin(octnum): 
      
    binary = "" # initialising bin as String 
      
    # While loop to extract each digit 
    while octnum != 0: 
          
        # extracting each digit 
        d = int(octnum % 10) 
        if d == 0: 
              
            # concatination of string using join function 
            binary = "".join(["000", binary]) 
        elif d == 1: 
              
            # concatination of string using join function 
            binary = "".join(["001", binary]) 
        elif d == 2: 
              
            # concatination of string using join function 
            binary = "".join(["010", binary]) 
        elif d == 3: 
              
            # concatination of string using join function 
            binary = "".join(["011", binary]) 
        elif d == 4: 
              
            # concatination of string using join function 
            binary = "".join(["100", binary]) 
        elif d == 5: 
              
            # concatination of string using join function 
            binary = "".join(["101", binary]) 
        elif d == 6: 
              
            # concatination of string using join function 
            binary = "".join(["110",binary]) 
        elif d == 7: 
              
            # concatination of string using join function 
            binary = "".join(["111", binary]) 
        else: 
              
            # an option for invalid input 
            binary = "Invalid Octal Digit"
            break
  
        # updating the oct for while loop 
        octnum = int(octnum / 10) 
          
    # returning the string binary that stores 
    # binary equivalent of the number 
    return binary 
  
# Driver Code 
octnum = 345
  
# value of function stored final_bin 
final_bin = "" + OctToBin(octnum) 
  
# result is printed 
print("Equivalent Binary Value =", final_bin) 
  
# This code is contributed by Animesh_Gupta 

