def solve():    string = input()


newStr = ""     for count, i in enumerate(string):        if
count % 2 != 0:
if i == "z":
    newStr += "y"            else:
    newStr += "z" else:            if i == "a":
    newStr += "b"            else:
    newStr += "a"
print(newStr)  for i in range(int(input())):    solve()  
