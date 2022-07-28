

# Python implementation of the above approach 
s = "ABCdcba"
  
# creating a list which stores the  
# frequency of each character 
u = [0] * 26  
n = len(s) 
for i in range(n): 
    # Checking if a character is uppercase or not 
    if (s[i].isupper()):   
        # Increasing by 1 if uppercase 
        u[ord(s[i]) - 65] += 1  
    else: 
        # Decreasing by 1 if lower case 
        u[ord(s[i]) - 97] -= 1  
fl = True
  
# Storing the sum of positive  
# numbers in the frequency array 
po = 0  
  
# Storing the sum of negative  
# numbers in the frequency array 
ne = 0  
for i in range(26): 
    if (u[i] > 0): 
        po += u[i] 
    if (u[i] < 0): 
        ne += u[i] 
  
# If all character balances out then its Yes 
if (po == 0 and ne == 0):   
    print("YES") 
  
# If there is only 1 character which  
# does not balances then also it is Yes 
elif (po == 1 and ne == 0):   
    print("YES") 
elif (po == 0 and ne == -1): 
    print("YES") 
else: 
    print("NO") 

