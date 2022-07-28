

# python program to find position  
# of a number in a series of  
# numbers with 4 and 7 as the 
# only digits. 
def findpos(n): 
    i = 0
    j = len(n) 
    pos = 0
    while (i<j): 
          
        # check all digit position 
        # if number is left then  
        # pos*2+1 
        if(n[i] == '4'): 
            pos = pos * 2 + 1
              
        # if number is right then 
        # pos*2+2 
        if(n[i] == '7'): 
            pos = pos * 2 + 2
          
        i= i+1
      
    return pos 
  
  
# Driver code 
# given a number which is constructed  
# by 4 and 7 digit only  
n = "774"
print(findpos(n)) 
  
# This code is contributed by Sam007 

