

# Python 3 program to replace all  
# occurrences of "AB" with "C" 
  
def translate(st) : 
    l = len(st) 
      
    if (l < 2) : 
        return
  
    i = 0 # Index in modified string 
    j = 0 # Index in original string 
  
    # Traverse string 
    while (j < l - 1) : 
          
        # Replace occurrence of "AB" with "C" 
        if (st[j] == 'A' and st[j + 1] == 'B') : 
              
            # Increment j by 2 
            j += 2
            st[i] = 'C'
            i += 1
            continue
          
        st[i] = st[j] 
        i += 1
        j += 1
      
  
    if (j == l - 1) : 
        st[i] = st[j] 
        i += 1
  
    # add a null character to 
    # terminate string 
    st[i] = ' '
    st[l-1] = ' '
  
# Driver code 
st = list("helloABworldABGfG") 
translate(st) 
  
print("The modified string is :") 
print(''.join(st)) 
  
# This code is contributed by Nikita Tiwari. 

