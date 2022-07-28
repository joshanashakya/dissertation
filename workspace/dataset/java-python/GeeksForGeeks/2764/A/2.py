

# Python 3 program to check if the average  
# character is present in the string or not 
from math import floor 
  
# Checks if the character is present 
def check_char(st, ch): 
      
    # Get the length of string 
    l = len(st) 
  
    # Iterate from i=0 to 
    # the length of the string 
    # to check if the character 
    # is present in the string 
    for i in range(l): 
        if (st[i] == ch): 
            return True
  
    return False
  
# Finds the average character 
# of the string 
def find_avg(st): 
    sm = 0
    l = len(st) 
  
    for i in range(l): 
        ch = st[i] 
  
        # Calculate the sum of ASCII 
        # values of each character 
        sm = sm + ord(ch) 
  
    # Calculate average of ascii values 
    avg = int(floor(sm / l)) 
  
    # Convert the ASCII value to character 
    # and return it 
    return (chr(avg)) 
  
# Driver code 
if __name__ == '__main__': 
    st = "ag23sdfa"
  
    # Get the average character 
    ch = find_avg(st) 
    print(ch) 
      
    # Check if the average character 
    # is present in string or not 
    if (check_char(st, ch) == True): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

