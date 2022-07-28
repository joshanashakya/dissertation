for t in range(int(input())):    n = int(input())
s = input()
r = [int(i) for i in s[0::2]]
b = [int(i) for i in s[1::2]]
win = 0
if n % 2 == 1:        win = 2
for i in r:            if
i % 2 == 1: win = 1
break else:        win = 1
for i in b:            if
i % 2 == 0: win = 2
break
print(win)
