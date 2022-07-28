

# Python program to find indices of all 
# occurrences of one String in other. 
def printIndex(str, s): 
  
    flag = False; 
    for i in range(len(str)): 
        if (str[i:i + len(s)] == s): 
              
            print( i, end =" "); 
            flag = True; 
  
    if (flag == False): 
        print("NONE"); 
          
# Driver code         
str1 = "GeeksforGeeks"; 
str2 = "Geeks"; 
printIndex(str1, str2); 
  
# This code contributed by PrinciRaj1992  
  

