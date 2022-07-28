l = []
n = int(input(""))
for i in range(n):    x = input("")
l.append(x)
for i in l:    if
len(i) <= 10: print(i) else:        s = ""
s = s + i[0]
s = s + str(len(i) - 2)
s = s + i[len(i) - 1]
print(s)
