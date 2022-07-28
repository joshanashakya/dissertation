def g(t): return [(t[i] + t[i - 1]) // 2 for i in range(1, len(t))] + [1000000]


def h(a, b, c):    j = s = 0


for i in b:        while
i > c[j]: j += 1
s += abs(i - a[j])
return s n, k = map(int, input().split())
q = 'abcdefghijklmnopqrstuvwxyz'
s, a = 0, {i: [] for i in q}
for i, j in enumerate(input()): a[j].append(i)
c = {i: g(a[i]) for i in q} 

def f():    s, b = 0, {i: [] for i in q}


t = input()
for i, j in enumerate(t): b[j].append(i)
for i in q:        if
b[i]:
if a[i]:
    s += h(a[i], b[i], c[i])            else:
    s += len(t) * len(b[i])
return str(s) print('\n'.join(f() for i in range(n)))
