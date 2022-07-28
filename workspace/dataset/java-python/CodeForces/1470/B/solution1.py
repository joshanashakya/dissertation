import sysinput = sys.stdin.readlinefrom
collections
import *  

class Fast_factorize:    def


__init__(self, n): self.p = [-1] * (n + 1)
for i in range(2, n + 1):            if
self.p[i] == -1:
for j in range(i, n + 1, i):                    if
self.p[j] == -1: self.p[j] = i


def factorize(self, n):        res = []


while n > 1:            res.append(self.p[n])
n //= self.p[n]
return res
ff = Fast_factorize(10 ** 6) for _ in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
cnt = defaultdict(int)
for ai in a:        fct = Counter(ff.factorize(ai))
key = 1
for p, c in fct.items():            if
c % 2 == 1: key *= p
cnt[key] += 1
a, b = 0, 0
for k, v in cnt.items():        a = max(a, v)
if k == 1 or v % 2 == 0:            b += v
q = int(input())
for _ in range(q):        w = int(input())
if w == 0:
    print(a)        else:
    print(max(a, b))
