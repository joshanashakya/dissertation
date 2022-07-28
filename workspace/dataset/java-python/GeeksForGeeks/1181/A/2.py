

# Python3 program to accept String  
# starting with Capital letter  
  
# Function to check if first  
# character is Capital  
def checkIfStartsWithCapital(string) :  
  
    if (string[0] >= 'A' and string[0] <= 'Z') : 
        return 1;  
    else : 
        return 0;  
  
# Function to check  
def check(string) :  
  
    if (checkIfStartsWithCapital(string)) :  
        print("Accepted");  
    else : 
        print("Not Accepted");  
  
# Driver function  
if __name__ == "__main__" :  
  
    string = "GeeksforGeeks";  
    check(string);  
  
    string = "geeksforgeeks";  
    check(string);  
  
# This code is contributed by AnkitRai01 

