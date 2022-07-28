for _ in range(0, int(input())):    s, t = input(), input()
p, q = len(s), len(t)
while p != q:        if
p > q: q = q + len(t) else:            p = p + len(s)
f, g = (int(q / len(t)), int(p / len(s)))
if s * g == t * f:
    print(s * g)    else:
    print(-1)
