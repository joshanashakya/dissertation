n = int(input())
a = sorted(list(map(int, input().split())))
buket = sum(a)
chet = 0
nechet = 0
if buket % 2 == 0:    buket = 0
for x in a:        if
x % 2 == 0: chet += 1 else:            nechet += 1
if nechet != 0:        for
i in range(len(a)):
if a[i] % 2 != 0:                j = i
break
buket += a[i]
buket += sum(a[j + 1:])
print(buket)
