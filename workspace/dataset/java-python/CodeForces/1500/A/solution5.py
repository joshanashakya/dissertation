import sys

sys.setrecursionlimit(10 ** 5)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")


def II(): return int(sys.stdin.buffer.readline())


def MI(): return map(int, sys.stdin.buffer.readline().split())


def LI(): return list(map(int, sys.stdin.buffer.readline().split()))


def LLI(rows_number): return [LI() for _ in range(rows_number)]


def BI(): return sys.stdin.buffer.readline().rstrip()


def SI(): return sys.stdin.buffer.readline().rstrip().decode()


inf = 10 ** 16
md = 10 ** 9 + 7
# md = 998244353

from collections import defaultdict

n = II()
aa = LI()

if n < 2500:
    ss = defaultdict(list)
    for j in range(n):
        for i in range(j):
            ss[aa[i] + aa[j]].append((i, j))

    for ij in ss.values():
        if len(ij) < 2: continue
        for x in range(len(ij)):
            i0, j0 = ij[x]
            for y in range(x):
                i1, j1 = ij[y]
                if len(set([i0, j0, i1, j1])) == 4:
                    print("YES")
                    print(i0 + 1, j0 + 1, i1 + 1, j1 + 1)
                    exit()

    print("NO")

else:
    dd = {}
    ai = [(a, i) for i, a in enumerate(aa)]
    ai.sort(key=lambda x: x[0])
    for i in range(n - 1):
        d = ai[i + 1][0] - ai[i][0]
        if d in dd:
            j = dd[d]
            if j + 1 == i: continue
            x = ai[j][1]
            y = ai[j + 1][1]
            z = ai[i][1]
            w = ai[i + 1][1]
            print("YES")
            print(x + 1, w + 1, y + 1, z + 1)
            exit()
        else:
            dd[d] = i
