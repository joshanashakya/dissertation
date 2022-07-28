

# Python3 implementation of the approach 
  
# Function that prints the segments 
def sub_segments (string, n): 
    l = len (string) 
    for x in range (0, l, n): 
        newlist = string[x : x + n] 
  
        # New array for every iteration 
        arr = []  
        for y in newlist: 
  
           # Check if the character is in the array 
            if y not in arr: 
                arr.append (y) 
         
        print (''.join (arr)) 
  
# Driver code 
string = "geeksforgeeksgfg"
n = 4
sub_segments (string, n) 

