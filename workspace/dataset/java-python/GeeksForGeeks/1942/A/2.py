

# Python3 programm to print the digital 
# root of a given very large number 
  
# Function to convert given 
# sum into string 
def convertToString(sum): 
    str1 = "" 
  
    # Loop to extract digit one by one 
    # from the given sum and concatinate 
    # into the string 
    while (sum): 
  
        # Type casting for concatination 
        str1 = str1 + chr((sum % 10) + ord('0')) 
        sum = sum // 10
  
    # Return converted string 
    return str1 
  
# Function to get individual digit 
# sum from string 
def GetIndividulaDigitSum(str1, len1): 
    sum = 0
    # Loop to get individual digit sum 
    for i in range(len1): 
        sum = sum + ord(str1[i]) - ord('0') 
  
    # Functin call to convert 
    # sum into string 
    return convertToString(sum) 
  
# Function to calculate the digital 
# root of a very large number 
def GetDigitalRoot(str1): 
    # Base condition 
    if (len(str1) == 1): 
        return ord(str1[0] ) - ord('0') 
  
    # Function call to get 
    # individual digit sum 
    str1 = GetIndividulaDigitSum(str1,len(str1)) 
    # Recursive function to get digital 
    # root of a very large number 
    return GetDigitalRoot(str1) 
  
if __name__ == '__main__': 
    str1 = "675987890789756545689070986776987"
  
    # Function to print final digit 
    print(GetDigitalRoot(str1)) 
  
# This code is contributed by Surendra_Gangwar 

