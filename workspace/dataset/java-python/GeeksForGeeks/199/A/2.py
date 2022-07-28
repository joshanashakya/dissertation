

# Python 3 program to replace all  
# occurrences of "AB" with "C" 
  
def translate(st) : 
      
    # Start traversing from second character 
    for i in range(1, len(st)) : 
          
        # If previous character is 'A'  
        # and current character is 'B" 
        if (st[i - 1] == 'A' and st[i] == 'B') : 
              
            # Replace previous character with 
            # 'C' and move all subsequent 
            # characters one position back 
            st[i - 1] = 'C'
              
            for j in range(i, len(st) - 1) : 
                st[j] = st[j + 1] 
                  
            st[len(st) - 1] = ' '
                  
    return
  
# Driver code 
st = list("helloABworldABGfG") 
translate(st) 
  
print("The modified string is :") 
print(''.join(st)) 
  
# This code is contributed by Nikita Tiwari. 

