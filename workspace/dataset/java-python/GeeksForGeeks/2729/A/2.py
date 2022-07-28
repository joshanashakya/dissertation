

# Python code to form new from  
# pre/suffix of given strings. 
  
# Returns a string which contains first l  
# characters of 'a' and last l characters of 'b'. 
def GetPrefixSuffix(a, b, l): 
    # Getting prefix of first  
    # of given length 
    prefix = a[: l]; 
      
    # length of string b 
    lb = len(b); 
      
    # Calculating suffix of second string 
    suffix = b[lb - l:]; 
      
    # Concatenating both prefix and suffix 
    return (prefix + suffix); 
  
  
# Driver code 
a = "remuneration";  
b = "acquiesce"; 
l = 5; 
print(GetPrefixSuffix(a, b, l));  
  
  
# This code contributed by Rajput-Ji 

