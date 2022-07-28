string = input()
n = int(input())
a = []
while n != 0:    a.append(input())
n -= 1
a.sort()
for x in a:    if
x.find(string) == 0: print(x)
exit()
print(string)
