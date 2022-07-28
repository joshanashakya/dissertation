

# Python3 program to convert a string to uppercase 
  
# Converts a string to uppercase 
def to_upper(string): 
    for i in range(len(string)): 
        if ('a' <= string[i] <= 'z'): 
            string = (string[0:i] + chr(ord(string[i]) - 
                                        ord('a') + ord('A')) +
                                        string[i + 1:]) 
    return string; 
  
# Driver code 
if __name__ == '__main__': 
    str = "geeksforgeeks"; 
    print(to_upper(str)); 
  
# This code is contributed by Rajput-Ji 

