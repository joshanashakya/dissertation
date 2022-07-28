

# Python3 program for the above approach  
  
# Function to check if  
# Binary string can be  
# made equal  
def canMake(s) : 
  
    o = 0; z = 0;  
  
    # Counting occurence of  
    # zero and one in binary  
    # string  
    for i in range(len(s)) : 
        if (ord(s[i]) - ord('0') == 1) : 
            o += 1;  
        else : 
            z += 1;  
  
    # From above observation  
    if (o % 2 == 1 and z % 2 == 1) : 
        return "NO";  
    else : 
        return "YES";  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "01011";  
    print(canMake(s));  
  
# This code is contributed by AnkitRai01 

