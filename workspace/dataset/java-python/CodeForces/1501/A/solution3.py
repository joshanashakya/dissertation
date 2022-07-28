for _ in range(int(input())):
    n = int(input())
    a = []
    b = []
    for _ in range(n):
        i, j = map(int, input().split())
        a += [i]
        b += [j]
    t = list(map(int, input().split()))
    c = a[0] + t[0]
    for i in range(n - 1):
        c = max(c + (b[i] - a[i] + 1) // 2, b[i])
        c += a[i + 1] - b[i] + t[i + 1]
    print(c)
