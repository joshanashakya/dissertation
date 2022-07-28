from sys import stdin, stdoutfrom

math
import floor, gcd, fabs, factorial, fmod, sqrt, inf, logfrom

collections
import defaultdict as dd, dequefrom

heapq
import merge, heapify, heappop, heappush, nsmallestfrom

bisect
import bisect_left as bl, bisect_right as br, bisect

mod = pow(10, 9) + 7
mod2 = 998244353


def inp(): return stdin.readline().strip()


def iinp(): return int(inp())


def out(var, end="\n"): stdout.write(str(var) + "\n")


def outa(*var, end="\n"): stdout.write(' '.join(map(str, var)) + end)


def lmp(): return list(mp())


def mp(): return map(int, inp().split())


def smp(): return map(str, inp().split())


def l1d(n, val=0): return [val for i in range(n)]


def l2d(n, m, val=0): return [l1d(m, val) for j in range(n)]


def remadd(x, y): return 1 if x % y else 0


def ceil(a, b): return (a + b - 1) // b


def isprime(x):    if


x <= 1:
return False
if x in (2, 3): return True
if x % 2 == 0: return False
for i in range(3, int(sqrt(x)) + 1, 2):        if
x % i == 0:
return False
return True


def prs(s):    b = ""


for i in s:        if
i not in ";_-": b += i.lower()
return b
a = inp()
b = inp()
c = inp()
a = prs(a);
b = prs(b);
c = prs(c)
n = iinp()
for i in range(n):    x = inp()
x = prs(x)
print("ACC" if x in [a + b + c, a + c + b, b + a + c, b + c + a, c + a + b, c + b + a] else "WA")
