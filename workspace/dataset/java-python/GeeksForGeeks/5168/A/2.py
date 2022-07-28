

# Iterative Python Program to copy one String  
# to another. 
  
# Function to copy one string to other 
# assuming that other string has enough 
# space. 
def myCopy(s1, s2): 
  
    for i in range(len(s1)): 
        s2[i] = s1[i]; 
  
# Driver code 
s1 = "GEEKSFORGEEKS"; 
s2 = ['']*(len(s1)); 
myCopy(s1, s2); 
print(("".join(s2))); 
  
# This code contributed by PrinciRaj1992 

