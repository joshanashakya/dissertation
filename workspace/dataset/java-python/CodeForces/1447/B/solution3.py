R = lambda: map(int, input().split())
t, = R()
for _ in [0] * t: n, m = R();a = [];f = 0
for _ in [0] * n:  for
x in R(): a += abs(x),;
f ^= x < 0
print(sum(a) - 2 * min(a) * f)
