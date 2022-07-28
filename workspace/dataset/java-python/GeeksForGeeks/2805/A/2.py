

# Python3 program to find the resultant String  
# after replacing X with Y and removing Z  
  
# Function to replace and remove  
def replaceRemove(s, X, Y, Z) : 
  
    s = list(s); 
      
    # Two pointer start and end points 
    # to beginning and end position in the string 
    start = 0; 
    end = len(s) - 1; 
      
    while (start <= end) : 
          
        # If start is having Z 
        # find X pos in end and 
        # replace Z with another character 
        if (s[start] == Z) : 
              
            # Find location for having 
            # different character 
            # insted of Z  
            while (end >= 0 and s[end] == Z) : 
                end -= 1; 
                  
            # If found swap character  
            # at start and end 
            if (end > start) : 
                s[start], s[end] = s[end], s[start] 
                if (s[start] == X): 
                    s[start] = Y; 
                      
                start += 1
                  
        # Else increment start 
        # Also checkin for X 
        # at start position 
        else : 
            if (s[start] == X) : 
                s[start] = Y; 
                  
            start += 1; 
              
    while (len(s) > 0 and s[len(s) - 1] == Z): 
        s.pop(); 
          
    return "".join(s) 
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "batman";  
    X = 'a'; Y = 'd'; Z = 'b';  
  
    string = replaceRemove(string, X, Y, Z);  
  
    if (len(string) == 0) : 
        print(-1);  
  
    else : 
        print(string);  
  
# This code is contributed by AnkitRai01 

