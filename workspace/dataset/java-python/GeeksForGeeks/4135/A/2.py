

# Python3 program to check if the count of  
# alphabets and numbers in a string  
# are equal or not.  
  
# Function to count the  
# number of alphabets  
def countOfLetters(string ) : 
      
    # Counter to store the number  
    # of alphabets in the string  
    letter = 0;  
  
    # Every character in the string  
    # is iterated  
    for i in range(len(string)) : 
  
        # To check if the character is  
        # an alphabet or not  
        if ((string[i] >= 'A' and string[i] <= 'Z')  
            or (string[i] >= 'a' and string[i] <= 'z')) : 
            letter += 1;  
      
    return letter;  
  
# Function to count the number of numbers  
def countOfNumbers(string ) : 
  
    # Counter to store the number  
    # of alphabets in the string  
    number = 0;  
  
    # Every character in the string is iterated  
    for i in range(len(string)) : 
  
        # To check if the character is  
        # a digit or not  
        if (string[i] >= '0' and string[i] <= '9') : 
            number += 1;  
  
    return number;  
  
# Function to check if the  
# count of alphabets is equal to  
# the count of numbers or not  
def check(string) :  
  
    if (countOfLetters(string) == countOfNumbers(string)) : 
        print("Yes");  
    else : 
        print("No");  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "GeeKs01324";  
    check(string);  
  
# This code is contributed by AnkitRai01 

