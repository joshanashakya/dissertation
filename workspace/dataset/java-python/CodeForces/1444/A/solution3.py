from sys import stdin, stdoutstdin.readlinedef
mp():
return list(map(int, stdin.readline().strip().split()))


def it(): return int(stdin.readline().strip())


from collections import defaultdict as dd, Counter as C 

def pf(n):    v = []


d = dd(lambda: 0)
while n % 2 == 0:        d[2] += 1
n //= 2
i = 3
while i * i <= n:        if
n % i == 0: d[i] += 1
n //= i else:            i += 1
if n > 2:        d[n] += 1
return dict(d) for _ in range(it()):    p, q = mp()
d = pf(q)
ans = q
ans = 1
for i, j in d.items():        k = p
while k % q == 0:            k //= i
ans = max(ans, k)
print(ans)
