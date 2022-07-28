

# Python3 program to convert decimal  
# to hexadecimal covering negative numbers  
  
# Function to convert decimal no.  
# to hexadecimal number  
def Hex(num) :  
  
    # map for decimal to hexa, 0-9 are  
    # straightforward, alphabets a-f used  
    # for 10 to 15.  
    m = dict.fromkeys(range(16), 0);  
  
    digit = ord('0');  
    c = ord('a');  
  
    for i in range(16) : 
        if (i < 10) : 
            m[i] = chr(digit); 
            digit += 1; 
          
        else : 
            m[i] = chr(c); 
            c += 1
  
    # string to be returned  
    res = "";  
  
    # check if num is 0 and directly return "0"  
    if (not num) : 
        return "0";  
  
    # if num>0, use normal technique as  
    # discussed in other post  
    if (num > 0) : 
        while (num) : 
            res = m[num % 16] + res;  
            num //= 16;  
      
    # if num<0, we need to use the elaborated  
    # trick above, lets see this  
    else : 
          
        # store num in a u_int, size of u_it is greater,  
        # it will be positive since msb is 0  
        n = num + 2**32;  
  
        # use the same remainder technique.  
        while (n) : 
            res = m[n % 16] + res;  
            n //= 16;  
  
    return res;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    x = 134; y = -1; z = -234;  
  
    print("Hexa representation for");  
    print(x, "is", Hex(x));  
    print(y, "is", Hex(y));  
    print(z, "is", Hex(z));  
  
# This code is contributed by AnkitRai01 

