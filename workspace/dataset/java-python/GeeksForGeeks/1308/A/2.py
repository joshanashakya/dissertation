

# Python3 implementation of the approach  
  
# Function that returns true if  
# str is Topsy Turvy  
def topsyTurvy(string) :  
  
    # For every character of the string  
    for i in range(len(string)) : 
          
        # If the current digit cannot form a  
        # valid digit when turned upside-down  
        if (string[i] == '2' or string[i] == '4' or 
            string[i] == '5' or string[i] == '6' or 
            string[i] == '7' or string[i] == '9') : 
            return False;  
              
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "1234";  
  
    if (topsyTurvy(string)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

