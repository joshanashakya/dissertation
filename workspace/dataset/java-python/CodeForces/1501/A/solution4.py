for time in range(int(input())):
    n, a, b = int(input()), [], []
    for i in range(n):
        ai, bi = map(int, input().split())
        a.append(ai)
        b.append(bi)
    tm = list(map(int, input().split()))
    time = a[0] + tm[0]
    for i in range(n - 1):
        dep = max(b[i], time + (b[i] - a[i] + 1) // 2)
        time = dep + a[i + 1] - b[i] + tm[i + 1]
    print(time)
