def prime(m):    for


i in range(2, m):
if m % i == 0:            return False
return True
t = int(input())
for z in range(t):    d = int(input())
x = 1
ans = 1
for i in range(x + d, 10 ** 9):        if
prime(i): x = i
ans *= x
break
for i in range(x + d, 10 ** 9):        if
prime(i): x = i
ans *= x
break
print(ans)
