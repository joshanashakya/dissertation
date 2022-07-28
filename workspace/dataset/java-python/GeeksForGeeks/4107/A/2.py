

# Python 3 program to count the uppercase,  
# lowercase, special characters  
# and numeric values  
  
# Function to count uppercase, lowercase,  
# special characters and numbers  
def Count(str): 
    upper, lower, number, special = 0, 0, 0, 0
    for i in range(len(str)): 
        if str[i] >= 'A' and str[i] <= 'Z': 
            upper += 1
        elif str[i] >= 'a' and str[i] <= 'z': 
            lower += 1
        elif str[i] >= '0' and str[i] <= '9': 
            number += 1
        else: 
            special += 1
    print('Upper case letters:', upper) 
    print('Lower case letters:', lower) 
    print('Number:', number) 
    print('Special characters:', special) 
  
# Driver Code 
str = "#GeeKs01fOr@gEEks07"
Count(str) 
  
# This code is contributed  
# by SamyuktaSHegde 

