

# Python3 program to find n terms of 
# series from given two numbers 
  
# Function to find n terms 
# of series 
def findSeries(num, first, sec) :  
    print ("{} {} ".format(first, sec),  
                               end="") 
    counter = 0
  
    # find next (num - 2) terms of 
    # series as first two terms are 
    # already given 
    while (counter < num - 2): 
        sum = first + sec 
        print ("{} ".format(sum), end="") 
        first = sec 
        sec = sum
        counter = counter + 1
  
# Drivers code 
n = 5
first = 2
sec = 4
findSeries(n, first, sec) 
  
# This code is contributed by 
# Manish Shaw (manishshaw1) 

