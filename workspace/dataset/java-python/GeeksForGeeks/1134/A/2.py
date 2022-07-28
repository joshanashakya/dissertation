

# Python3 program for given approach 
  
# function to obtain the new time 
def findTime(T, K): 
      
    # convert the given time in minutes 
    minutes = (((ord(T[0]) - ord('0'))* 10 + 
                 ord(T[1]) - ord('0'))* 60 + 
               ((ord(T[3]) - ord('0')) * 10 + 
                 ord(T[4]) - ord('0'))); 
                  
    # Add K to current minutes 
    minutes += K 
  
    # Obtain the new hour 
    # and new minutes from minutes 
    hour = (int(minutes / 60)) % 24
  
    min = minutes % 60
  
    # Print the hour in appropriate format 
    if (hour < 10): 
        print(0, hour, ":", end = " ") 
  
    else: 
        print(hour, ":", end = " ") 
  
    # Print the minute in appropriate format 
    if (min < 10): 
        print(0, min, end = " ") 
  
    else: 
        print(min,end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    T = "21:39"
  
    K = 43
  
    findTime(T, K) 
      
# This code is contributed by 
# Surendra_Gangwar 

