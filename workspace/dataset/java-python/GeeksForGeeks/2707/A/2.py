

# Python program to remove all the  
# characters other then alphabets 
  
# Function to remove special characters  
# and store it in another variable 
def removeSpecialCharacter(s): 
    t = "" 
    for i in s: 
          
        # Store only valid characters 
        if (i >= 'A' and i <= 'Z') or (i >= 'a' and i <= 'z'): 
            t += i 
    print(t) 
  
# Driver code 
s = "$Gee*k;s..fo, r'Ge^eks?"
removeSpecialCharacter(s) 
  
# This code is contributed by code_freak 

