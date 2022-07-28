

# Python3 program to validate the time in  
# 12-hour format using Regular Expression.  
import re 
  
# Function to validate the time in 12-hour format.  
def isValidTime(time) : 
      
    # Regex to check valid time in 12-hour format.  
    regexPattern = "(1[012]|[1-9]):"+ "[0-5][0-9](\\s)"+ "?(?i)(am|pm)";  
  
    # Compile the ReGex  
    compiledPattern = re.compile(regexPattern);  
  
    # If the time is empty  
    # return false  
    if (time == None) : 
        return False;  
      
    # re library contains search() method  
    # to find matching between given time  
    # and regular expression.  
    # Return if the time  
    # matched the ReGex  
    if re.search(compiledPattern,time): 
        return True
    else : 
        return False
  
# Driver Code.  
if __name__ == "__main__" : 
  
    # Test Case 1:  
    str1 = "12:15 AM";  
    print(isValidTime(str1));  
  
    # Test Case 2:  
    str2 = "9:45PM";  
    print(isValidTime(str2));  
  
    # Test Case 3:  
    str3 = "1:15";  
    print(isValidTime(str3));  
  
    # Test Case 4:  
    str4 = "17:30";  
    print(isValidTime(str4));  
  
# This code is contributed by AnkitRai01 

