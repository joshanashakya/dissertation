for i in range(int(input())):    n = int(input())
l = []
for j in range(n):        l.append(j + 1)
l.reverse()
if n % 2 == 0:        for
k in l: print(k) else:        x = n // 2
l[x], l[0] = l[0], l[x]
for k in l:            print(k)
