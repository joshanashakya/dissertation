

# Python3 program to demonstrate divisibility 
# of Fibonacci numbers.  
MAX = 90;  
  
# indexes variable stores index of number  
# that is divisible by 2, 3, 5 and 8  
arr = [0] * (MAX); 
index1 = [0] * (MAX); 
index2 = [0] * (MAX);  
index3 = [0] * (MAX); 
index4 = [0] * (MAX);  
  
# storing fibonacci numbers  
arr[0] = 0;  
arr[1] = 1;  
for i in range(2, MAX):  
    arr[i] = arr[i - 1] + arr[i - 2];  
  
# c1 keeps track of number of index  
# of number divisible by 2 and others   
# c2, c3 and c4 for 3, 5 and 8  
c1, c2, c3, c4 = 0, 0, 0, 0; 
  
# separating fibonacci number into 
# their respective array  
for i in range(MAX):  
    if (arr[i] % 2 == 0):  
        index1[c1] = i; 
        c1 += 1; 
    if (arr[i] % 3 == 0):  
        index2[c2] = i; 
        c2 += 1; 
    if (arr[i] % 5 == 0):  
        index3[c3] = i; 
        c3 += 1; 
    if (arr[i] % 8 == 0):  
        index4[c4] = i; 
        c4 += 1; 
  
# printing index arrays  
print("Index of Fibonacci numbers", 
           "divisible by 2 are :");  
for i in range(c1):  
    print(index1[i], end = " ");  
print("");  
  
print("Index of Fibonacci number",  
          "divisible by 3 are :");  
for i in range(c2):  
    print(index2[i], end = " ");  
print("");  
  
print("Index of Fibonacci number",  
          "divisible by 5 are :");  
for i in range(c3):  
    print(index3[i], end = " ");  
print("");  
  
print("Index of Fibonacci number",  
          "divisible by 8 are :");  
for i in range(c4):  
    print(index4[i], end = " ");  
print(""); 
  
# This code is contributed by mits 

