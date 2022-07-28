

# Python3 program to remove the first 
# and last character of each word in a string. 
  
def FirstAndLast(string) : 
      
    # Split the String based on the space 
    arrOfStr = string.split(); 
  
    # String to store the resultant String 
    res = ""; 
  
    # Traverse the words and 
    # remove the first and last letter 
    for a in arrOfStr : 
        res += a[1:len(a) - 1] + " "; 
      
    return res; 
      
# Driver code 
if __name__ == "__main__" : 
      
    string = "Geeks for Geeks"; 
      
    print(string); 
    print(FirstAndLast(string)); 
  
# This code is contributed by Ryuga 

