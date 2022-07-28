t = int(input())
while t:  
s = input()
strinig_list = []
for i in range(len(s)):        if
i % 2 == 0:
if s[i] != "a":
    strinig_list.append("a")            else:
    strinig_list.append("b") else:            if s[i] != "z":
    strinig_list.append("z")            else:
    strinig_list.append("y")
for i in strinig_list:        print(i, end="")
print("\r")
t -= 1 
