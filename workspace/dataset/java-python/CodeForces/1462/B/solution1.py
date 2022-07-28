for _ in range(int(input())):    n = int(input())
s = input()
t = []
a = s[:4]
t.append(a)
b = s[-4] + s[-3] + s[-2] + s[-1]
t.append(b)
c = s[0] + s[-3] + s[-2] + s[-1]
t.append(c)
d = s[:2] + s[-2] + s[-1]
t.append(d)
e = s[:3] + s[-1]
t.append(e)
if '2020' in t:
    print('YES')    else:
    print('NO')
