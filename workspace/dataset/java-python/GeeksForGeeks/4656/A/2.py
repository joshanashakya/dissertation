

# Python3 program for implementation of efficient 
# approach to find length of last word 
def length(str): 
  
    count = 0; 
    flag = False; 
    length = len(str)-1; 
    while(length != 0): 
        if(str[length] == ' '): 
            return count; 
        else: 
            count += 1; 
        length -= 1; 
    return count; 
  
# Driver code 
str = "Geeks for Geeks"; 
print("The length of last word is",  
                      length(str)); 
  
# This code is contributed by Rajput Ji 

