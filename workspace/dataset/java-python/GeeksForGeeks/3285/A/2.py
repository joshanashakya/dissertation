

# Python3 program to count number 
# of substrings of a string 
  
def countNonEmptySubstr(str): 
    n = len(str); 
    return int(n * (n + 1) / 2); 
  
# driver code 
s = "abcde"; 
print (countNonEmptySubstr(s)); 
  
# This code is contributed by 
# Manish Shaw (manishshaw1) 

