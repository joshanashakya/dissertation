

# Python3 program to print the most occurring  
# character in an array of strings  
  
# Function to print the most occurring character  
def findMostOccurringChar(string) : 
  
    # Creating a hash of size 26  
    hash = [0]*26;  
  
    # For loop to iterate through  
    # every string of the array  
    for i in range(len(string)) : 
  
        # For loop to iterate through  
        # every character of the string  
        for j in range(len(string[i])) : 
  
            # Incrementing the count of  
            # the character in the hash  
            hash[ord(string[i][j]) - ord('a')] += 1;  
  
    # Finding the character  
    # with the maximum count  
    max = 0;  
    for i in range(26) : 
        max = i if hash[i] > hash[max] else max;  
  
    print((chr)(max + 97));  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Declaring Vector of String type  
    string = [];  
    string.append("animal");  
    string.append("zebra");  
    string.append("lion");  
    string.append("giraffe");  
  
    findMostOccurringChar(string);  
  
# This code is contributed by AnkitRai01 

