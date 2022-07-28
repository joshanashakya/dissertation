

# Python implementation of the above approach 
def check(s): 
  
    # creating a frequency array 
    freq =[0]*10
    while(s != 0): 
  
        # Finding the last digit of the number 
        r = s % 10
  
        # Dividing the number by 10 to  
        # eliminate last digit 
        s = s//10
  
        # counting frequency of each digit  
        freq[r]+= 1
  
    xor = 0
  
    # checking if the xor of all frequency is zero or not 
    for i in range(10): 
        xor = xor ^ freq[i] 
    if(xor == 0): 
        return True
    else: 
        return False
  
s = 122233
if(check(s)): 
    print("Yes") 
else: 
    print("No") 

