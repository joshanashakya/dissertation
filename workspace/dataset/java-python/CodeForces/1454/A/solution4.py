t = int(input())
for i in range(t):    n = int(input())
l = []
for i in range(1, n + 1):        l.append(i)
for i in l[1:]:        print(i, end=" ")
print(l[0])
