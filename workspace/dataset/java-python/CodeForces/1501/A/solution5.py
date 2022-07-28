T = int(input())
for t in range(T):
    n = int(input())
    a = []
    b = []
    for i in range(n):
        ai, bi = map(int, input().split())
        a.append(ai)
        b.append(bi)
    tm = list(map(int, input().split()))

    t = a[0] + tm[0]
    for i in range(n - 1):
        dep = max(b[i], t + (b[i] - a[i] + 1) // 2)
        t = dep + a[i + 1] - b[i] + tm[i + 1]
    print(t)
