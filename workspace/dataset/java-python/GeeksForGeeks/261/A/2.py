

# Python3 program to count number  
# of numbers from 1 to n are of 
# type x^y where x>0 and y>1 
  
# Function that keeps all the odd 
# power numbers upto n 
def powerNumbers(n): 
      
    # v is going to store all 
    # unique power numbers 
    v = set(); 
    v.add(1); 
  
    # Traverse through all base 
    # numbers and compute all 
    # their powers smaller than 
    # or equal to n. 
    for i in range(2, n+1): 
        if(i * i <= n): 
            j = i * i; 
            v.add(j); 
            while (j * i <= n): 
                v.add(j * i); 
                j = j * i; 
  
    return len(v); 
      
print (powerNumbers(50)); 
# This code is contributed by  
# Manish Shaw (manishshaw1) 

