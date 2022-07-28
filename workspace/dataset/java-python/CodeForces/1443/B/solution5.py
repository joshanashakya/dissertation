from sys import stdin, stdoutstdin.readlinedef
mp():
return list(map(int, stdin.readline().strip().split()))


def it(): return int(stdin.readline().strip())


from collections import defaultdict as dd, Counter as C, dequeimport

math for _ in range(it()):    a, b = mp()
l = input()
s = l.strip('0')
ind = 0
ans, flag = a, 0
for i in range(1, len(s)):        if
s[i] == '1' and flag == 0: k = i - ind
ans += min((k - 1) * b, a)
ind = i
flag = 1 elif s[i] == '1': k = i - ind
ans += min((k - 1) * b, a)
ind = i
if not flag:        if
s:
if s[0] == '1':
    print(a)            else:
    print(0) else:            print(0) else:        print(ans)  
