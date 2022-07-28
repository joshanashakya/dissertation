

# Python3 program for character  
# replacement after string minimization  
  
# Function to minimize string  
def minimize(string):  
   
    mstr = " " 
    flagchar = [0] * 26  
    l = len(string)  
      
    # Duplicate characters are removed  
    for i in range(0, len(string)):  
       
        ch = string[i]  
          
        # checks if character has previously occurred or not  
        # if not then add it to the minimized string 'mstr'  
        if flagchar[ord(ch)-97] == 0:  
           
            mstr = mstr + ch  
            flagchar[ord(ch)-97] = 1 
                   
    return mstr # minimized string  
   
# Utility function to print the  
# minimized, replaced string  
def replaceMinimizeUtil(string):  
   
    finalStr = ""  
    l = len(string)  
    minimizedStr = minimize(string) # minimized string  
      
    # Creating final string by replacing character  
    for i in range(0, len(minimizedStr)):  
       
        ch = ord(minimizedStr[i])  
          
        # index calculation  
        index = (ch * ch) % l  
        finalStr = finalStr + string[index]  
      
    print("Final string:", finalStr) # final string  
   
# Driver program  
if __name__ == "__main__":  
   
    string = "geeks" 
    replaceMinimizeUtil(string)  
  
# This code is contributed by Rituraj Jain 

